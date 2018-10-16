package com.lc.core.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/14.
 */

public class SetControlBean implements Serializable {
    //设备监控因子id
    private String deviceMonitorGeneId;
    //是否选择
    private boolean select;
    //别名
    private String alias;
    //标识
    private String identification;
    //监控因子
    private String monitorGene;
    //监控对象id
    private String monitorObjId;
    //参数因子id
    private String id;
    //数据类型
    private String dataType;

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getMonitorGene() {
        return monitorGene;
    }

    public void setMonitorGene(String monitorGene) {
        this.monitorGene = monitorGene;
    }

    public String getMonitorObjId() {
        return monitorObjId;
    }

    public void setMonitorObjId(String monitorObjId) {
        this.monitorObjId = monitorObjId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataType() {
        return dataType;
    }

    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public String getDeviceMonitorGeneId() {
        return deviceMonitorGeneId;
    }

    public void setDeviceMonitorGeneId(String deviceMonitorGeneId) {
        this.deviceMonitorGeneId = deviceMonitorGeneId;
    }
}
