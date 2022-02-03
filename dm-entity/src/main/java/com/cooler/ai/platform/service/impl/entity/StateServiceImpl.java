package com.cooler.ai.platform.service.impl.entity;

import com.cooler.ai.platform.entity.State;
import com.cooler.ai.platform.dao.StateMapper;
import com.cooler.ai.platform.service.entity.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/11
 **/
@Service("stateService")
public class StateServiceImpl implements StateService {

    @Autowired
    private StateMapper stateMapper;

    @Override
    public State selectByStateId(Integer currentStateId) {
        return stateMapper.selectByStateId(currentStateId);
    }
}
