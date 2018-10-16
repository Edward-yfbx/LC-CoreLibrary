package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.DaoException;
import org.greenrobot.greendao.annotation.NotNull;

/**
 * 设备监控参数
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceMonitorParameter {
    @Id(autoincrement = false)
    private String id;

    //FK 设备归属信息id
    private String deviceBelongInfoId;
    //FK 参数因子id
    private String parmGeneId;
    //别名
    private String alias;
    //标识
    private String indentity;
    @Generated(hash = 961907555)
    public DeviceMonitorParameter(String id, String deviceBelongInfoId,
            String parmGeneId, String alias, String indentity) {
        this.id = id;
        this.deviceBelongInfoId = deviceBelongInfoId;
        this.parmGeneId = parmGeneId;
        this.alias = alias;
        this.indentity = indentity;
    }
    @Generated(hash = 1076138444)
    public DeviceMonitorParameter() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDeviceBelongInfoId() {
        return this.deviceBelongInfoId;
    }
    public void setDeviceBelongInfoId(String deviceBelongInfoId) {
        this.deviceBelongInfoId = deviceBelongInfoId;
    }
    public String getParmGeneId() {
        return this.parmGeneId;
    }
    public void setParmGeneId(String parmGeneId) {
        this.parmGeneId = parmGeneId;
    }
    public String getAlias() {
        return this.alias;
    }
    public void setAlias(String alias) {
        this.alias = alias;
    }
    public String getIndentity() {
        return this.indentity;
    }
    public void setIndentity(String indentity) {
        this.indentity = indentity;
    }

}
