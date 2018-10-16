package com.lc.core.bean;

import java.io.Serializable;

/**
 * Created by Administrator on 2018/6/5.
 */

public class TimeSelectBean implements Serializable, Comparable<TimeSelectBean> {
    private static final long serialVersionUID = 7648854026550507855L;
    private String id;
    private String mn;
    private String time;
    //允许点击中的是否选中
    private boolean select = false;
    //是否允许点击
    private boolean enable = true;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isSelect() {
        return select;
    }

    public void setSelect(boolean select) {
        this.select = select;
    }

    public boolean isEnable() {
        return enable;
    }

    public void setEnable(boolean enable) {
        this.enable = enable;
    }

    public String getMn() {
        return mn;
    }

    public void setMn(String mn) {
        this.mn = mn;
    }

    @Override
    public int compareTo(TimeSelectBean bean) {
        int id = Integer.valueOf(bean.getId());

        int i = Integer.valueOf(this.getId()) - id;
        return i;
    }

}
