package com.cooler.ai.platform.action;

import com.cooler.ai.platform.entity.Transition;

import java.util.Map;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2019/1/3
 **/

public interface DataTaskAction<DR, DS, BD> extends TaskAction<DR, DS, BD>{

    Transition getTransition();

    void setTransition(Transition transition);

    Map<String, String> getPreconditionDatasMap();

    void preprocess();

    String getParamValue();

}
