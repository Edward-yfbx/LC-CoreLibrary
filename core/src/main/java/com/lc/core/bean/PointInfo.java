package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 点位信息
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class PointInfo {
    @Id(autoincrement = true)
    private Long id;
    //点位名称
    private String pointName;
    //所在区域 字典项
    private long belongArea;
    //点位地址
    private String pointAddress;
    //图片
    private String picture;
    //GPS是否锁定
    private boolean isGPSLocked;
    @Generated(hash = 1777083499)
    public PointInfo(Long id, String pointName, long belongArea,
            String pointAddress, String picture, boolean isGPSLocked) {
        this.id = id;
        this.pointName = pointName;
        this.belongArea = belongArea;
        this.pointAddress = pointAddress;
        this.picture = picture;
        this.isGPSLocked = isGPSLocked;
    }
    @Generated(hash = 1652148828)
    public PointInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getPointName() {
        return this.pointName;
    }
    public void setPointName(String pointName) {
        this.pointName = pointName;
    }
    public long getBelongArea() {
        return this.belongArea;
    }
    public void setBelongArea(long belongArea) {
        this.belongArea = belongArea;
    }
    public String getPointAddress() {
        return this.pointAddress;
    }
    public void setPointAddress(String pointAddress) {
        this.pointAddress = pointAddress;
    }
    public String getPicture() {
        return this.picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
    public boolean getIsGPSLocked() {
        return this.isGPSLocked;
    }
    public void setIsGPSLocked(boolean isGPSLocked) {
        this.isGPSLocked = isGPSLocked;
    }



}
