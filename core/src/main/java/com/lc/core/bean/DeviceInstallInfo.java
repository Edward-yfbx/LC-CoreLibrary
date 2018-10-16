package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * 设备安装信息
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceInstallInfo {
    //PK
    @Id(autoincrement = false)
    private String id;

    //FK2 点位ID
    private String pointId;
    //FK1 设备归属信息ID
    private String deviceBelongInfoId;
    //安装位置
    private String instalLocation;
    //监控类型 字典项  如果是数采仪，那么监控类型就是字典表里的 default 类型；如果是在线仪（现场设备），那么监控类型就是一开始采集能力配置里面选择的监控类型
    @NotNull()
    private String monitorType;
    //MN号
    private String mnNum;
    //COM口
    private String comNum;
    //485地址
    private String communicateAddress;
    //波特率
    private Integer baudRate;
    //起始位
    private Integer startBit;
    //停止位
    private Integer endBit;
    //校验位
    private Integer checkBit;
    @Generated(hash = 79240613)
    public DeviceInstallInfo(String id, String pointId, String deviceBelongInfoId,
            String instalLocation, @NotNull String monitorType, String mnNum, String comNum,
            String communicateAddress, Integer baudRate, Integer startBit, Integer endBit,
            Integer checkBit) {
        this.id = id;
        this.pointId = pointId;
        this.deviceBelongInfoId = deviceBelongInfoId;
        this.instalLocation = instalLocation;
        this.monitorType = monitorType;
        this.mnNum = mnNum;
        this.comNum = comNum;
        this.communicateAddress = communicateAddress;
        this.baudRate = baudRate;
        this.startBit = startBit;
        this.endBit = endBit;
        this.checkBit = checkBit;
    }
    @Generated(hash = 1271208794)
    public DeviceInstallInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPointId() {
        return this.pointId;
    }
    public void setPointId(String pointId) {
        this.pointId = pointId;
    }
    public String getDeviceBelongInfoId() {
        return this.deviceBelongInfoId;
    }
    public void setDeviceBelongInfoId(String deviceBelongInfoId) {
        this.deviceBelongInfoId = deviceBelongInfoId;
    }
    public String getInstalLocation() {
        return this.instalLocation;
    }
    public void setInstalLocation(String instalLocation) {
        this.instalLocation = instalLocation;
    }
    public String getMonitorType() {
        return this.monitorType;
    }
    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }
    public String getMnNum() {
        return this.mnNum;
    }
    public void setMnNum(String mnNum) {
        this.mnNum = mnNum;
    }
    public String getComNum() {
        return this.comNum;
    }
    public void setComNum(String comNum) {
        this.comNum = comNum;
    }
    public String getCommunicateAddress() {
        return this.communicateAddress;
    }
    public void setCommunicateAddress(String communicateAddress) {
        this.communicateAddress = communicateAddress;
    }
    public Integer getBaudRate() {
        return this.baudRate;
    }
    public void setBaudRate(Integer baudRate) {
        this.baudRate = baudRate;
    }
    public Integer getStartBit() {
        return this.startBit;
    }
    public void setStartBit(Integer startBit) {
        this.startBit = startBit;
    }
    public Integer getEndBit() {
        return this.endBit;
    }
    public void setEndBit(Integer endBit) {
        this.endBit = endBit;
    }
    public Integer getCheckBit() {
        return this.checkBit;
    }
    public void setCheckBit(Integer checkBit) {
        this.checkBit = checkBit;
    }

}
