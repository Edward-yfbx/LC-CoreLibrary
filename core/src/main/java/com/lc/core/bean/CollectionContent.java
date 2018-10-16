package com.lc.core.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/8. 对应设备监控因子
 */

public class CollectionContent implements Serializable {

    //设备监控因子id
    private String deviceMonitorGeneId;
    //监控对象id
    private String monitorObjId;
    //设备监控参数id
    private String deviceMonitorParamterId;
    //设备类型id
    private String deviceId;
    //区别因子的类型   流量 浓度，开关，省缺
    private String objectName;
    //区别流量因子的类型   瞬时流量，累计流量
    private String geneName;

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    //模拟量1	开关量2	数字量3
//    内容	填写方式	起始值	模拟量	开关量	数字量
//    别名	填写	　   	    √	    √	    √
//    系数	填写	　   	    √	    √	    √
//    标识	填写	　   	    √	    √	    √
//    通道号	填写	　   	    √	    √
//    操作口	填写	　   	    　	    √	    　
//    量程	填写	　   √	    √	    　	    　

    //接口类型
    private String dataLb;
    //监控对象编码
    private String objCode;
    //接口类型
    private String type;
    //别名
    private String alias;
    //系数
    private String coefficient;
    //标识
    private String identification;
    //通道号
    private String channelNumber;
    //量程min
    private int min;
    //量程max
    private int max;
    //操作口
    private String operatingMouth;
    //因子
    private String gene;
    //因子id
    private String geneId;
    //是否选择
    private boolean select = false;
    //设备监控因子id
    private String id;

    public String getDeviceMonitorGeneId() {
        return deviceMonitorGeneId;
    }

    public void setDeviceMonitorGeneId(String deviceMonitorGeneId) {
        this.deviceMonitorGeneId = deviceMonitorGeneId;
    }

    public String getMonitorObjId() {
        return monitorObjId;
    }

    public void setMonitorObjId(String monitorObjId) {
        this.monitorObjId = monitorObjId;
    }

    public String getDeviceMonitorParamterId() {
        return deviceMonitorParamterId;
    }

    public void setDeviceMonitorParamterId(String deviceMonitorParamterId) {
        this.deviceMonitorParamterId = deviceMonitorParamterId;
    }

    public String getDataLb() {
        return dataLb;
    }

    public void setDataLb(String dataLb) {
        this.dataLb = dataLb;
    }

    public String getObjCode() {
        return objCode;
    }

    public void setObjCode(String objCode) {
        this.objCode = objCode;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(String coefficient) {
        this.coefficient = coefficient;
    }

    public String getIdentification() {
        return identification;
    }

    public void setIdentification(String identification) {
        this.identification = identification;
    }

    public String getChannelNumber() {
        return channelNumber;
    }

    public void setChannelNumber(String channelNumber) {
        this.channelNumber = channelNumber;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public String getOperatingMouth() {
        return operatingMouth;
    }

    public void setOperatingMouth(String operatingMouth) {
        this.operatingMouth = operatingMouth;
    }

    public String getGene() {
        return gene;
    }

    public void setGene(String gene) {
        this.gene = gene;
    }

    public String getGeneId() {
        return geneId;
    }

    public void setGeneId(String geneId) {
        this.geneId = geneId;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObjectName() {
        return objectName;
    }

    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }

    public String getGeneName() {
        return geneName;
    }

    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }
}
