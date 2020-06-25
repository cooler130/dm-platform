package com.cooler.ai.platform.facade.model;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class UserInfo implements java.io.Serializable{
    private String userId;
    private String userName;
    private String token;

    public UserInfo() {
    }

    public UserInfo(String userId, String userName, String token) {
        this.userId = userId;
        this.userName = userName;
        this.token = token;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
