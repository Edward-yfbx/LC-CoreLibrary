package com.lc.core.bean;


import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * 审核数据
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class AuditData {
    @Id(autoincrement = true)
    private Long id;

    //点位id
    private String pointId;
    //审核类型 字典
    private String auditType;
    //数据统计数据
    private String dataStatsTime;
    //设备监控因子id
    private String deviceMonitorGeneId;
    //最小值
    private double afterAuditMin;
    //最大值
    private double afterAuditMax;
    //平均值
    private double afterAuditAvg;
    //排量
    private double afterAuditEmission;
    //记录状态
    private int recordStatus;

    //是否已处理
    private boolean isHandled;
    //重试次数
    private int retryNum;
    //重置次数
    private int remakeNum;
    @Generated(hash = 177962074)
    public AuditData(Long id, String pointId, String auditType,
            String dataStatsTime, String deviceMonitorGeneId, double afterAuditMin,
            double afterAuditMax, double afterAuditAvg, double afterAuditEmission,
            int recordStatus, boolean isHandled, int retryNum, int remakeNum) {
        this.id = id;
        this.pointId = pointId;
        this.auditType = auditType;
        this.dataStatsTime = dataStatsTime;
        this.deviceMonitorGeneId = deviceMonitorGeneId;
        this.afterAuditMin = afterAuditMin;
        this.afterAuditMax = afterAuditMax;
        this.afterAuditAvg = afterAuditAvg;
        this.afterAuditEmission = afterAuditEmission;
        this.recordStatus = recordStatus;
        this.isHandled = isHandled;
        this.retryNum = retryNum;
        this.remakeNum = remakeNum;
    }
    @Generated(hash = 1086077457)
    public AuditData() {
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
    public String getAuditType() {
        return this.auditType;
    }
    public void setAuditType(String auditType) {
        this.auditType = auditType;
    }
    public String getDataStatsTime() {
        return this.dataStatsTime;
    }
    public void setDataStatsTime(String dataStatsTime) {
        this.dataStatsTime = dataStatsTime;
    }
    public String getDeviceMonitorGeneId() {
        return this.deviceMonitorGeneId;
    }
    public void setDeviceMonitorGeneId(String deviceMonitorGeneId) {
        this.deviceMonitorGeneId = deviceMonitorGeneId;
    }
    public double getAfterAuditMin() {
        return this.afterAuditMin;
    }
    public void setAfterAuditMin(double afterAuditMin) {
        this.afterAuditMin = afterAuditMin;
    }
    public double getAfterAuditMax() {
        return this.afterAuditMax;
    }
    public void setAfterAuditMax(double afterAuditMax) {
        this.afterAuditMax = afterAuditMax;
    }
    public double getAfterAuditAvg() {
        return this.afterAuditAvg;
    }
    public void setAfterAuditAvg(double afterAuditAvg) {
        this.afterAuditAvg = afterAuditAvg;
    }
    public double getAfterAuditEmission() {
        return this.afterAuditEmission;
    }
    public void setAfterAuditEmission(double afterAuditEmission) {
        this.afterAuditEmission = afterAuditEmission;
    }
    public int getRecordStatus() {
        return this.recordStatus;
    }
    public void setRecordStatus(int recordStatus) {
        this.recordStatus = recordStatus;
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
