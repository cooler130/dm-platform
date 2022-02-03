package com.cooler.ai.platform.facade.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zhangsheng on 2018/6/20.
 */
public class SlotState implements Serializable{

    /**
     * 槽位编号，来源于数据库slot表
     */
    private Integer slotId;

    /**
     * DM中的槽位名称（算是DM认可的归一化名字，以后将要用到DM的业务槽位中）
     */
    private String slotName;

    /**
     * NLU模块中的槽位名称
     */
    private String nluSlotName;

    /**
     * 此槽位是否必须
     */
    private byte isNecessary = 0;

    /**
     * 此槽位相对于它的意图的重要程度
     */
    private Float importanceDegree = 0f;

    /**
     * 是否能被继承（db中默认是1）
     */
    private Byte inheritable;

    /**
     * 是否破坏继承性（db中默认是0）
     */
    private Byte inheritDestructible;

    /**
     * 此槽位默认询问问题
     */
    private String defaultQuery;

    /**
     * 槽位信息
     */
    private String slotMsg;

    /**
     * 此槽位版本号，用来判断此槽位是否是上轮继承下来的
     */
    private String version;

    /**
     * NLU模块解析的槽位值结果（带有具体解析值）
     */
    private List<SlotInfo> slotInfos;


    public Integer getSlotId() {
        return slotId;
    }

    public void setSlotId(Integer slotId) {
        this.slotId = slotId;
    }

    public String getSlotName() {
        return slotName;
    }

    public void setSlotName(String slotName) {
        this.slotName = slotName;
    }

    public String getNluSlotName() {
        return nluSlotName;
    }

    public void setNluSlotName(String nluSlotName) {
        this.nluSlotName = nluSlotName;
    }

    public List<SlotInfo> getSlotInfos() {
        return slotInfos;
    }

    public void setSlotInfos(List<SlotInfo> slotInfos) {
        this.slotInfos = slotInfos;
    }

    public byte getIsNecessary() {
        return isNecessary;
    }

    public void setIsNecessary(byte isNecessary) {
        this.isNecessary = isNecessary;
    }

    public Float getImportanceDegree() {
        return importanceDegree;
    }

    public void setImportanceDegree(Float importanceDegree) {
        this.importanceDegree = importanceDegree;
    }

    public Byte getInheritable() {
        return inheritable;
    }

    public void setInheritable(Byte inheritable) {
        this.inheritable = inheritable;
    }

    public Byte getInheritDestructible() {
        return inheritDestructible;
    }

    public void setInheritDestructible(Byte inheritDestructible) {
        this.inheritDestructible = inheritDestructible;
    }

    public String getSlotMsg() {
        return slotMsg;
    }

    public void setSlotMsg(String slotMsg) {
        this.slotMsg = slotMsg;
    }

    public String getDefaultQuery() {
        return defaultQuery;
    }

    public void setDefaultQuery(String defaultQuery) {
        this.defaultQuery = defaultQuery;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
