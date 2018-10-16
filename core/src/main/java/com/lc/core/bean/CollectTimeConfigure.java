package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

import java.util.UUID;

/**
 * Created by leo on 2018/3/23 16:25.
 * Contact:　　　lvyongxu@gmail.com
 * Description: 采集时段配置
 */

@Entity
public class CollectTimeConfigure {
    //PK
    @Id(autoincrement = false)
    private String id = UUID.randomUUID().toString();
    //FK1 数采仪ID
    private String deviceId;
    //FK2 设备安装信息ID
    private String deviceInstallInfoId;
    //采集时段（0,1,5,8,9,10,13,14,15,16）
    private String collectTime;
    @Generated(hash = 723428209)
    public CollectTimeConfigure(String id, String deviceId,
            String deviceInstallInfoId, String collectTime) {
        this.id = id;
        this.deviceId = deviceId;
        this.deviceInstallInfoId = deviceInstallInfoId;
        this.collectTime = collectTime;
    }
    @Generated(hash = 1810123028)
    public CollectTimeConfigure() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeviceId() {
        return this.deviceId;
    }
    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }
    public String getDeviceInstallInfoId() {
        return this.deviceInstallInfoId;
    }
    public void setDeviceInstallInfoId(String deviceInstallInfoId) {
        this.deviceInstallInfoId = deviceInstallInfoId;
    }
    public String getCollectTime() {
        return this.collectTime;
    }
    public void setCollectTime(String collectTime) {
        this.collectTime = collectTime;
    }

}
