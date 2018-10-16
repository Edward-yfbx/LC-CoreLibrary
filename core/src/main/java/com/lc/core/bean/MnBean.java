package com.lc.core.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2018/6/8.
 * 给数采仪配置工作时间，
 */

public class MnBean implements Serializable {

    private String mn;
    //企业名称
    private String EnterpriseName;
    //点位
    private String point;

    private boolean select;
    private String time;

    private List<TimeSelectBean> timeList;

    public String getEnterpriseName() {
        return EnterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        EnterpriseName = enterpriseName;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public List<TimeSelectBean> getTimeList() {
        return timeList;
    }

    public void setTimeList(List<TimeSelectBean> timeList) {
        this.timeList = timeList;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
