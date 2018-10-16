package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 字典表
 * Created by 张明_ on 2018/3/28.
 * Email 741183142@qq.com
 */
@Entity
public class DescDicInfo {
    @Id(autoincrement = false)
    private String id;
    //类型
    private String dicType;
    //描述英文版
    private String dicKeyword;

    private String dicValue;

    private String dicEntity;
    //描述
    private String dicDesc;
    //属于
    private String dicBelong;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 597366189)
    public DescDicInfo(String id, String dicType, String dicKeyword,
            String dicValue, String dicEntity, String dicDesc, String dicBelong,
            String lastModificationTime) {
        this.id = id;
        this.dicType = dicType;
        this.dicKeyword = dicKeyword;
        this.dicValue = dicValue;
        this.dicEntity = dicEntity;
        this.dicDesc = dicDesc;
        this.dicBelong = dicBelong;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 1705161314)
    public DescDicInfo() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDicType() {
        return this.dicType;
    }
    public void setDicType(String dicType) {
        this.dicType = dicType;
    }
    public String getDicKeyword() {
        return this.dicKeyword;
    }
    public void setDicKeyword(String dicKeyword) {
        this.dicKeyword = dicKeyword;
    }
    public String getDicValue() {
        return this.dicValue;
    }
    public void setDicValue(String dicValue) {
        this.dicValue = dicValue;
    }
    public String getDicEntity() {
        return this.dicEntity;
    }
    public void setDicEntity(String dicEntity) {
        this.dicEntity = dicEntity;
    }
    public String getDicDesc() {
        return this.dicDesc;
    }
    public void setDicDesc(String dicDesc) {
        this.dicDesc = dicDesc;
    }
    public String getDicBelong() {
        return this.dicBelong;
    }
    public void setDicBelong(String dicBelong) {
        this.dicBelong = dicBelong;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }
    
    
}
