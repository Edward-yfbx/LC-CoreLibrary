package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 设备因子信息
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceGeneInfo {
    @Id(autoincrement = false)
    private String id;

    //设备类型 字典项
    private String deviceType;
    //监控因子信息id
    private String monitorGeneInfoId;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 1531960116)
    public DeviceGeneInfo(String id, String deviceType, String monitorGeneInfoId,
            String lastModificationTime) {
        this.id = id;
        this.deviceType = deviceType;
        this.monitorGeneInfoId = monitorGeneInfoId;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 1231797347)
    public DeviceGeneInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeviceType() {
        return this.deviceType;
    }
    public void setDeviceType(String deviceType) {
        this.deviceType = deviceType;
    }
    public String getMonitorGeneInfoId() {
        return this.monitorGeneInfoId;
    }
    public void setMonitorGeneInfoId(String monitorGeneInfoId) {
        this.monitorGeneInfoId = monitorGeneInfoId;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
