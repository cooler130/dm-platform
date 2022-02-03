package com.cooler.ai.platform.service.framework;

import com.cooler.ai.platform.entity.*;

import java.util.List;

/**
 * Created by zhangsheng on 2018/7/9.
 */
public interface DMEntityService {
    List<Action> selectAllAction();

    List<ConditionKV> selectAllConditionKV();

    List<ConditionLogic> selectAllConditionLogic();

    List<ConditionRule> selectAllConditionRule();

    List<Policy> selectAllPolicy();

    List<State> selectAllState();

    List<Transition> selectAllTransition();
}
