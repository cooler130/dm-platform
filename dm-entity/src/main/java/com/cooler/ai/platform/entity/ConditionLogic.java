package com.cooler.ai.platform.entity;

public class ConditionLogic {
    private Integer id;

    private String name;

    private Integer transitionId;

    private Integer conditionRuleId;

    private Integer logicType;

    private Byte nopassNotice;

    private Integer groupNum;

    private Integer enable;

    private String msg;

    public ConditionLogic(Integer id, String name, Integer transitionId, Integer conditionRuleId, Integer logicType, Byte nopassNotice, Integer groupNum, Integer enable, String msg) {
        this.id = id;
        this.name = name;
        this.transitionId = transitionId;
        this.conditionRuleId = conditionRuleId;
        this.logicType = logicType;
        this.nopassNotice = nopassNotice;
        this.groupNum = groupNum;
        this.enable = enable;
        this.msg = msg;
    }

    public ConditionLogic() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTransitionId() {
        return transitionId;
    }

    public void setTransitionId(Integer transitionId) {
        this.transitionId = transitionId;
    }

    public Integer getConditionRuleId() {
        return conditionRuleId;
    }

    public void setConditionRuleId(Integer conditionRuleId) {
        this.conditionRuleId = conditionRuleId;
    }

    public Integer getLogicType() {
        return logicType;
    }

    public void setLogicType(Integer logicType) {
        this.logicType = logicType;
    }

    public Byte getNopassNotice() {
        return nopassNotice;
    }

    public void setNopassNotice(Byte nopassNotice) {
        this.nopassNotice = nopassNotice;
    }

    public Integer getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(Integer groupNum) {
        this.groupNum = groupNum;
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