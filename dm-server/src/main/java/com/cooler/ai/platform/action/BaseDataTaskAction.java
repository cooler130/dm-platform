package com.cooler.ai.platform.action;

import com.cooler.ai.platform.facade.constance.Constant;
import com.cooler.ai.platform.facade.model.BizDataModelState;
import com.cooler.ai.platform.facade.model.DMRequest;
import com.cooler.ai.platform.facade.model.DialogState;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2019/9/25
 **/

public class BaseDataTaskAction extends BaseTaskAction implements DataTaskAction<DMRequest, DialogState, BizDataModelState<String>>  {

    //数据在获取之前的预处理工作，预处理工作不一定只对当前数据本身预处理，整个DS的参数都可以预处理，处理后当前数据可能会受到影响（有必要则实现，无必要则不用管它，由各个子类重写来实现）
    @Override
    public void preprocess() {  }

    //业务数据获取，则由各个子类重写来实现
    @Override
    public String getParamValue() {
        return null;
    }

    /**
     * 工具方法，如果在preprocess方法中产生了新的数据（可能是业务数据，需要在preprocess()方法中调用此方法来更新DS中和bizDataMSMap中的数据
     * @param paramsName
     * @param paramValue
     * @param keepTurnCount
     */
    public void addToParamValueAndBizDataMap(String paramsName, String paramValue, Integer paramType, int keepTurnCount){
        dialogState.addToParamValueMap(paramsName, paramValue, paramType);

        //这里是新产生的业务数据，需要将其保持到业务数据池中.
        if(paramType == Constant.BIZ_PARAM){
            bizDataMSMap.put(paramsName, new BizDataModelState<>(
                    dialogState.getSessionId(),
                    dialogState.getTotalTurnNum(),
                    dialogState.getDomainName(),
                    dialogState.getTaskName(),
                    dialogState.getDomainTaskTurnNum(),
                    dialogState.getBotName(),
                    paramsName,
                    paramValue,
                    keepTurnCount));
        }
    }

}
