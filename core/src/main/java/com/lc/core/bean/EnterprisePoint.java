package com.lc.core.bean;

import org.greenrobot.greendao.annotation.Entity;
import org.greenrobot.greendao.annotation.Id;
import org.greenrobot.greendao.annotation.ToOne;
import org.greenrobot.greendao.annotation.Generated;

/**
 * 企业点位信息
 * Created by 张明_ on 2018/3/23.
 * Email 741183142@qq.com
 */
@Entity
public class EnterprisePoint {
    @Id(autoincrement = true)
    private Long id;

    //FK2 企业id
    private long enterpriseId;
    //FK1 点位id
    private long pointId;
    @Generated(hash = 1978200961)
    public EnterprisePoint(Long id, long enterpriseId, long pointId) {
        this.id = id;
        this.enterpriseId = enterpriseId;
        this.pointId = pointId;
    }
    @Generated(hash = 1408412371)
    public EnterprisePoint() {
    }
    public Long getId() {
        return this.id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public long getEnterpriseId() {
        return this.enterpriseId;
    }
    public void setEnterpriseId(long enterpriseId) {
        this.enterpriseId = enterpriseId;
    }
    public long getPointId() {
        return this.pointId;
    }
    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

//    @ToOne(joinProperty = "pointId")
//    private PointInfo pointInfo;


}
