package com.cooler.ai.platform.service.impl.entity;

import com.cooler.ai.platform.dao.ConditionRuleMapper;
import com.cooler.ai.platform.entity.ConditionRule;
import com.cooler.ai.platform.service.entity.ConditionRuleService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/10
 **/
@Service("conditionRuleService")
public class ConditionRuleServiceImpl implements ConditionRuleService {

    @Autowired
    private ConditionRuleMapper conditionRuleMapper;

    @Override
    public List<ConditionRule> selectByConditionRuleIds(@Param("conditionRuleIds") Set<Integer> conditionRuleIds) {
        return conditionRuleMapper.selectByConditionRuleIds(conditionRuleIds);
    }

}
