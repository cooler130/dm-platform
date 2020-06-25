package com.cooler.ai.platform.entity;

public class Transition {
    private Integer id;

    private String transitionName;

    private Integer startStateId;

    private Integer endStateId;

    private String taskName;

    private String relatedIntentNames;

    private Integer enable;

    private String msg;

    public Transition(Integer id, String transitionName, Integer startStateId, Integer endStateId, String taskName, String relatedIntentNames, Integer enable, String msg) {
        this.id = id;
        this.transitionName = transitionName;
        this.startStateId = startStateId;
        this.endStateId = endStateId;
        this.taskName = taskName;
        this.relatedIntentNames = relatedIntentNames;
        this.enable = enable;
        this.msg = msg;
    }

    public Transition() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransitionName() {
        return transitionName;
    }

    public void setTransitionName(String transitionName) {
        this.transitionName = transitionName == null ? null : transitionName.trim();
    }

    public Integer getStartStateId() {
        return startStateId;
    }

    public void setStartStateId(Integer startStateId) {
        this.startStateId = startStateId;
    }

    public Integer getEndStateId() {
        return endStateId;
    }

    public void setEndStateId(Integer endStateId) {
        this.endStateId = endStateId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName == null ? null : taskName.trim();
    }

    public String getRelatedIntentNames() {
        return relatedIntentNames;
    }

    public void setRelatedIntentNames(String relatedIntentNames) {
        this.relatedIntentNames = relatedIntentNames == null ? null : relatedIntentNames.trim();
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