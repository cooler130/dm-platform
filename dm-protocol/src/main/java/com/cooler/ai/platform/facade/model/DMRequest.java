package com.cooler.ai.platform.facade.model;

import java.util.Map;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class DMRequest implements java.io.Serializable{
    private ClientInfo clientInfo;
    private UserInfo userInfo;
    private LocationInfo locationInfo;
    private String queryType;
    private String queryMessage;
    private Map<String, String> metaData;
    private long timestamp;
    private String sessionId;
    private NLUData nluData;
    private String debugModel;

    private DomainTaskData domainTaskData;

    public DMRequest() {
    }

    public DMRequest(ClientInfo clientInfo, UserInfo userInfo, LocationInfo locationInfo, String queryType, String queryMessage, Map<String, String> metaData, long timestamp, String sessionId, NLUData nluData, String debugModel) {
        this.clientInfo = clientInfo;
        this.userInfo = userInfo;
        this.locationInfo = locationInfo;
        this.queryType = queryType;
        this.queryMessage = queryMessage;
        this.metaData = metaData;
        this.timestamp = timestamp;
        this.sessionId = sessionId;
        this.nluData = nluData;
        this.debugModel = debugModel;
    }

    public ClientInfo getClientInfo() {
        return clientInfo;
    }

    public void setClientInfo(ClientInfo clientInfo) {
        this.clientInfo = clientInfo;
    }

    public UserInfo getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    public LocationInfo getLocationInfo() {
        return locationInfo;
    }

    public void setLocationInfo(LocationInfo locationInfo) {
        this.locationInfo = locationInfo;
    }

    public String getQueryType() {
        return queryType;
    }

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    public String getQueryMessage() {
        return queryMessage;
    }

    public void setQueryMessage(String queryMessage) {
        this.queryMessage = queryMessage;
    }

    public Map<String, String> getMetaData() {
        return metaData;
    }

    public void setMetaData(Map<String, String> metaData) {
        this.metaData = metaData;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public DomainTaskData getDomainTaskData() {
        return domainTaskData;
    }

    public void setDomainTaskData(DomainTaskData domainTaskData) {
        this.domainTaskData = domainTaskData;
    }

    public NLUData getNluData() {
        return nluData;
    }

    public void setNluData(NLUData nluData) {
        this.nluData = nluData;
    }

    public String isDebugModel() {
        return debugModel;
    }

    public void setDebugModel(String debugModel) {
        this.debugModel = debugModel;
    }
}
