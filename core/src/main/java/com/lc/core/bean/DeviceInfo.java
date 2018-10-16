package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 设备信息
 * Created by 张明_ on 2018/3/30.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceInfo {
    @Id(autoincrement = false)
    private String id;

    //设备名称
    private String deviceName;
    //设备类型 字典项
    private String deviceType;
    //设备型号
    private String deviceModelNumber;
    //设备品牌 字典项
    private String deviceBrand;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 1694349429)
    public DeviceInfo(String id, String deviceName, String deviceType,
            String deviceModelNumber, String deviceBrand,
            String lastModificationTime) {
        this.id = id;
        this.deviceName = deviceName;
        this.deviceType = deviceType;
        this.deviceModelNumber = deviceModelNumber;
        this.deviceBrand = deviceBrand;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 2125166935)
    public DeviceInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeviceName() {
        return this.deviceName;
    }
    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }
    public String getDeviceType() {
        return this.deviceType;
    }
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public String getDeviceModelNumber() {
        return this.deviceModelNumber;
    }
    public void setDeviceModelNumber(String deviceModelNumber) {
        this.deviceModelNumber = deviceModelNumber;
    }
    public String getDeviceBrand() {
        return this.deviceBrand;
    }
    public void setDeviceBrand(String deviceBrand) {
        this.deviceBrand = deviceBrand;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
