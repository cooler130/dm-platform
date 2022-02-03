package com.cooler.ai.platform.facade.model;

/**
 * @Author zhangsheng
 * @Description
 * @Date 2018/12/30
 **/

public class SlotInfo implements java.io.Serializable{
    private int index;                                  // 槽索引
    private String name;                                // 槽名
    private String value;                               // 槽值
    private int valueType = 1;                          // 槽值类型
    private int slotOpe = 1;                            // 槽值操作
    private String originalText;                        // 原文文本

    public SlotInfo() {
    }

    public SlotInfo(int index, String name, String value, int valueType, int slotOpe, String originalText) {
        this.index = index;
        this.name = name;
        this.value = value;
        this.valueType = valueType;
        this.slotOpe = slotOpe;
        this.originalText = originalText;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getValueType() {
        return valueType;
    }

    public void setValueType(int valueType) {
        this.valueType = valueType;
    }

    public int getSlotOpe() {
        return slotOpe;
    }

    public void setSlotOpe(int slotOpe) {
        this.slotOpe = slotOpe;
    }

    public String getOriginalText() {
        return originalText;
    }

    public void setOriginalText(String originalText) {
        this.originalText = originalText;
    }
}
