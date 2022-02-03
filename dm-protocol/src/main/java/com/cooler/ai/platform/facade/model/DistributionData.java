package com.cooler.ai.platform.facade.model;

import java.io.Serializable;
import java.util.Map;

public class DistributionData implements Serializable {

    private DMRequest dmRequest;

    private DialogState dialogState;

    private Map<String, BizDataModelState<String>> bizDataMSMap;

    public DistributionData(DMRequest dmRequest, DialogState dialogState, Map<String, BizDataModelState<String>> bizDataMSMap) {
        this.dmRequest = dmRequest;
        this.dialogState = dialogState;
        this.bizDataMSMap = bizDataMSMap;
    }

    public DMRequest getDmRequest() {
        return dmRequest;
    }

    public void setDmRequest(DMRequest dmRequest) {
        this.dmRequest = dmRequest;
    }

    public DialogState getDialogState() {
        return dialogState;
    }

    public void setDialogState(DialogState dialogState) {
        this.dialogState = dialogState;
    }

    public Map<String, BizDataModelState<String>> getBizDataMSMap() {
        return bizDataMSMap;
    }

    public void setBizDataMSMap(Map<String, BizDataModelState<String>> bizDataMSMap) {
        this.bizDataMSMap = bizDataMSMap;
    }
}
