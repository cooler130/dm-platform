package com.cooler.ai.platform.entity;

public class State {
    private Integer id;

    private String stateName;

    private Integer domainId;

    private String domain;

    private Integer stateState;

    private Integer enable;

    private String msg;

    public State(Integer id, String stateName, Integer domainId, String domain, Integer stateState, Integer enable, String msg) {
        this.id = id;
        this.stateName = stateName;
        this.domainId = domainId;
        this.domain = domain;
        this.stateState = stateState;
        this.enable = enable;
        this.msg = msg;
    }

    public State() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName == null ? null : stateName.trim();
    }

    public Integer getDomainId() {
        return domainId;
    }

    public void setDomainId(Integer domainId) {
        this.domainId = domainId;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain == null ? null : domain.trim();
    }

    public Integer getStateState() {
        return stateState;
    }

    public void setStateState(Integer stateState) {
        this.stateState = stateState;
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