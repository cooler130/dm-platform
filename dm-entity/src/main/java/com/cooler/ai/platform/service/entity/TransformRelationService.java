package com.cooler.ai.platform.service.entity;

import com.cooler.ai.platform.entity.TransformRelation;

import java.util.List;

/**
 * Created by zhangsheng on 2020/1/9.
 */
public interface TransformRelationService {

    TransformRelation selectByContextStateIdIntent(Integer contextStateId, String contextIntentName);

}
