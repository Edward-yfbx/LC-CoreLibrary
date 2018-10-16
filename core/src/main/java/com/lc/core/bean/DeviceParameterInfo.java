package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 设备参数信息
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceParameterInfo {
    @Id(autoincrement = false)
    private String id;

    //设备信息id
    private String deviceInfoId;
    //参数对象id
    private String parmGeneId;
    //设备参数名称
    private String deviceParmName;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 79302388)
    public DeviceParameterInfo(String id, String deviceInfoId, String parmGeneId,
            String deviceParmName, String lastModificationTime) {
        this.id = id;
        this.deviceInfoId = deviceInfoId;
        this.parmGeneId = parmGeneId;
        this.deviceParmName = deviceParmName;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 2140495670)
    public DeviceParameterInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeviceInfoId() {
        return this.deviceInfoId;
    }
    public void setDeviceInfoId(String deviceInfoId) {
        this.deviceInfoId = deviceInfoId;
    }
    public String getParmGeneId() {
        return this.parmGeneId;
    }
    public void setParmGeneId(String parmGeneId) {
        this.parmGeneId = parmGeneId;
    }
    public String getDeviceParmName() {
        return this.deviceParmName;
    }
    public void setDeviceParmName(String deviceParmName) {
        this.deviceParmName = deviceParmName;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
