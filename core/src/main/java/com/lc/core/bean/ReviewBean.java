package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToMany;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by 张明_ on 2018/4/12.
 * Email 741183142@qq.com
 */

public class ReviewBean implements Serializable {
    private static final long serialVersionUID = -879196079075768746L;
    //设备安装信息id
    private String deviceInstallId;
    //设备归属信息id
    private String deviceBelongInfoId;
    //监控因子id
    //设备唯一编码mn
    private String mn;
    //监控类型
    private String st;
    //协议名称
    private String procotol;
    //接口类型
    private String interfaceType;

    //监控类型文字 污水
    private String type;
    //监控类型id 监控类型
    private String monitorId;
    //设备类型   id样式字段 COD 的id
    private String typeId;
    //设备类型名字
    private String deviceTypeName;
    //品牌 COD描述
    private String brand;
    //设备品牌字典项
    private String brandId;

    //型号
    private String model;
    //设备信息id
    private String deviceId;

    //配置设置连接数
    private String com;
    //波特率
    private int baudRate;
    //起始位
    private int dataPotion;
    //停止位
    private int stopPosition;
    //校验位
    private int checkoutBit;
    //设备地址
    private String deviceMac;

    //是否选择
    private boolean select;

    //配置工作时段 // @ToMany(referencedJoinProperty = "tid")    //@ToOne(joinProperty = "hid"
    private List<MnBean> workTimeList;

    //采集内容
    private List<CollectionContent> collectionContent;

    //监控参数配置
    private List<SetControlBean> setControlBeans;

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public String getMonitorId() {
        return monitorId;
    }

    public void setMonitorId(String monitorId) {
        this.monitorId = monitorId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeId() {
        return typeId;
    }

    public void setTypeId(String typeId) {
        this.typeId = typeId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrandId() {
        return brandId;
    }

    public void setBrandId(String brandId) {
        this.brandId = brandId;
    }

    public String getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(String deviceId) {
        this.deviceId = deviceId;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCom() {
        return com;
    }

    public void setCom(String com) {
        this.com = com;
    }

    public int getBaudRate() {
        return baudRate;
    }

    public void setBaudRate(int baudRate) {
        this.baudRate = baudRate;
    }

    public int getDataPotion() {
        return dataPotion;
    }

    public void setDataPotion(int dataPotion) {
        this.dataPotion = dataPotion;
    }

    public int getStopPosition() {
        return stopPosition;
    }

    public void setStopPosition(int stopPosition) {
        this.stopPosition = stopPosition;
    }

    public int getCheckoutBit() {
        return checkoutBit;
    }

    public void setCheckoutBit(int checkoutBit) {
        this.checkoutBit = checkoutBit;
    }

    public String getDeviceMac() {
        return deviceMac;
    }

    public void setDeviceMac(String deviceMac) {
        this.deviceMac = deviceMac;
    }

    public List<CollectionContent> getCollectionContent() {
        return collectionContent;
    }

    public void setCollectionContent(List<CollectionContent> collectionContent) {
        this.collectionContent = collectionContent;
    }

    public List<MnBean> getWorkTimeList() {
        return workTimeList;
    }

    public void setWorkTimeList(List<MnBean> workTimeList) {
        this.workTimeList = workTimeList;
    }

    public String getDeviceTypeName() {
        return deviceTypeName;
    }

    public void setDeviceTypeName(String deviceTypeName) {
        this.deviceTypeName = deviceTypeName;
    }

    public String getDeviceInstallId() {
        return deviceInstallId;
    }

    public void setDeviceInstallId(String deviceInstallId) {
        this.deviceInstallId = deviceInstallId;
    }

    public String getDeviceBelongInfoId() {
        return deviceBelongInfoId;
    }

    public void setDeviceBelongInfoId(String deviceBelongInfoId) {
        this.deviceBelongInfoId = deviceBelongInfoId;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public String getProcotol() {
        return procotol;
    }

    public void setProcotol(String procotol) {
        this.procotol = procotol;
    }

    public List<SetControlBean> getSetControlBeans() {
        return setControlBeans;
    }

    public void setSetControlBeans(List<SetControlBean> setControlBeans) {
        this.setControlBeans = setControlBeans;
    }

    public String getInterfaceType() {
        return interfaceType;
    }

    public void setInterfaceType(String interfaceType) {
        this.interfaceType = interfaceType;
    }
}
