package com.cooler.ai.platform.entity;

public class TransformRelation {
    private Integer id;

    private String transformRelationName;

    private Integer contextStateId;

    private String contextIntentNames;

    private String transformIntentName;

    private Byte enable;

    private String msg;

    public TransformRelation(Integer id, String transformRelationName, Integer contextStateId, String contextIntentNames, String transformIntentName, Byte enable, String msg) {
        this.id = id;
        this.transformRelationName = transformRelationName;
        this.contextStateId = contextStateId;
        this.contextIntentNames = contextIntentNames;
        this.transformIntentName = transformIntentName;
        this.enable = enable;
        this.msg = msg;
    }

    public TransformRelation() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTransformRelationName() {
        return transformRelationName;
    }

    public void setTransformRelationName(String transformRelationName) {
        this.transformRelationName = transformRelationName == null ? null : transformRelationName.trim();
    }

    public Integer getContextStateId() {
        return contextStateId;
    }

    public void setContextStateId(Integer contextStateId) {
        this.contextStateId = contextStateId;
    }

    public String getContextIntentNames() {
        return contextIntentNames;
    }

    public void setContextIntentNames(String contextIntentNames) {
        this.contextIntentNames = contextIntentNames == null ? null : contextIntentNames.trim();
    }

    public String getTransformIntentName() {
        return transformIntentName;
    }

    public void setTransformIntentName(String transformIntentName) {
        this.transformIntentName = transformIntentName == null ? null : transformIntentName.trim();
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