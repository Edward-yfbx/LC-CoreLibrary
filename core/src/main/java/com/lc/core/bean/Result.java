package com.lc.core.bean;

/**
 * 返回结果
 * Created by 张明_ on 2018/4/9.
 * Email 741183142@qq.com
 */

public class Result {
    //因子id or 参数id
    private long id;
    //特殊值id
    private String specialValueId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSpecialValueId() {
        return specialValueId;
    }

    public void setSpecialValueId(String specialValueId) {
        this.specialValueId = specialValueId;
    }
}
