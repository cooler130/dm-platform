package com.cooler.ai.platform.facade.model;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class ClientInfo implements java.io.Serializable{
    private String clientId;
    private String clientName;
    private String clientType;
    private String channel;

    public ClientInfo() {
    }

    public ClientInfo(String clientId, String clientName, String clientType, String channel) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.clientType = clientType;
        this.channel = channel;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getClientType() {
        return clientType;
    }

    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }
}
