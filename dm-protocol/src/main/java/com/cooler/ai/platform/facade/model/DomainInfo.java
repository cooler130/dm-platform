package com.cooler.ai.platform.facade.model;

import java.util.Map;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class DomainInfo implements java.io.Serializable{
    private int requestID = -1;                 // 请求ID
    private String domainName;                  // 领域
    private String intentName;                  // 意图
    private double score;                       // 结果得分
    private Map<Integer, SlotInfo> slots;     // 填槽结果
    private String utterance;                   // 原文
    private String uttSegment;                  // 原文分词
    private String uttPos;                      // 原文词性
    private int errCode = 0;                    // 错误代码(TODO)
    private String errMsg = "";

    public DomainInfo() {
    }

    public DomainInfo(int requestID, String domainName, String intentName, double score, Map<Integer, SlotInfo> slots, String utterance, String uttSegment, String uttPos, int errCode, String errMsg) {
        this.requestID = requestID;
        this.domainName = domainName;
        this.intentName = intentName;
        this.score = score;
        this.slots = slots;
        this.utterance = utterance;
        this.uttSegment = uttSegment;
        this.uttPos = uttPos;
        this.errCode = errCode;
        this.errMsg = errMsg;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getIntentName() {
        return intentName;
    }

    public void setIntentName(String intentName) {
        this.intentName = intentName;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public Map<Integer, SlotInfo> getSlots() {
        return slots;
    }

    public void setSlots(Map<Integer, SlotInfo> slots) {
        this.slots = slots;
    }

    public String getUtterance() {
        return utterance;
    }

    public void setUtterance(String utterance) {
        this.utterance = utterance;
    }

    public String getUttSegment() {
        return uttSegment;
    }

    public void setUttSegment(String uttSegment) {
        this.uttSegment = uttSegment;
    }

    public String getUttPos() {
        return uttPos;
    }

    public void setUttPos(String uttPos) {
        this.uttPos = uttPos;
    }

    public int getErrCode() {
        return errCode;
    }

    public void setErrCode(int errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }
}
