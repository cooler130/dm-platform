package com.cooler.ai.platform.action;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2019/1/3
 **/

public interface DataTaskAction<DR, DS, BD> extends TaskAction<DR, DS, BD>{

    void preprocess();

    String getParamValue();

}
