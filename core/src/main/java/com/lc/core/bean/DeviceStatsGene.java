package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;

import java.nio.DoubleBuffer;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 设备统计因子
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */
@Entity
public class DeviceStatsGene {
    @Id(autoincrement = false)
    private String id;

    //监控因子信息id
    private String monitorGeneInfoId;
    //报表类型
    private String reportType;
    //统计因子单位
    private String statsGeneUnit;
    //统计单位系数STATS_UNIT_COEFFICIENT
    private String statsUnitCoefficient;
    //统计最大值
    private boolean statsMax;
    //最小值
    private boolean statsMin;
    //平均值
    private boolean statsAvg;
    //排放量
    private boolean statsEmission;
    //显示最大值
    private boolean isShowMax;
    //显示最小值
    private boolean isShowMin;
    //显示平均值
    private boolean isShowAvg;
    //显示排放量
    private boolean isShowEmission;
    //最后修改时间
    private String lastModificationTime;
    @Generated(hash = 689519430)
    public DeviceStatsGene(String id, String monitorGeneInfoId, String reportType,
            String statsGeneUnit, String statsUnitCoefficient, boolean statsMax,
            boolean statsMin, boolean statsAvg, boolean statsEmission,
            boolean isShowMax, boolean isShowMin, boolean isShowAvg,
            boolean isShowEmission, String lastModificationTime) {
        this.id = id;
        this.monitorGeneInfoId = monitorGeneInfoId;
        this.reportType = reportType;
        this.statsGeneUnit = statsGeneUnit;
        this.statsUnitCoefficient = statsUnitCoefficient;
        this.statsMax = statsMax;
        this.statsMin = statsMin;
        this.statsAvg = statsAvg;
        this.statsEmission = statsEmission;
        this.isShowMax = isShowMax;
        this.isShowMin = isShowMin;
        this.isShowAvg = isShowAvg;
        this.isShowEmission = isShowEmission;
        this.lastModificationTime = lastModificationTime;
    }
    @Generated(hash = 1065031714)
    public DeviceStatsGene() {
    }
    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getMonitorGeneInfoId() {
        return this.monitorGeneInfoId;
    }
    public void setMonitorGeneInfoId(String monitorGeneInfoId) {
        this.monitorGeneInfoId = monitorGeneInfoId;
    }
    public String getReportType() {
        return this.reportType;
    }
    public void setReportType(String reportType) {
        this.reportType = reportType;
    }
    public String getStatsGeneUnit() {
        return this.statsGeneUnit;
    }
    public void setStatsGeneUnit(String statsGeneUnit) {
        this.statsGeneUnit = statsGeneUnit;
    }
    public String getStatsUnitCoefficient() {
        return this.statsUnitCoefficient;
    }
    public void setStatsUnitCoefficient(String statsUnitCoefficient) {
        this.statsUnitCoefficient = statsUnitCoefficient;
    }
    public boolean getStatsMax() {
        return this.statsMax;
    }
    public void setStatsMax(boolean statsMax) {
        this.statsMax = statsMax;
    }
    public boolean getStatsMin() {
        return this.statsMin;
    }
    public void setStatsMin(boolean statsMin) {
        this.statsMin = statsMin;
    }
    public boolean getStatsAvg() {
        return this.statsAvg;
    }
    public void setStatsAvg(boolean statsAvg) {
        this.statsAvg = statsAvg;
    }
    public boolean getStatsEmission() {
        return this.statsEmission;
    }
    public void setStatsEmission(boolean statsEmission) {
        this.statsEmission = statsEmission;
    }
    public boolean getIsShowMax() {
        return this.isShowMax;
    }
    public void setIsShowMax(boolean isShowMax) {
        this.isShowMax = isShowMax;
    }
    public boolean getIsShowMin() {
        return this.isShowMin;
    }
    public void setIsShowMin(boolean isShowMin) {
        this.isShowMin = isShowMin;
    }
    public boolean getIsShowAvg() {
        return this.isShowAvg;
    }
    public void setIsShowAvg(boolean isShowAvg) {
        this.isShowAvg = isShowAvg;
    }
    public boolean getIsShowEmission() {
        return this.isShowEmission;
    }
    public void setIsShowEmission(boolean isShowEmission) {
        this.isShowEmission = isShowEmission;
    }
    public String getLastModificationTime() {
        return this.lastModificationTime;
    }
    public void setLastModificationTime(String lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

}
