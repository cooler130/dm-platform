package com.cooler.ai.platform.facade.impl;

import com.cooler.ai.platform.entity.Action;
import com.cooler.ai.platform.facade.constance.Constant;
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
        String debugModel = dmRequest.isDebugModel();
        debugModel = (debugModel == null ? Constant.MODEL_RDB : debugModel);

        if(debugModel.equals(Constant.MODEL_KVDB)){                                                                                  //KV模式，通常是线上状态，后端读入json文件内部数据

            dstService.fsmDSTProcess(dmRequest, dialogState, bizDataMSMap);                                             //  3.状态检测、迁移过程追踪（DST过程），检测各个槽位的状态，以及迁移过程，得到最终状态

            startAction = policyProcessService.queryPolicy(dialogState);                                                //  4.根据策略，查询动作

            dmResponse = policyProcessService.runActions(dmRequest, dialogState, startAction, bizDataMSMap);            //  5.执行动作（globalMap会记录中间产生的链式动作集合），这个过程bizDataMSMap会新增各个业务参数，它是一个增量集合

        } else if(debugModel.equals(Constant.MODEL_RDB)){                                                                            //调试状态，后端接入的是数据库中的数据（用于线下测试环境和管理环境）

            dstService2.fsmDSTProcess(dmRequest, dialogState, bizDataMSMap);

            startAction = policyProcessService2.queryPolicy(dialogState);

            dmResponse = policyProcessService2.runActions(dmRequest, dialogState, startAction, bizDataMSMap);

        } else if(debugModel.equals(Constant.MODEL_GDB)){                                                                           //创新方式1尝试
            //todo:图数据库模式
        } else if(debugModel.equals(Constant.MODEL_TREE)){                                                                          //创新方式2尝试
            //todo：树数据模式
        }

        dataStoreService.storeData(dmRequest, dialogState, bizDataMSMap);                                               //  6.保存数据，下一轮需要的DialogState（同步进行）

        long endTimeStamp = System.currentTimeMillis();

        return dmResponse;
    }

}
