package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 企业信息
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class EnterpriseInfo {
    @Id(autoincrement = true)
    private Long id;

    //所属区域 字典项
    private long belongArea;
    //企业名称
    private String enterpriseName;
    //企业地址
    private String enterpriseAddress;
    //简介
    private String introduction;
    //照片
    private String picture;
    @Generated(hash = 1132991301)
    public EnterpriseInfo(Long id, long belongArea, String enterpriseName,
            String enterpriseAddress, String introduction, String picture) {
        this.id = id;
        this.belongArea = belongArea;
        this.enterpriseName = enterpriseName;
        this.enterpriseAddress = enterpriseAddress;
        this.introduction = introduction;
        this.picture = picture;
    }
    @Generated(hash = 928631037)
    public EnterpriseInfo() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getBelongArea() {
        return this.belongArea;
    }
    public void setBelongArea(long belongArea) {
        this.belongArea = belongArea;
    }
    public String getEnterpriseName() {
        return this.enterpriseName;
    }
    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }
    public String getEnterpriseAddress() {
        return this.enterpriseAddress;
    }
    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }
    public String getIntroduction() {
        return this.introduction;
    }
    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }
    public String getPicture() {
        return this.picture;
    }
    public void setPicture(String picture) {
        this.picture = picture;
    }
}
