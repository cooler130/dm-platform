package com.cooler.ai.platform.entity;

public class ConditionKV {
    private Integer id;

    private Integer policyId;

    private String conditionKey;

    private Integer relationship;

    private String conditionValue;

    private Integer groupNum;

    private Byte logicType;

    private Byte enable;

    private String msg;

    public ConditionKV(Integer id, Integer policyId, String conditionKey, Integer relationship, String conditionValue, Integer groupNum, Byte logicType, Byte enable, String msg) {
        this.id = id;
        this.policyId = policyId;
        this.conditionKey = conditionKey;
        this.relationship = relationship;
        this.conditionValue = conditionValue;
        this.groupNum = groupNum;
        this.logicType = logicType;
        this.enable = enable;
        this.msg = msg;
    }

    public ConditionKV() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    public String getConditionKey() {
        return conditionKey;
    }

    public void setConditionKey(String conditionKey) {
        this.conditionKey = conditionKey == null ? null : conditionKey.trim();
    }

    public Integer getRelationship() {
        return relationship;
    }

    public void setRelationship(Integer relationship) {
        this.relationship = relationship;
    }

    public String getConditionValue() {
        return conditionValue;
    }

    public void setConditionValue(String conditionValue) {
        this.conditionValue = conditionValue == null ? null : conditionValue.trim();
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
    }

    public Byte getLogicType() {
        return logicType;
    }

    public void setLogicType(Byte logicType) {
        this.logicType = logicType;
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