package com.lc.core.bean;

import android.support.annotation.Nullable;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * 设备监控因子
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceMonitorGene {
    @Id(autoincrement = false)
    private String id;

    //点位id
    private String pointId;
    //FK1 监控因子信息id
    private String monitorGeneInfoId;
    //FK2 设备安装信息id
    private String deviceInstallInfoId;
    //设备别名
    private String alias;
    //单位系数
    @NotNull
    private String unitCoefficient;
    //标识
    @NotNull
    private String indentity;
    //通道号
    @Nullable
    private int channelNumber;
    //操作口
    @Nullable
    private int operationPort;
    //量程上限
    @Nullable
    private int rangeCap;
    //量程下限
    @Nullable
    private int lowerLimit;
    @Generated(hash = 255232315)
    public DeviceMonitorGene(String id, String pointId, String monitorGeneInfoId,
            String deviceInstallInfoId, String alias,
            @NotNull String unitCoefficient, @NotNull String indentity,
            int channelNumber, int operationPort, int rangeCap, int lowerLimit) {
        this.id = id;
        this.pointId = pointId;
        this.monitorGeneInfoId = monitorGeneInfoId;
        this.deviceInstallInfoId = deviceInstallInfoId;
        this.alias = alias;
        this.unitCoefficient = unitCoefficient;
        this.indentity = indentity;
        this.channelNumber = channelNumber;
        this.operationPort = operationPort;
        this.rangeCap = rangeCap;
        this.lowerLimit = lowerLimit;
    }
    @Generated(hash = 548340015)
    public DeviceMonitorGene() {
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
    public String getMonitorGeneInfoId() {
        return this.monitorGeneInfoId;
    }
    public void setMonitorGeneInfoId(String monitorGeneInfoId) {
        this.monitorGeneInfoId = monitorGeneInfoId;
    }
    public String getDeviceInstallInfoId() {
        return this.deviceInstallInfoId;
    }
    public void setDeviceInstallInfoId(String deviceInstallInfoId) {
        this.deviceInstallInfoId = deviceInstallInfoId;
    }
    public String getAlias() {
        return this.alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getUnitCoefficient() {
        return this.unitCoefficient;
    }
    public void setUnitCoefficient(String unitCoefficient) {
        this.unitCoefficient = unitCoefficient;
    }
    public String getIndentity() {
        return this.indentity;
    }
    public void setIndentity(String indentity) {
        this.indentity = indentity;
    }
    public int getChannelNumber() {
        return this.channelNumber;
    }
    public void setChannelNumber(int channelNumber) {
        this.channelNumber = channelNumber;
    }
    public int getOperationPort() {
        return this.operationPort;
    }
    public void setOperationPort(int operationPort) {
        this.operationPort = operationPort;
    }
    public int getRangeCap() {
        return this.rangeCap;
    }
    public void setRangeCap(int rangeCap) {
        this.rangeCap = rangeCap;
    }
    public int getLowerLimit() {
        return this.lowerLimit;
    }
    public void setLowerLimit(int lowerLimit) {
        this.lowerLimit = lowerLimit;
    }
}
