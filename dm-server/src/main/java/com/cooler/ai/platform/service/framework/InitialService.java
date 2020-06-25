package com.cooler.ai.platform.service.framework;

/**
 * Created by zhangsheng on 2018/5/25.
 */
public interface InitialService {

    /**
     * 系统参数初始化
     */
    void initSysParams();

    /**
     * 业务数据初始化
     */
    void initBizDatas();
}
