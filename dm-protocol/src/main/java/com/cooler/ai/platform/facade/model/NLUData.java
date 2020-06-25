package com.cooler.ai.platform.facade.model;

import java.util.List;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class NLUData implements java.io.Serializable{
    private List<DomainInfo> result;
    private String oldFormatResult;                      // 用来兼容历史格式版本，之后会删除

    public NLUData() {
    }

    public NLUData(List<DomainInfo> result, String oldFormatResult) {
        this.result = result;
        this.oldFormatResult = oldFormatResult;
    }

    public List<DomainInfo> getResult() {
        return result;
    }

    public void setResult(List<DomainInfo> result) {
        this.result = result;
    }

    public String getOldFormatResult() {
        return oldFormatResult;
    }

    public void setOldFormatResult(String oldFormatResult) {
        this.oldFormatResult = oldFormatResult;
    }
}
