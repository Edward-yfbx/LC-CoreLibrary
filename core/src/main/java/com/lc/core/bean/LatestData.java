package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

import java.util.UUID;

/**
 * 最新数据
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class LatestData {
    private String id = UUID.randomUUID().toString();
    //点位id
    private String pointId;
    //设备监控因子id
    private String deviceMonitorGeneId;
    //数据采集时间
    private String dataCollectTime;
    //最新采集数据
    private String latestCollectData;
    //特殊值id
    private String specialValId;
    @Generated(hash = 1247511773)
    public LatestData(String id, String pointId, String deviceMonitorGeneId,
            String dataCollectTime, String latestCollectData, String specialValId) {
        this.id = id;
        this.pointId = pointId;
        this.deviceMonitorGeneId = deviceMonitorGeneId;
        this.dataCollectTime = dataCollectTime;
        this.latestCollectData = latestCollectData;
        this.specialValId = specialValId;
    }
    @Generated(hash = 1678615114)
    public LatestData() {
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
    public String getDeviceMonitorGeneId() {
        return this.deviceMonitorGeneId;
    }
    public void setDeviceMonitorGeneId(String deviceMonitorGeneId) {
        this.deviceMonitorGeneId = deviceMonitorGeneId;
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
