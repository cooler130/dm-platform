package com.cooler.ai.platform.facade.impl;

import com.cooler.ai.platform.entity.Action;
import com.cooler.ai.platform.facade.model.*;
import com.cooler.ai.platform.service.framework.*;
import com.cooler.ai.platform.facade.DMFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import java.util.Map;

/**
 * Created by zhangsheng on 2018/5/21.
 */
@Component("dmFacade")
public class DMFacadeImpl implements DMFacade {

    @Qualifier("dstJsonService")
    @Autowired
    private DSTService dstService;                                                                                      //3.有限状态机服务

    @Qualifier("policyProcessJsonService")
    @Autowired
    private PolicyProcessService policyProcessService;                                                                  //4.动作选择、执行服务（两个版本：db版和json版）

    //下面3个是调试所使用的组件
    @Qualifier("dstService")
    @Autowired
    private DSTService dstService2;                                                                                     //3.有限状态机服务

    @Qualifier("policyProcessService")
    @Autowired
    private PolicyProcessService policyProcessService2;                                                                 //4.动作选择、执行服务（两个版本：db版和json版）

    @Autowired
    private DataStoreService dataStoreService;                                                                          //5.数据保存服务

    @Override
    public DMResponse process(DistributionData distributionData) {

        long startTimeStamp = System.currentTimeMillis();

        DMRequest dmRequest = distributionData.getDmRequest();
        DialogState dialogState = distributionData.getDialogState();
        Map<String, BizDataModelState<String>> bizDataMSMap = distributionData.getBizDataMSMap();
        Action startAction = null;
        DMResponse dmResponse = null;

        if(!dmRequest.isDebugModel()){                                                                                  //非调试状态，后端接入的是json文件内部数据（用于正式环境）

            dstService.fsmDSTProcess(dmRequest, dialogState, bizDataMSMap);                                                               //  3.状态检测、迁移过程追踪（DST过程），检测各个槽位的状态，以及迁移过程，得到最终状态

            startAction = policyProcessService.queryPolicy(dialogState);                                                    //  4.根据策略，查询动作

            dmResponse = policyProcessService.runActions(dmRequest, dialogState, startAction, bizDataMSMap);                //  5.执行动作（globalMap会记录中间产生的链式动作集合），这个过程bizDataMSMap会新增各个业务参数，它是一个增量集合

        } else {                                                                                                        //调试状态，后端接入的是数据库中的数据（用于线下测试环境和管理环境）

            dstService2.fsmDSTProcess(dmRequest, dialogState, bizDataMSMap);                  //todo:还是要在这里输入bizDataMSMap，在各个dataTaskAction中也设计到业务数据的修改了

            startAction = policyProcessService2.queryPolicy(dialogState);

            dmResponse = policyProcessService2.runActions(dmRequest, dialogState, startAction, bizDataMSMap);

        }

        dataStoreService.storeData(dmRequest, dialogState, bizDataMSMap);                                                              //6.保存数据，下一轮需要的DialogState（同步进行）

        long endTimeStamp = System.currentTimeMillis();

        return dmResponse;
    }

}
