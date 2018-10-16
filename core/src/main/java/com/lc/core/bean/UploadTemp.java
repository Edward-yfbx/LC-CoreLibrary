package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Generated;
import org.greenrobot.greendao.annotation.Id;

/**
 * Author:Edward
 * Date:2018/9/5
 * Description:上传临时表，用于保存上传失败的数据
 */

@Entity
public class UploadTemp {

    @Id(autoincrement = true)
    private Long id;

    private String data;
    private String ip;
    private int port;
    private int retry;

    @Generated(hash = 268644000)
    public UploadTemp(Long id, String data, String ip, int port, int retry) {
        this.id = id;
        this.data = data;
        this.ip = ip;
        this.port = port;
        this.retry = retry;
    }

    public UploadTemp(String data, String ip, int port, int retry) {
        this.data = data;
        this.ip = ip;
        this.port = port;
        this.retry = retry;
    }

    @Generated(hash = 1441181064)
    public UploadTemp() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public int getRetry() {
        return retry;
    }

    public void setRetry(int retry) {
        this.retry = retry;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }
}
