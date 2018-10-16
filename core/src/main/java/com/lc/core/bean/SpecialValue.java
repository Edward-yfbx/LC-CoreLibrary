package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 特殊值
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class SpecialValue {
    @Id(autoincrement = false)
    private String id;

    //fk 监控对象id
    private String monitorObjId;
    //数据类型 字典项
    private String dataType;
    //值
    private String value;
    //标记
    private String flag;
    //特殊值名称
    private String specialValName;
    //是否正常
    private boolean isNormal;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 1072808920)
    public SpecialValue(String id, String monitorObjId, String dataType,
            String value, String flag, String specialValName, boolean isNormal,
            String lastModificationTime) {
        this.id = id;
        this.monitorObjId = monitorObjId;
        this.dataType = dataType;
        this.value = value;
        this.flag = flag;
        this.specialValName = specialValName;
        this.isNormal = isNormal;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 85329254)
    public SpecialValue() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMonitorObjId() {
        return this.monitorObjId;
    }
    public void setMonitorObjId(String monitorObjId) {
        this.monitorObjId = monitorObjId;
    }
    public String getDataType() {
        return this.dataType;
    }
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }
    public String getValue() {
        return this.value;
    }
    public void setValue(String value) {
        this.value = value;
    }
    public String getFlag() {
        return this.flag;
    }
    public void setFlag(String flag) {
        this.flag = flag;
    }
    public String getSpecialValName() {
        return this.specialValName;
    }
    public void setSpecialValName(String specialValName) {
        this.specialValName = specialValName;
    }
    public boolean getIsNormal() {
        return this.isNormal;
    }
    public void setIsNormal(boolean isNormal) {
        this.isNormal = isNormal;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

}
