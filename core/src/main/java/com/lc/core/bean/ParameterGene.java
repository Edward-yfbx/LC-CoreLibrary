package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 参数因子
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class ParameterGene {
    @Id(autoincrement = false)
    private String id;

    //FK 监控对象id
    private String monitorObjId;
    //数据类型 字典项
    private String dataType;
    //因子名称
    private String geneName;
    //因子单位 字典项
    private String geneUnit;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 1066817040)
    public ParameterGene(String id, String monitorObjId, String dataType,
            String geneName, String geneUnit, String lastModificationTime) {
        this.id = id;
        this.monitorObjId = monitorObjId;
        this.dataType = dataType;
        this.geneName = geneName;
        this.geneUnit = geneUnit;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 1318171908)
    public ParameterGene() {
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
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
