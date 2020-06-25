package com.cooler.ai.platform.service.entity;

import com.cooler.ai.platform.entity.ConditionLogic;

import java.util.List;
import java.util.Set;

/**
 * Created by zhangsheng on 2018/12/10.
 */
public interface ConditionLogicService {
    /**
     * 根据transitionIds查询conditionLogic集合
     * @param transitionIds
     * @return  ConditionLogic集合
     */
    List<ConditionLogic> selectByTransitionIds(Set<Integer> transitionIds);

}
