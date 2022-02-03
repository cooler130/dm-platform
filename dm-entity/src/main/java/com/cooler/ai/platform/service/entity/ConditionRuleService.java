package com.cooler.ai.platform.service.entity;

import com.cooler.ai.platform.entity.ConditionRule;

import java.util.List;
import java.util.Set;

/**
 * Created by zhangsheng on 2018/12/10.
 */
public interface ConditionRuleService {
    /**
     * 根据checkIds查询Check集合
     * @param conditionRuleIds
     * @return  Check集合
     */
    List<ConditionRule> selectByConditionRuleIds(Set<Integer> conditionRuleIds);

}
