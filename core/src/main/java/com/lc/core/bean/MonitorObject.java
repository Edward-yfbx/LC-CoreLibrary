package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 监控对象
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class MonitorObject {
    @Id(autoincrement = false)
    private String id;

    //对象编码 字典项
    private String objCode;
    //监控类型 字典项
    private String monitorType;
    //对象类型 字典项
    private String objType;
    //对象名称
    private String objName;
    //默认序号
    private int dfltSerial;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 275703181)
    public MonitorObject(String id, String objCode, String monitorType,
            String objType, String objName, int dfltSerial,
            String lastModificationTime) {
        this.id = id;
        this.objCode = objCode;
        this.monitorType = monitorType;
        this.objType = objType;
        this.objName = objName;
        this.dfltSerial = dfltSerial;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 1479293283)
    public MonitorObject() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getObjCode() {
        return this.objCode;
    }
    public void setObjCode(String objCode) {
        this.objCode = objCode;
    }
    public String getMonitorType() {
        return this.monitorType;
    }
    public void setMonitorType(String monitorType) {
        this.monitorType = monitorType;
    }
    public String getObjType() {
        return this.objType;
    }
    public void setObjType(String objType) {
        this.objType = objType;
    }
    public String getObjName() {
        return this.objName;
    }
    public void setObjName(String objName) {
        this.objName = objName;
    }
    public int getDfltSerial() {
        return this.dfltSerial;
    }
    public void setDfltSerial(int dfltSerial) {
        this.dfltSerial = dfltSerial;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
