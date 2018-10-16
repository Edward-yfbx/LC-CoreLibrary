package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.NotNull;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by leo on 2018/3/23 16:33.
 * Contact:　　　lvyongxu@gmail.com
 * Description: 上传配置
 */
@Entity
public class UploadConfigure {
    //PK
    @Id(autoincrement = true)
    private Long id;

    //FK1 设备安装信息ID
    private String deviceInstallInfoId;

    //上传IP
    @NotNull
    private String uploadIP;
    //上传端口 当类型为原始类型时，NotNull不起作用
    @NotNull
    private Integer uploadPort;
    //上传间隔
    @NotNull
    private Integer uploadSpace;
    //上传协议
    @NotNull
    private String uploadProtocol;

    @Generated(hash = 69686429)
    public UploadConfigure(Long id, String deviceInstallInfoId,
            @NotNull String uploadIP, @NotNull Integer uploadPort,
            @NotNull Integer uploadSpace, @NotNull String uploadProtocol) {
        this.id = id;
        this.deviceInstallInfoId = deviceInstallInfoId;
        this.uploadIP = uploadIP;
        this.uploadPort = uploadPort;
        this.uploadSpace = uploadSpace;
        this.uploadProtocol = uploadProtocol;
    }
    @Generated(hash = 1314979368)
    public UploadConfigure() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getDeviceInstallInfoId() {
        return this.deviceInstallInfoId;
    }

    public void setDeviceInstallInfoId(String deviceInstallInfoId) {
        this.deviceInstallInfoId = deviceInstallInfoId;
    }
    public String getUploadIP() {
        return this.uploadIP;
    }
    public void setUploadIP(String uploadIP) {
        this.uploadIP = uploadIP;
    }
    public Integer getUploadPort() {
        return this.uploadPort;
    }
    public void setUploadPort(Integer uploadPort) {
        this.uploadPort = uploadPort;
    }
    public Integer getUploadSpace() {
        return this.uploadSpace;
    }
    public void setUploadSpace(Integer uploadSpace) {
        this.uploadSpace = uploadSpace;
    }
    public String getUploadProtocol() {
        return this.uploadProtocol;
    }
    public void setUploadProtocol(String uploadProtocol) {
        this.uploadProtocol = uploadProtocol;
    }


    
}
