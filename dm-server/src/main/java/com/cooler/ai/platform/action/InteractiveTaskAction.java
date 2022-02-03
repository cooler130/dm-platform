package com.cooler.ai.platform.action;


import com.cooler.ai.platform.facade.model.DMResponse;

/**
 * Created by zhangsheng on 2018/7/21.
 */

public interface InteractiveTaskAction<DR, DS, BD> extends TaskAction<DR, DS, BD>{

    void setProcessActionName(String processActionName);

    DMResponse interActive();

}
