package com.cooler.ai.platform.service.entity;

import com.cooler.ai.platform.entity.Policy;

import java.util.List;

/**
 * Created by zhangsheng on 2018/6/20.
 */
public interface PolicyService {

    /**
     * 根据状态ID查询策略集
     * @param currentIntentName
     * @param currentStateId
     * @return  策略集
     */
    List<Policy> selectByIntentStateId(String currentIntentName, Integer currentStateId);
}
