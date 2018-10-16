package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 采集对象数据
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class CollectObjData {

    @Id(autoincrement = true)
    private Long id;
    //设备唯一编码---出厂编号
    private String mn;
    //ST
    private String st;
    //编码
    private String code;
    //数据类型
    private String dataLb;
    //区别因子的类型   流量 浓度，开关，省缺
    private String objectName;
    //区别流量因子的类型   瞬时流量，累计流量
    private String geneName;
    //站点id
    private String identity;
    //值时间
    private String valTime;
    //值
    private String value;
    //值标志
    private String valFlag;
    //值类型
    private String valType;
    //插入时间
    private String insertTime;
    //是否已处理
    private boolean isHandled;
    //状态
    private int status;
    //设备安装信息id
    private String deviceInstalInfoId;
    //监控因子信息id
    private String monitorGeneInfoId;
    //设备监控因子id
    private String deviceMonitorGeneId;
    //监控因子id
    private String monitorObjID;
    //设备监控参数id
    private String deviceMonitorParameterId;
    //单位系数
    private String unitCoefficient;
    @Generated(hash = 1406997441)
    public CollectObjData(Long id, String mn, String st, String code, String dataLb,
            String objectName, String geneName, String identity, String valTime,
            String value, String valFlag, String valType, String insertTime,
            boolean isHandled, int status, String deviceInstalInfoId,
            String monitorGeneInfoId, String deviceMonitorGeneId,
            String monitorObjID, String deviceMonitorParameterId,
            String unitCoefficient) {
        this.id = id;
        this.mn = mn;
        this.st = st;
        this.code = code;
        this.dataLb = dataLb;
        this.objectName = objectName;
        this.geneName = geneName;
        this.identity = identity;
        this.valTime = valTime;
        this.value = value;
        this.valFlag = valFlag;
        this.valType = valType;
        this.insertTime = insertTime;
        this.isHandled = isHandled;
        this.status = status;
        this.deviceInstalInfoId = deviceInstalInfoId;
        this.monitorGeneInfoId = monitorGeneInfoId;
        this.deviceMonitorGeneId = deviceMonitorGeneId;
        this.monitorObjID = monitorObjID;
        this.deviceMonitorParameterId = deviceMonitorParameterId;
        this.unitCoefficient = unitCoefficient;
    }
    @Generated(hash = 1211236821)
    public CollectObjData() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getMn() {
        return this.mn;
    }
    public void setMn(String mn) {
        this.mn = mn;
    }
    public String getSt() {
        return this.st;
    }
    public void setSt(String st) {
        this.st = st;
    }
    public String getCode() {
        return this.code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    public String getDataLb() {
        return this.dataLb;
    }
    public void setDataLb(String dataLb) {
        this.dataLb = dataLb;
    }
    public String getObjectName() {
        return this.objectName;
    }
    public void setObjectName(String objectName) {
        this.objectName = objectName;
    }
    public String getGeneName() {
        return this.geneName;
    }
    public void setGeneName(String geneName) {
        this.geneName = geneName;
    }
    public String getIdentity() {
        return this.identity;
    }
    public void setIdentity(String identity) {
        this.identity = identity;
    }
    public String getValTime() {
        return this.valTime;
    }
    public void setValTime(String valTime) {
        this.valTime = valTime;
    }
    public String getValue() {
        return this.value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getValFlag() {
        return this.valFlag;
    }
    public void setValFlag(String valFlag) {
        this.valFlag = valFlag;
    }
    public String getValType() {
        return this.valType;
    }
    public void setValType(String valType) {
        this.valType = valType;
    }
    public String getInsertTime() {
        return this.insertTime;
    }
    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
    public boolean getIsHandled() {
        return this.isHandled;
    }
    public void setIsHandled(boolean isHandled) {
        this.isHandled = isHandled;
    }
    public int getStatus() {
        return this.status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
    public String getDeviceInstalInfoId() {
        return this.deviceInstalInfoId;
    }
    public void setDeviceInstalInfoId(String deviceInstalInfoId) {
        this.deviceInstalInfoId = deviceInstalInfoId;
    }
    public String getMonitorGeneInfoId() {
        return this.monitorGeneInfoId;
    }
    public void setMonitorGeneInfoId(String monitorGeneInfoId) {
        this.monitorGeneInfoId = monitorGeneInfoId;
    }
    public String getDeviceMonitorGeneId() {
        return this.deviceMonitorGeneId;
    }
    public void setDeviceMonitorGeneId(String deviceMonitorGeneId) {
        this.deviceMonitorGeneId = deviceMonitorGeneId;
    }
    public String getMonitorObjID() {
        return this.monitorObjID;
    }
    public void setMonitorObjID(String monitorObjID) {
        this.monitorObjID = monitorObjID;
    }
    public String getDeviceMonitorParameterId() {
        return this.deviceMonitorParameterId;
    }
    public void setDeviceMonitorParameterId(String deviceMonitorParameterId) {
        this.deviceMonitorParameterId = deviceMonitorParameterId;
    }
    public String getUnitCoefficient() {
        return this.unitCoefficient;
    }
    public void setUnitCoefficient(String unitCoefficient) {
        this.unitCoefficient = unitCoefficient;
    }
}
