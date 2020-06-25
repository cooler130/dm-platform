package com.cooler.ai.platform.service.impl.entity;

import com.cooler.ai.platform.dao.PolicyMapper;
import com.cooler.ai.platform.entity.Policy;
import com.cooler.ai.platform.model.EntityConstant;
import com.cooler.ai.platform.service.entity.PolicyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhangsheng on 2018/6/27.
 */
@Service("policyService")
public class PolicyServiceImpl implements PolicyService {

    @Autowired
    private PolicyMapper policyMapper;

    @Override
    public List<Policy> selectByIntentStateId(String currentIntentName, Integer currentStateId) {
        List<Policy> policies = policyMapper.selectByIntentStateId(currentIntentName, currentStateId);
        if(policies == null ){
            policies = new ArrayList<>();
        }
        return policies;
    }
}
