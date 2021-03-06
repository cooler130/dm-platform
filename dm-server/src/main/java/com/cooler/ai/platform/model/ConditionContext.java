package com.cooler.ai.platform.model;

import com.cooler.ai.platform.entity.ConditionLogic;
import com.cooler.ai.platform.entity.ConditionRule;
import com.cooler.ai.platform.facade.constance.Constant;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/12
 **/

public class ConditionContext<T> {

    private Logger logger = LoggerFactory.getLogger(ConditionContext.class);

    private String name = null;
    private Set<String> preprocessParamNames = new HashSet<>();
    private List<ConditionData> conditionDatas = new ArrayList<>();
    private Map<Integer, List<ConditionData>> groupedConditionDatasMap = null;
    private Boolean lastResult = false;

    public void addConditionData(ConditionData conditionData){
        conditionDatas.add(conditionData);
    }

    public ConditionContext(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ConditionData> getConditionDatas() {
        return conditionDatas;
    }

    public void setConditionDatas(List<ConditionData> conditionDatas) {
        this.conditionDatas = conditionDatas;
    }

    public Boolean getLastResult() {
        return lastResult;
    }

    public void setLastResult(Boolean lastResult) {
        this.lastResult = lastResult;
    }

    public boolean hadBePreprocessed(String paramName){
        return preprocessParamNames.contains(paramName);
    }

    public void recordPreprocessedParamName(String paramName){
        preprocessParamNames.add(paramName);
    }

    public Map<Integer, List<ConditionData>> getGroupedConditionDatasMap(){
        if(groupedConditionDatasMap != null) return groupedConditionDatasMap;
        Map<Integer, List<ConditionData>> conditionDataGroupMap = new HashMap<>();
        for (ConditionData conditionData : conditionDatas) {
            ConditionLogic conditionLogic = conditionData.getConditionLogic();
            Integer groupNum = conditionLogic.getGroupNum();
            List<ConditionData> conditionDataGroup = conditionDataGroupMap.get(groupNum);
            if(conditionDataGroup == null){
                conditionDataGroup = new ArrayList<>();
            }
            conditionDataGroup.add(conditionData);
            conditionDataGroupMap.put(groupNum, conditionDataGroup);
        }
        groupedConditionDatasMap = conditionDataGroupMap;
        return groupedConditionDatasMap;
    }

    /**
     * ??????FIRST_BAD_CONDITION_DATA????????????????????????????????????????????????
     * @return
     */
    public ConditionData findFirstBadConditionData() {
        if (groupedConditionDatasMap != null) {
            List<Integer> groupNums = new ArrayList<>(groupedConditionDatasMap.keySet());
            Collections.sort(groupNums, Collections.reverseOrder());                        //????????????????????????????????????
            List<ConditionData> noNeedNopassNoticeCDs = new ArrayList<>();
            for (Integer groupNum : groupNums) {
                List<ConditionData> conditionDatas = groupedConditionDatasMap.get(groupNum);
                if(conditionDatas != null && conditionDatas.size() > 0){
                    for (ConditionData conditionData : conditionDatas) {
                        if(!conditionData.getResult()){                                          //?????????ContextData???result == false
                            ConditionLogic conditionLogic = conditionData.getConditionLogic();
                            Integer logicType = conditionLogic.getLogicType();
                            Byte nopassNotice = conditionLogic.getNopassNotice();
                            if(logicType == Constant.AND || logicType == Constant.NOT){
                                if(nopassNotice == (byte)1){
                                    return conditionData;                   //???????????????ConditionData?????????conditionLogic???????????????????????????????????????,????????????????????????/????????????
                                }else{
                                    noNeedNopassNoticeCDs.add(conditionData);//??????????????????/?????????????????????????????????????????????/???????????????????????????????????????????????????
                                }
                            }
                        }
                    }
                }
            }
            if(noNeedNopassNoticeCDs.size() > 0){
                return noNeedNopassNoticeCDs.get(0);
            }
        }
        return null;
    }

    /**
     * ????????????????????????????????????????????????
     * ???????????????4???????????????3??????????????????????????????4?????????
     * true && (true) -> true
     * true || (true) -> true
     * true && (false) -> false
     * true || (false) -> true (????????????????????????????????????????????????????????????????????????????????????????????????group???????????????OR???????????????????????????"false"?????????????????????????????????????????????????????????????????????????????????)
     *
     * false || (true) -> true
     * false || (false) -> false
     * @return
     */
    public String getAllResultProcess(){
        if(groupedConditionDatasMap != null){                                               //???Map????????????????????????ConditionContext???????????????????????????AllResultProcess????????????????????????
            List<Integer> groupNums = new ArrayList<>(groupedConditionDatasMap.keySet());
            Collections.sort(groupNums, Collections.reverseOrder());                        //????????????????????????????????????
            StringBuffer sbAll = new StringBuffer("\nFALSE || ").append("\n");

            for (Integer groupNum : groupNums) {
                List<ConditionData> conditionDatas = groupedConditionDatasMap.get(groupNum);

                StringBuffer sbNotAllORGroup = new StringBuffer("\t" + groupNum + ":( True \n\t\t");
                StringBuffer sbAllORGroup = new StringBuffer("\t" + groupNum + ":?????????( False \n\t\t");
                boolean isAllORGroup = true;

                for (ConditionData conditionData : conditionDatas) {
                    ConditionRule conditionRule = conditionData.getConditionRule();
                    ConditionLogic conditionLogic = conditionData.getConditionLogic();
                    Object value = conditionData.getValue();

                    Integer conditionRuleId = conditionRule.getId();
                    String paramsName = conditionRule.getParamName();
                    Integer checkRelationType = conditionRule.getCheckRelationType();
                    String ruleExpression = Constant.RULE_EXPRESSION_MAP.get(checkRelationType);
                    String checkValue = conditionRule.getCheckValue();
                    Integer conditionLogicId = conditionLogic.getId();
                    Integer transitionId = conditionLogic.getTransitionId();
                    Integer logicType = conditionLogic.getLogicType();
                    if(logicType == Constant.AND || logicType == Constant.NOT){
                        isAllORGroup = false;
                    }
                    String logicTypeStr = null;
                    switch (logicType){
                        case Constant.AND : {
                            logicTypeStr = " && ";
                            break;
                        }
                        case Constant.OR : {
                            logicTypeStr = " || ";
                            break;
                        }
                        case Constant.NOT : {
                            logicTypeStr = " && ! ";
                            break;
                        }
                    }

                    boolean conditionDataResult = conditionData.getResult();
                    String resultSection = "(T:" + transitionId + "_CL:" + conditionLogicId + "_CR:" + conditionRuleId + " | ???????????????" + paramsName + " ??????: [" + value + " ?????? " + ruleExpression + " " + checkValue + "] -> ?????????" + conditionDataResult + ")";
                    sbNotAllORGroup.append(logicTypeStr).append(resultSection).append("\n\t\t");
                    sbAllORGroup.append(logicTypeStr).append(resultSection).append("\n\t\t");
                }
                sbNotAllORGroup.append(" )").append("\n");
                sbAllORGroup.append(" )").append("\n");

                String groupResult = isAllORGroup ? sbAllORGroup.toString() : sbNotAllORGroup.toString();
                sbAll.append(groupResult);
            }

            sbAll.append(" --> ").append(lastResult);
            return sbAll.toString();
        }
        return null;
    }
}
