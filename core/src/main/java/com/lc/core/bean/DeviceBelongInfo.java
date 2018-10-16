package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * 设备归属信息
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceBelongInfo {

    @Id(autoincrement = false)
    private String id;

    //FK2所属企业id
    private String belongEntId;
    //FK 设备信息id
    @NotNull
    private String deviceInfoId;
    //出厂编号
    private String serialNumber;
    @Generated(hash = 1116898876)
    public DeviceBelongInfo(String id, String belongEntId,
            @NotNull String deviceInfoId, String serialNumber) {
        this.id = id;
        this.belongEntId = belongEntId;
        this.deviceInfoId = deviceInfoId;
        this.serialNumber = serialNumber;
    }
    @Generated(hash = 1166268351)
    public DeviceBelongInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getBelongEntId() {
        return this.belongEntId;
    }
    public void setBelongEntId(String belongEntId) {
        this.belongEntId = belongEntId;
    }
    public String getDeviceInfoId() {
        return this.deviceInfoId;
    }
    public void setDeviceInfoId(String deviceInfoId) {
        this.deviceInfoId = deviceInfoId;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }
    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }
}
