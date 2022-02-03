package com.cooler.ai.platform.facade;

import com.cooler.ai.platform.facade.model.DMResponse;
import com.cooler.ai.platform.facade.model.DistributionData;

/**
 * Created by zhangsheng on 2018/12/30.
 */
public interface DMFacade {

    DMResponse process(DistributionData distributionData);

}
