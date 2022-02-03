package com.cooler.ai.platform.facade.model;

import java.util.List;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class Message implements java.io.Serializable{
    private String messageType;
    private String messageData;
    private String lastFromStateId;
    private String fromStateId;
    private String fromStateId2;
    private String intentCondition;
    private String toStateId;

    public Message() {
    }

    public Message(String messageType, String messageData) {
        this.messageType = messageType;
        this.messageData = messageData;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }

    public String getMessageData() {
        return messageData;
    }

    public void setMessageData(String messageData) {
        this.messageData = messageData;
    }

    public String getLastFromStateId() {
        return lastFromStateId;
    }

    public void setLastFromStateId(String lastFromStateId) {
        this.lastFromStateId = lastFromStateId;
    }

    public String getFromStateId() {
        return fromStateId;
    }

    public void setFromStateId(String fromStateId) {
        this.fromStateId = fromStateId;
    }

    public String getFromStateId2() {
        return fromStateId2;
    }

    public void setFromStateId2(String fromStateId2) {
        this.fromStateId2 = fromStateId2;
    }

    public String getToStateId() {
        return toStateId;
    }

    public void setToStateId(String toStateId) {
        this.toStateId = toStateId;
    }

    public String getIntentCondition() {
        return intentCondition;
    }

    public void setIntentCondition(String intentCondition) {
        this.intentCondition = intentCondition;
    }
}
