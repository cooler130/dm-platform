package com.cooler.ai.platform.model;

import com.cooler.ai.platform.action.TaskAction;

import java.util.Map;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2019/9/20
 **/

public class TaskActionsHolder {
    private Map<String, TaskAction> taskActionMap;

    public Map<String, TaskAction> getTaskActionMap() {
        return taskActionMap;
    }

    public void setTaskActionMap(Map<String, TaskAction> taskActionMap) {
        this.taskActionMap = taskActionMap;
    }
}
