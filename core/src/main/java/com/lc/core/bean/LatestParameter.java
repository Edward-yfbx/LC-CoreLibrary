package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

import java.util.UUID;

/**
 * 最新参数
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class LatestParameter {

    private String id = UUID.randomUUID().toString();

    //点位id
    private String pointId;
    //设备监控参数id
    private String deviceMonitorParmId;
    //数据采集时间
    private String dataCollectTime;
    //最新采集数据
    private String latestCollectData;
    //特殊值id
    private String specialValId;
    @Generated(hash = 2081742752)
    public LatestParameter(String id, String pointId, String deviceMonitorParmId,
            String dataCollectTime, String latestCollectData, String specialValId) {
        this.id = id;
        this.pointId = pointId;
        this.deviceMonitorParmId = deviceMonitorParmId;
        this.dataCollectTime = dataCollectTime;
        this.latestCollectData = latestCollectData;
        this.specialValId = specialValId;
    }
    @Generated(hash = 1565532776)
    public LatestParameter() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getPointId() {
        return this.pointId;
    }
    public void setPointId(String pointId) {
        this.pointId = pointId;
    }
    public String getDeviceMonitorParmId() {
        return this.deviceMonitorParmId;
    }
    public void setDeviceMonitorParmId(String deviceMonitorParmId) {
        this.deviceMonitorParmId = deviceMonitorParmId;
    }
    public String getDataCollectTime() {
        return this.dataCollectTime;
    }
    public void setDataCollectTime(String dataCollectTime) {
        this.dataCollectTime = dataCollectTime;
    }
    public String getLatestCollectData() {
        return this.latestCollectData;
    }
    public void setLatestCollectData(String latestCollectData) {
        this.latestCollectData = latestCollectData;
    }
    public String getSpecialValId() {
        return this.specialValId;
    }
    public void setSpecialValId(String specialValId) {
        this.specialValId = specialValId;
    }
}
