package com.cooler.ai.platform.entity;

import com.cooler.ai.platform.model.EntityConstant;

public class Policy {
    private Integer id;

    private String policyName;

    private String intentName;

    private Integer stateId;

    private Integer startActionId;

    private Byte enable;

    private String msg;

    private static Policy defaultPolicy = new Policy(EntityConstant.DEFAULT_POLICY_ID, "默认兜底策略", EntityConstant.NO_INTENT, EntityConstant.END_STATE_ID, EntityConstant.DEFAULT_ACTION_ID, (byte)1, "默认兜底策略");

    public Policy(Integer id, String policyName, String intentName, Integer stateId, Integer startActionId, Byte enable, String msg) {
        this.id = id;
        this.policyName = policyName;
        this.intentName = intentName;
        this.stateId = stateId;
        this.startActionId = startActionId;
        this.enable = enable;
        this.msg = msg;
    }

    public Policy() {
        super();
    }

    public static Policy getDefaultPolicy(){
        return defaultPolicy;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPolicyName() {
        return policyName;
    }

    public void setPolicyName(String policyName) {
        this.policyName = policyName == null ? null : policyName.trim();
    }

    public String getIntentName() {
        return intentName;
    }

    public void setIntentName(String intentName) {
        this.intentName = intentName == null ? null : intentName.trim();
    }

    public Integer getStateId() {
        return stateId;
    }

    public void setStateId(Integer stateId) {
        this.stateId = stateId;
    }

    public Integer getStartActionId() {
        return startActionId;
    }

    public void setStartActionId(Integer startActionId) {
        this.startActionId = startActionId;
    }

    public Byte getEnable() {
        return enable;
    }

    public void setEnable(Byte enable) {
        this.enable = enable;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}