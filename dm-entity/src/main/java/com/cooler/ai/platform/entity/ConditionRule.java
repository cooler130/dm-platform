package com.cooler.ai.platform.entity;

public class ConditionRule {
    private Integer id;

    private String conditionName;

    private Integer paramType;

    private String paramName;

    private Integer taskId;

    private Integer ruleType;

    private Float beliefThreshold;

    private String checkValue;

    private Integer checkRelationType;

    private String checkFunctionCode;

    private Integer recommendId;

    private Integer enable;

    private String msg;

    public ConditionRule(Integer id, String conditionName, Integer paramType, String paramName, Integer taskId, Integer ruleType, Float beliefThreshold, String checkValue, Integer checkRelationType, String checkFunctionCode, Integer recommendId, Integer enable, String msg) {
        this.id = id;
        this.conditionName = conditionName;
        this.paramType = paramType;
        this.paramName = paramName;
        this.taskId = taskId;
        this.ruleType = ruleType;
        this.beliefThreshold = beliefThreshold;
        this.checkValue = checkValue;
        this.checkRelationType = checkRelationType;
        this.checkFunctionCode = checkFunctionCode;
        this.recommendId = recommendId;
        this.enable = enable;
        this.msg = msg;
    }

    public ConditionRule() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getConditionName() {
        return conditionName;
    }

    public void setConditionName(String conditionName) {
        this.conditionName = conditionName == null ? null : conditionName.trim();
    }

    public Integer getParamType() {
        return paramType;
    }

    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    public String getParamName() {
        return paramName;
    }

    public void setParamName(String paramName) {
        this.paramName = paramName == null ? null : paramName.trim();
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public Integer getRuleType() {
        return ruleType;
    }

    public void setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
    }

    public Float getBeliefThreshold() {
        return beliefThreshold;
    }

    public void setBeliefThreshold(Float beliefThreshold) {
        this.beliefThreshold = beliefThreshold;
    }

    public String getCheckValue() {
        return checkValue;
    }

    public void setCheckValue(String checkValue) {
        this.checkValue = checkValue == null ? null : checkValue.trim();
    }

    public Integer getCheckRelationType() {
        return checkRelationType;
    }

    public void setCheckRelationType(Integer checkRelationType) {
        this.checkRelationType = checkRelationType;
    }

    public String getCheckFunctionCode() {
        return checkFunctionCode;
    }

    public void setCheckFunctionCode(String checkFunctionCode) {
        this.checkFunctionCode = checkFunctionCode == null ? null : checkFunctionCode.trim();
    }

    public Integer getRecommendId() {
        return recommendId;
    }

    public void setRecommendId(Integer recommendId) {
        this.recommendId = recommendId;
    }

    public Integer getEnable() {
        return enable;
    }

    public void setEnable(Integer enable) {
        this.enable = enable;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}