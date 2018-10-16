package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by leo on 2018/6/7 10:24.
 * Contact:　　　lvyongxu@gmail.com
 * Description: 设备分组表
 */
@Entity
public class DeviceGroupTable {
    @Id(autoincrement = true)
    private Long id;

    //FK1 设备安装信息ID
    private long deviceInstallInfoId;
    //组号
    private String groupNumber;
    //位号
    private String positionNum;
    @Generated(hash = 1452285018)
    public DeviceGroupTable(Long id, long deviceInstallInfoId, String groupNumber,
            String positionNum) {
        this.id = id;
        this.deviceInstallInfoId = deviceInstallInfoId;
        this.groupNumber = groupNumber;
        this.positionNum = positionNum;
    }
    @Generated(hash = 1337650716)
    public DeviceGroupTable() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getDeviceInstallInfoId() {
        return this.deviceInstallInfoId;
    }
    public void setDeviceInstallInfoId(long deviceInstallInfoId) {
        this.deviceInstallInfoId = deviceInstallInfoId;
    }
    public String getGroupNumber() {
        return this.groupNumber;
    }
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    public String getPositionNum() {
        return this.positionNum;
    }
    public void setPositionNum(String positionNum) {
        this.positionNum = positionNum;
    }


}
