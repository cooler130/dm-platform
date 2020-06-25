package com.cooler.ai.platform.facade.model;

import java.util.List;
import java.util.Map;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class DMResponse implements java.io.Serializable{
    private int code;
    private String msg;
    private String dmName;
    private String sessionId;
    private int turnNum;
    private List<Message> data;
    private String dialogActName;                   //bot对话行为.
    private Map<String, String> extMap;             //扩展字段Map

    private long receiveTime;
    private long returnTime;

    public DMResponse() {
    }

    public DMResponse(int code, String msg, String dmName, String sessionId, int turnNum, List<Message> data, String dialogActName, Map<String, String> extMap, long receiveTime, long returnTime) {
        this.code = code;
        this.msg = msg;
        this.dmName = dmName;
        this.sessionId = sessionId;
        this.turnNum = turnNum;
        this.data = data;
        this.dialogActName = dialogActName;
        this.extMap = extMap;
        this.receiveTime = receiveTime;
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "DMResponse{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", dmName='" + dmName + '\'' +
                ", sessionId='" + sessionId + '\'' +
                ", turnNum='" + turnNum + '\'' +
                ", data=" + data +
                ", dialogActName='" + dialogActName + '\'' +
                ", extMap=" + extMap +
                ", receiveTime=" + receiveTime +
                ", returnTime=" + returnTime +
                '}';
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getDmName() {
        return dmName;
    }

    public void setDmName(String dmName) {
        this.dmName = dmName;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getTurnNum() {
        return turnNum;
    }

    public void setTurnNum(int turnNum) {
        this.turnNum = turnNum;
    }

    public List<Message> getData() {
        return data;
    }

    public void setData(List<Message> data) {
        this.data = data;
    }

    public String getDialogActName() {
        return dialogActName;
    }

    public void setDialogActName(String dialogActName) {
        this.dialogActName = dialogActName;
    }

    public Map<String, String> getExtMap() {
        return extMap;
    }

    public void setExtMap(Map<String, String> extMap) {
        this.extMap = extMap;
    }

    public long getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(long receiveTime) {
        this.receiveTime = receiveTime;
    }

    public long getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(long returnTime) {
        this.returnTime = returnTime;
    }
}
