package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 原始数据
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class OriginalData {
    @Id(autoincrement = true)
    private Long id;

    //点位id
    private String pointId;
    //设备监控因子id
    private String deviceMonitorGeneId;
    //数据采集时间
    private String dataCollectTime;
    //采集数据
    private String collectData;
    //特殊值id
    private String specialValId;
    //是否已处理
    private boolean isHandled;
    //重试次数
    private int retryNum;
    //重置次数
    private int remakeNum;
    @Generated(hash = 572710696)
    public OriginalData(Long id, String pointId, String deviceMonitorGeneId,
            String dataCollectTime, String collectData, String specialValId,
            boolean isHandled, int retryNum, int remakeNum) {
        this.id = id;
        this.pointId = pointId;
        this.deviceMonitorGeneId = deviceMonitorGeneId;
        this.dataCollectTime = dataCollectTime;
        this.collectData = collectData;
        this.specialValId = specialValId;
        this.isHandled = isHandled;
        this.retryNum = retryNum;
        this.remakeNum = remakeNum;
    }
    @Generated(hash = 1768705299)
    public OriginalData() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
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
    public String getCollectData() {
        return this.collectData;
    }
    public void setCollectData(String collectData) {
        this.collectData = collectData;
    }
    public String getSpecialValId() {
        return this.specialValId;
    }
    public void setSpecialValId(String specialValId) {
        this.specialValId = specialValId;
    }
    public boolean getIsHandled() {
        return this.isHandled;
    }
    public void setIsHandled(boolean isHandled) {
        this.isHandled = isHandled;
    }
    public int getRetryNum() {
        return this.retryNum;
    }
    public void setRetryNum(int retryNum) {
        this.retryNum = retryNum;
    }
    public int getRemakeNum() {
        return this.remakeNum;
    }
    public void setRemakeNum(int remakeNum) {
        this.remakeNum = remakeNum;
    }

}
