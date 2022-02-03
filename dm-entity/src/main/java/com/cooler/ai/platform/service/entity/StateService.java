package com.cooler.ai.platform.service.entity;

import com.cooler.ai.platform.entity.State;

/**
 * Created by zhangsheng on 2018/12/11.
 */
public interface StateService {

    State selectByStateId(Integer currentStateId);
}
