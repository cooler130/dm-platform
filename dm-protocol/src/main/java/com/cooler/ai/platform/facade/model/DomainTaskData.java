package com.cooler.ai.platform.facade.model;

import java.util.HashMap;
import java.util.Map;

public class DomainTaskData implements java.io.Serializable{
    private String sessionId = null;
    private int totalTurnNum = 0;
    Map<String, Integer> turnNumMap = new HashMap<>();                      //Map<domainName_taskId, turnNum1> + Map<domainName, turnNum2>

    public DomainTaskData(String sessionId, int totalTurnNum, Map<String, Integer> turnNumMap) {
        this.sessionId = sessionId;
        this.totalTurnNum = totalTurnNum;
        this.turnNumMap = turnNumMap;
    }

    public void increaseTurnNum(String domainName, String taskName){
        this.totalTurnNum ++;

        Integer domainTurnNum = this.turnNumMap.get(domainName);
        domainTurnNum = domainTurnNum != null ? domainTurnNum + 1 : 1;
        this.turnNumMap.put(domainName, domainTurnNum);

        String topic = domainName + "::" + taskName;
        Integer domainTaskTurnNum = this.turnNumMap.get(topic);
        domainTaskTurnNum = domainTaskTurnNum != null ? domainTaskTurnNum + 1 : 1;
        this.turnNumMap.put(topic, domainTaskTurnNum);
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public int getTotalTurnNum() {
        return totalTurnNum;
    }

    public void setTotalTurnNum(int totalTurnNum) {
        this.totalTurnNum = totalTurnNum;
    }

    public Map<String, Integer> getTurnNumMap() {
        return turnNumMap;
    }

    public void setTurnNumMap(Map<String, Integer> turnNumMap) {
        this.turnNumMap = turnNumMap;
    }
}
