package com.cooler.ai.platform.service.entity;

import com.cooler.ai.platform.entity.Transition;
import java.util.List;

/**
 * Created by zhangsheng on 2018/12/10.
 */
public interface TransitionService {

    List<Transition> selectByTaskStartStateId(String taskName, Integer currentStateId, String intentName);

    List<Transition> selectByTaskName(String taskName);
}
