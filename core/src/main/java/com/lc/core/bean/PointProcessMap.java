package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.Generated;

/**
 * Created by leo on 2018/6/7 09:27.
 * Contact:　　　lvyongxu@gmail.com
 * Description: 点位工况图
 */
@Entity
public class PointProcessMap {
    @Id(autoincrement = true)
    private Long id;

    //FK1 点位ID
    private String pointId;
    //组号
    private String groupNumber;
    //初始化器
    private String initializer;
    //场景模版
    private String sceneTemp;
    //创建时间
    private String creationTime;
    //创建用户ID
    private String creatorUserId;
    @Generated(hash = 19001365)
    public PointProcessMap(Long id, String pointId, String groupNumber,
            String initializer, String sceneTemp, String creationTime,
            String creatorUserId) {
        this.id = id;
        this.pointId = pointId;
        this.groupNumber = groupNumber;
        this.initializer = initializer;
        this.sceneTemp = sceneTemp;
        this.creationTime = creationTime;
        this.creatorUserId = creatorUserId;
    }
    @Generated(hash = 672194631)
    public PointProcessMap() {
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
    public String getGroupNumber() {
        return this.groupNumber;
    }
    public void setGroupNumber(String groupNumber) {
        this.groupNumber = groupNumber;
    }
    public String getInitializer() {
        return this.initializer;
    }
    public void setInitializer(String initializer) {
        this.initializer = initializer;
    }
    public String getSceneTemp() {
        return this.sceneTemp;
    }
    public void setSceneTemp(String sceneTemp) {
        this.sceneTemp = sceneTemp;
    }
    public String getCreationTime() {
        return this.creationTime;
    }
    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }
    public String getCreatorUserId() {
        return this.creatorUserId;
    }
    public void setCreatorUserId(String creatorUserId) {
        this.creatorUserId = creatorUserId;
    }

}
