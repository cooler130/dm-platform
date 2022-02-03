package com.cooler.ai.platform.action;

import java.util.Map;

/**
 * Created by zhangsheng on 2018/7/21.
 */
public interface ProcessedTaskAction<DR, DS, BD> extends TaskAction<DR, DS, BD>{

    Map<String, BD> process();

    String routeNextProcessCode();
}
