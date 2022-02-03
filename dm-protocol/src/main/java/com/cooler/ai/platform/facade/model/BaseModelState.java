package com.cooler.ai.platform.facade.model;

import java.io.Serializable;

/**
 * Created by zhangsheng on 2018/6/1.
 */
public class BaseModelState<T> implements ModelState<T>, Serializable {

    private Integer modelId = null;                                     //结构ID

    private String modelName = null;                                    //结构名称

    private T t = null;                                                 //未知数据类型

    public Integer getModelId() {
        return modelId;
    }

    public void setModelId(Integer modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }
}
