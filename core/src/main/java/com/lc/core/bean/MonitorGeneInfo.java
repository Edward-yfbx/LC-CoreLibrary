package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 监控因子信息
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */

@Entity
public class MonitorGeneInfo {
    @Id(autoincrement = false)
    private String id;

    //FK监控对象ID
    private String monitorObjId;
    //数据类型 字典项
    private String dataType;
    //因子名称
    private String geneName;
    //因子单位 字典项
    private String geneUnit;
    //是否做样因子
    private boolean isSampleGene;
    //是否统计因子
    private boolean isStatsGene;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 1962147321)
    public MonitorGeneInfo(String id, String monitorObjId, String dataType,
            String geneName, String geneUnit, boolean isSampleGene,
            boolean isStatsGene, String lastModificationTime) {
        this.id = id;
        this.monitorObjId = monitorObjId;
        this.dataType = dataType;
        this.geneName = geneName;
        this.geneUnit = geneUnit;
        this.isSampleGene = isSampleGene;
        this.isStatsGene = isStatsGene;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 91198866)
    public MonitorGeneInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMonitorObjId() {
        return this.monitorObjId;
    }
    public void setMonitorObjId(String monitorObjId) {
        this.monitorObjId = monitorObjId;
    }
    public String getDataType() {
        return this.dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    public String getGeneName() {
        return this.geneName;
    }
    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }
    public String getGeneUnit() {
        return this.geneUnit;
    }
    public void setGeneUnit(String geneUnit) {
        this.geneUnit = geneUnit;
    }
    public boolean getIsSampleGene() {
        return this.isSampleGene;
    }
    public void setIsSampleGene(boolean isSampleGene) {
        this.isSampleGene = isSampleGene;
    }
    public boolean getIsStatsGene() {
        return this.isStatsGene;
    }
    public void setIsStatsGene(boolean isStatsGene) {
        this.isStatsGene = isStatsGene;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }


}
