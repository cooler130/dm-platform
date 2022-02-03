package com.cooler.ai.platform.facade.model;

import java.io.Serializable;

/**
 * Created by zhangsheng on 2018/6/1.
 */
public class BizDataModelState<T> implements ModelState<T>, Serializable {
    /**
     * 说明：
     * 这个业务数据是在对话sessionId下第turnNum轮产生的；                                （这两个量是对人能理解的定位的量，代表第sessionId次人机对话的第几轮对话）
     * 其被认定为{domainName + taskName} 话题下第 domainTaskTurnNum 轮的业务数据；         （这两个量是对机器能理解的定位量，代表这个数据是认定为domainName+taskId话题下第domainTaskTurnNum轮对话产生的业务数据）
     * 在botName这个bot里面得到；                                                     （这个是用来定位物理bot的量，代表是哪个bot产生了这个业务数据）
     * 数据名称为 bizItemName ，值为t，此数据在话题范畴能持续 keepDomainTaskTurnCount轮；  （这3个量是这个业务数据的本体，分别为名称、值、作用轮次）
     */

    private String sessionId = null;
    private int turnNum = -1;

    private String domainName = null;
    private String taskName = null;
    private int domainTaskTurnNum = -1;

    private String botName = null;

    private String bizItemName = null;                                              //业务项名称
    private T t = null;                                                             //业务项值
    private int keepDomainTaskTurnCount = 0;                                        //特意保留的轮次（默认不保留/不记忆）

    public BizDataModelState(String sessionId, int turnNum, String domainName, String taskName, int domainTaskTurnNum, String botName, String bizItemName, T t, int keepDomainTaskTurnCount) {
        this.sessionId = sessionId;
        this.turnNum = turnNum;
        this.domainName = domainName;
        this.taskName = taskName;
        this.domainTaskTurnNum = domainTaskTurnNum;
        this.botName = botName;
        this.bizItemName = bizItemName;
        this.t = t;
        this.keepDomainTaskTurnCount = keepDomainTaskTurnCount;
    }

    @Override
    public T getT() {
        return t;
    }

    @Override
    public void setT(T t) {
        this.t = t;
    }

    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public int getDomainTaskTurnNum() {
        return domainTaskTurnNum;
    }

    public void setDomainTaskTurnNum(int domainTaskTurnNum) {
        this.domainTaskTurnNum = domainTaskTurnNum;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getBotName() {
        return botName;
    }

    public void setBotName(String botName) {
        this.botName = botName;
    }

    public String getBizItemName() {
        return bizItemName;
    }

    public void setBizItemName(String bizItemName) {
        this.bizItemName = bizItemName;
    }

    public int getKeepDomainTaskTurnCount() {
        return keepDomainTaskTurnCount;
    }

    public void setKeepDomainTaskTurnCount(int keepDomainTaskTurnCount) {
        this.keepDomainTaskTurnCount = keepDomainTaskTurnCount;
    }

    public int getTurnNum() {
        return turnNum;
    }

    public void setTurnNum(int turnNum) {
        this.turnNum = turnNum;
    }
}
