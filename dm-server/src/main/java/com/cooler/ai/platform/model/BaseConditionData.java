package com.cooler.ai.platform.model;

import com.cooler.ai.platform.entity.ConditionLogic;
import com.cooler.ai.platform.entity.ConditionRule;

import java.util.Map;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/29
 **/

public class BaseConditionData<V> implements ConditionData<V> {

    private ConditionRule conditionRule = null;         //由此conditionRule控制条件检验

    private ConditionLogic conditionLogic = null;       //由此conditionLogic控制条件逻辑

    private Integer paramType = null;                   //变量类型

    private String paramsName = null;                   //变量名称

    private V value = null;                             //数据

    private float belief = 0f;                          //置信度

    private Boolean result = null;                      //此conditionData的检测结果

    private boolean isNecessary = false;                //是否必须

    private Map<String, String> preconditionDataMap = null; //此检测规则的前提条件

    public BaseConditionData() {
    }

    public BaseConditionData(ConditionRule conditionRule, ConditionLogic conditionLogic, Integer paramType, String paramsName, V value, float belief, Boolean result, boolean isNecessary, Map<String, String> preconditionDataMap) {
        this.conditionRule = conditionRule;
        this.conditionLogic = conditionLogic;
        this.paramType = paramType;
        this.paramsName = paramsName;
        this.value = value;
        this.belief = belief;
        this.result = result;
        this.isNecessary = isNecessary;
        this.preconditionDataMap = preconditionDataMap;
    }

    @Override
    public ConditionRule getConditionRule() {
        return conditionRule;
    }

    public void setConditionRule(ConditionRule conditionRule) {
        this.conditionRule = conditionRule;
    }

    @Override
    public ConditionLogic getConditionLogic() {
        return conditionLogic;
    }

    public void setConditionLogic(ConditionLogic conditionLogic) {
        this.conditionLogic = conditionLogic;
    }

    @Override
    public Integer getParamType() {
        return paramType;
    }

    public void setParamType(Integer paramType) {
        this.paramType = paramType;
    }

    @Override
    public float getBelief() {
        return belief;
    }

    public void setBelief(float belief) {
        this.belief = belief;
    }

    public Boolean getResult() {
        return result;
    }

    public void setResult(Boolean result) {
        this.result = result;
    }

    @Override
    public String getParamsName() {
        return paramsName;
    }

    public void setParamsName(String paramsName) {
        this.paramsName = paramsName;
    }

    @Override
    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }

    @Override
    public boolean isNecessary() {
        return isNecessary;
    }

    public void setNecessary(boolean necessary) {
        isNecessary = necessary;
    }

    public Map<String, String> getPreconditionDataMap() {
        return preconditionDataMap;
    }

    public void setPreconditionDataMap(Map<String, String> preconditionDataMap) {
        this.preconditionDataMap = preconditionDataMap;
    }
}
