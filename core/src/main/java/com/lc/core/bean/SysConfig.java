package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 系统配置
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class SysConfig {
    @Id(autoincrement = true)
    private Long id;

    //配置键
    private String configKey;
    //配置值
    private String configValue;

    //配置说明
    private String configRemark;

    @Generated(hash = 1518921452)
    public SysConfig(Long id, String configKey, String configValue,
            String configRemark) {
        this.id = id;
        this.configKey = configKey;
        this.configValue = configValue;
        this.configRemark = configRemark;
    }

    @Generated(hash = 1454359576)
    public SysConfig() {
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getConfigKey() {
        return this.configKey;
    }

    public void setConfigKey(String configKey) {
        this.configKey = configKey;
    }

    public String getConfigValue() {
        return this.configValue;
    }

    public void setConfigValue(String configValue) {
        this.configValue = configValue;
    }

    public String getConfigRemark() {
        return this.configRemark;
    }

    public void setConfigRemark(String configRemark) {
        this.configRemark = configRemark;
    }


}
