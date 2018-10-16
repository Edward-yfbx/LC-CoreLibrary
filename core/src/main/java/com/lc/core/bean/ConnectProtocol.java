package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 通讯协议
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class ConnectProtocol {
    @Id(autoincrement = false)
    private String id;

    //归属设备 （实际上是 设备信息表 中的 "设备信息ID" 字段）
    private String deviceBelong;
    //接口类型
    private String interfaceType;
    //协议名称
    private String protocolName;
    //通讯模块名称
    private String communicationModuleName;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 1182638699)
    public ConnectProtocol(String id, String deviceBelong, String interfaceType,
            String protocolName, String communicationModuleName,
            String lastModificationTime) {
        this.id = id;
        this.deviceBelong = deviceBelong;
        this.interfaceType = interfaceType;
        this.protocolName = protocolName;
        this.communicationModuleName = communicationModuleName;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 336988764)
    public ConnectProtocol() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeviceBelong() {
        return this.deviceBelong;
    }
    public void setDeviceBelong(String deviceBelong) {
        this.deviceBelong = deviceBelong;
    }
    public String getInterfaceType() {
        return this.interfaceType;
    }
    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }
    public String getProtocolName() {
        return this.protocolName;
    }
    public void setProtocolName(String protocolName) {
        this.protocolName = protocolName;
    }
    public String getCommunicationModuleName() {
        return this.communicationModuleName;
    }
    public void setCommunicationModuleName(String communicationModuleName) {
        this.communicationModuleName = communicationModuleName;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
}
