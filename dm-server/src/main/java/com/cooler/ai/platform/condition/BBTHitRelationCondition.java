package com.cooler.ai.platform.condition;

import com.cooler.ai.platform.entity.ConditionRule;
import com.cooler.ai.platform.facade.constance.Constant;
import com.cooler.ai.platform.model.ConditionData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static com.cooler.ai.platform.condition.BaseCondition.VALICATION_PASSED;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/12
 **/

public class BBTHitRelationCondition extends FatherCondition {

    private static Logger logger = LoggerFactory.getLogger(BBTHitRelationCondition.class);

    public BBTHitRelationCondition(String conditionName) {
        super(conditionName);
    }


    @Override
    public boolean isSatisfied(ConditionData conditionData) {
        int validate = validate(conditionData);
        if(validate != VALICATION_PASSED)   return false;

        ConditionRule conditionRule = conditionData.getConditionRule();

        Integer conditionRuleId = conditionRule.getId();
        float beliefThreshold = conditionRule.getBeliefThreshold();
        Integer checkRelationType = conditionRule.getCheckRelationType();
        String checkValue = conditionRule.getCheckValue();

        float belief = conditionData.getBelief();
        if(belief < beliefThreshold)    return false;                                                                   //确保先超过置信度阈值

        String value = (String)conditionData.getValue();
        switch (checkRelationType) {
            case Constant.R_NONE: {                 //无关系
                return true;
            }
            case Constant.R_EQUAL: {                //等于
                if(value != null){
                    return value.equals(checkValue);
                }
                return false;
            }
            case Constant.R_NO_EQUAL: {             //不等于
                if(value != null){
                    return !value.equals(checkValue);
                }
                return false;
            }
            case Constant.R_MORE: {                 //大于
                try{
                    int valueInt = Integer.parseInt(value);
                    int checkValueInt = Integer.parseInt(checkValue);
                    return valueInt > checkValueInt;
                }catch (Exception e){
                    return false;
                }
            }
            case Constant.R_MORE_EQUAL: {           //大于等于
                try{
                    int valueInt = Integer.parseInt(value);
                    int checkValueInt = Integer.parseInt(checkValue);
                    return valueInt >= checkValueInt;
                }catch (Exception e){
                    return false;
                }
            }
            case Constant.R_LESS: {                 //小于
                try{
                    int valueInt = Integer.parseInt(value);
                    int checkValueInt = Integer.parseInt(checkValue);
                    return valueInt < checkValueInt;
                }catch (Exception e){
                    return false;
                }
            }
            case Constant.R_LESS_EQUAL: {           //小于等于
                try{
                    int valueInt = Integer.parseInt(value);
                    int checkValueInt = Integer.parseInt(checkValue);
                    return valueInt <= checkValueInt;
                }catch (Exception e){
                    return false;
                }
            }
            case Constant.R_CONTAIN: {              //包含
                return value.contains(checkValue);
            }
            case Constant.R_NOT_CONTAIN: {          //不包含
                return !value.contains(checkValue);
            }
            case Constant.R_BE_CONTAINED: {         //被包含（包含于）
                String[] checkValueItems = checkValue.split("\\|");
                for (String checkValueItem : checkValueItems) {
                    if(value.equals(checkValueItem)) {
                        return true;
                    }
                }
                return false;
            }
            case Constant.R_NOT_BE_CONTAINED: {     //不被包含（不包含于）
                String[] checkValueItems = checkValue.split("\\|");
                for (String checkValueItem : checkValueItems) {
                    if(value.equals(checkValueItem)) {
                        return false;
                    }
                }
                return true;
            }
            case Constant.R_MATCH_REGEXP: {         //匹配正则
                return value.matches(checkValue);
            }
            case Constant.R_NOT_MATCH_REGEXP: {     //不匹配正则
                return !value.matches(checkValue);
            }
            default: {                              //默认返回false
                return false;
            }
        }
    }
}
