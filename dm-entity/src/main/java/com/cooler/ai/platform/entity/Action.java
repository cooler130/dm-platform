package com.cooler.ai.platform.entity;

import com.cooler.ai.platform.model.EntityConstant;

public class Action {
    private Integer id;

    private String actionName;

    private Integer actionType;

    private String processCode;

    private String defaultReply;

    private String msg;

    private static Action defaultAction = new Action(EntityConstant.DEFAULT_ACTION_ID, "全局兜底动作", 2, EntityConstant.DEFAULT_ACTION_PROCESSCODE,  "", "全局兜底动作");
    private static Action inquiryAction = new Action(EntityConstant.INQUIRY_ACTION_ID, "全局询问动作", 2, EntityConstant.INQUIRY_ACTION_PROCESSCODE, "", "全局询问动作");


    public Action(Integer id, String actionName, Integer actionType, String processCode, String defaultReply, String msg) {
        this.id = id;
        this.actionName = actionName;
        this.actionType = actionType;
        this.processCode = processCode;
        this.defaultReply = defaultReply;
        this.msg = msg;
    }

    public static Action getInquiryAction(){
        return inquiryAction;
    }
    public static Action getDefaultAction(){
        return defaultAction;
    }

    public Action() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getActionName() {
        return actionName;
    }

    public void setActionName(String actionName) {
        this.actionName = actionName == null ? null : actionName.trim();
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public String getProcessCode() {
        return processCode;
    }

    public void setProcessCode(String processCode) {
        this.processCode = processCode == null ? null : processCode.trim();
    }

    public String getDefaultReply() {
        return defaultReply;
    }

    public void setDefaultReply(String defaultReply) {
        this.defaultReply = defaultReply == null ? null : defaultReply.trim();
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg == null ? null : msg.trim();
    }
}