package com.cooler.ai.platform.facade.model;

import java.util.Map;

/**
 * Created by zhangsheng on 2018/9/14.
 */
public class DomainData {

    private String sessionId = null;
    private int turnNum = -1;

    private String sentence = null;
    private String nluDomainName = null;
    private String nluIntentName = null;
    private String domainName = null;
    private String intentName = null;
    private Integer intentId = null;
    private String taskName = null;
    private Integer lastFromStateId = null;
    private Integer fromStateId = null;                                                                                 //此轮的fromStateId一开始为lastToStateId，后面可能会变。
    private Boolean sameDomain = false;

    private Map<String, SlotState> historySlotStateMap = null;                                                          //装载Language分发数据体
    private Map<String, SlotState> currentSlotStateMap = null;
    private Map<String, String> exchangedRecordMap = null;
    private Map<String, SlotState> fixedSlotStateMap = null;
    private Map<String, SlotState> unknownSlotStateMap = null;

    private Map<String, String> fixedParamValueMap = null;                                                               //直接装载nonLanguage分发数据体

    public DomainData(String sessionId, int turnNum, String sentence, String nluDomainName, String nluIntentName, String domainName, String intentName, Integer intentId, String taskName, Integer lastFromStateId, Integer fromStateId, Boolean sameDomain, Map<String, SlotState> historySlotStateMap, Map<String, SlotState> currentSlotStateMap, Map<String, String> exchangedRecordMap, Map<String, SlotState> fixedSlotStateMap, Map<String, SlotState> unknownSlotStateMap, Map<String, String> fixedParamValueMap) {
        this.sessionId = sessionId;
        this.turnNum = turnNum;
        this.sentence = sentence;
        this.nluDomainName = nluDomainName;
        this.nluIntentName = nluIntentName;
        this.domainName = domainName;
        this.intentName = intentName;
        this.intentId = intentId;
        this.taskName = taskName;
        this.lastFromStateId = lastFromStateId;
        this.fromStateId = fromStateId;
        this.sameDomain = sameDomain;
        this.historySlotStateMap = historySlotStateMap;
        this.currentSlotStateMap = currentSlotStateMap;
        this.exchangedRecordMap = exchangedRecordMap;
        this.fixedSlotStateMap = fixedSlotStateMap;
        this.unknownSlotStateMap = unknownSlotStateMap;
        this.fixedParamValueMap = fixedParamValueMap;
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

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        this.sentence = sentence;
    }

    public String getNluDomainName() {
        return nluDomainName;
    }

    public void setNluDomainName(String nluDomainName) {
        this.nluDomainName = nluDomainName;
    }

    public String getNluIntentName() {
        return nluIntentName;
    }

    public void setNluIntentName(String nluIntentName) {
        this.nluIntentName = nluIntentName;
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

    public Integer getIntentId() {
        return intentId;
    }

    public void setIntentId(Integer intentId) {
        this.intentId = intentId;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public Integer getLastFromStateId() {
        return lastFromStateId;
    }

    public void setLastFromStateId(Integer lastFromStateId) {
        this.lastFromStateId = lastFromStateId;
    }

    public Integer getFromStateId() {
        return fromStateId;
    }

    public void setFromStateId(Integer fromStateId) {
        this.fromStateId = fromStateId;
    }

    public Boolean getSameDomain() {
        return sameDomain;
    }

    public void setSameDomain(Boolean sameDomain) {
        this.sameDomain = sameDomain;
    }

    public Map<String, SlotState> getFixedSlotStateMap() {
        return fixedSlotStateMap;
    }

    public void setFixedSlotStateMap(Map<String, SlotState> fixedSlotStateMap) {
        this.fixedSlotStateMap = fixedSlotStateMap;
    }

    public Map<String, SlotState> getUnknownSlotStateMap() {
        return unknownSlotStateMap;
    }

    public void setUnknownSlotStateMap(Map<String, SlotState> unknownSlotStateMap) {
        this.unknownSlotStateMap = unknownSlotStateMap;
    }

    public Map<String, SlotState> getHistorySlotStateMap() {
        return historySlotStateMap;
    }

    public void setHistorySlotStateMap(Map<String, SlotState> historySlotStateMap) {
        this.historySlotStateMap = historySlotStateMap;
    }

    public Map<String, SlotState> getCurrentSlotStateMap() {
        return currentSlotStateMap;
    }

    public void setCurrentSlotStateMap(Map<String, SlotState> currentSlotStateMap) {
        this.currentSlotStateMap = currentSlotStateMap;
    }

    public Map<String, String> getExchangedRecordMap() {
        return exchangedRecordMap;
    }

    public void setExchangedRecordMap(Map<String, String> exchangedRecordMap) {
        this.exchangedRecordMap = exchangedRecordMap;
    }

    public Map<String, String> getFixedParamValueMap() {
        return fixedParamValueMap;
    }

    public void setFixedParamValueMap(Map<String, String> fixedParamValueMap) {
        this.fixedParamValueMap = fixedParamValueMap;
    }
}
