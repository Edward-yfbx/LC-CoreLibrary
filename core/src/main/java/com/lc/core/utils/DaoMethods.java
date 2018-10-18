package com.lc.core.utils;

import android.util.Log;

import com.lc.core.base.BaseApp;
import com.lc.core.bean.AuditData;
import com.lc.core.bean.AuditDataDao;
import com.lc.core.bean.CollectTimeConfigure;
import com.lc.core.bean.CollectTimeConfigureDao;
import com.lc.core.bean.CollectionContent;
import com.lc.core.bean.ConnectProtocol;
import com.lc.core.bean.ConnectProtocolDao;
import com.lc.core.bean.DaoSession;
import com.lc.core.bean.DescDicInfo;
import com.lc.core.bean.DescDicInfoDao;
import com.lc.core.bean.DeviceBelongInfo;
import com.lc.core.bean.DeviceBelongInfoDao;
import com.lc.core.bean.DeviceInfo;
import com.lc.core.bean.DeviceInfoDao;
import com.lc.core.bean.DeviceInstallInfo;
import com.lc.core.bean.DeviceInstallInfoDao;
import com.lc.core.bean.DeviceMonitorGene;
import com.lc.core.bean.DeviceMonitorGeneDao;
import com.lc.core.bean.DeviceMonitorParameter;
import com.lc.core.bean.DeviceMonitorParameterDao;
import com.lc.core.bean.LatestData;
import com.lc.core.bean.LatestDataDao;
import com.lc.core.bean.MnBean;
import com.lc.core.bean.MonitorGeneInfo;
import com.lc.core.bean.MonitorGeneInfoDao;
import com.lc.core.bean.MonitorObject;
import com.lc.core.bean.OriginalData;
import com.lc.core.bean.OriginalDataDao;
import com.lc.core.bean.ParameterGene;
import com.lc.core.bean.ParameterGeneDao;
import com.lc.core.bean.ReviewBean;
import com.lc.core.bean.SetControlBean;
import com.lc.core.rxjava.RxUtil;
import com.lc.core.rxjava.Subscriber;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.async.AsyncOperation;
import org.greenrobot.greendao.async.AsyncOperationListener;
import org.greenrobot.greendao.async.AsyncSession;
import org.greenrobot.greendao.query.QueryBuilder;
import org.greenrobot.greendao.query.WhereCondition;

import java.util.ArrayList;
import java.util.List;

/**
 * 数据库方法
 * Created by 张明_ on 2018/3/26.
 * Email 741183142@qq.com
 */

public class DaoMethods {

    private static final String TAG = DaoMethods.class.getSimpleName();

    private static final Object LOCK = new Object();
    private static DaoMethods daoMethods;

    public static DaoMethods getInstance() {
        if (daoMethods == null) {
            synchronized (LOCK) {
                if (daoMethods == null) {
                    daoMethods = new DaoMethods();
                }
            }
        }
        return daoMethods;
    }


    public DaoSession getDaoSession() {
        return BaseApp.getDaoInstant();
    }

    public void saveDeviceInstallInfo(DeviceInstallInfo installInfo) {
        long id = getDaoSession().getDeviceInstallInfoDao().insert(installInfo);
        Log.e(TAG, "saveDeviceInstallInfo: id=" + id);
    }

    /**
     * 按条件查询一条数据 返回唯一或者null
     *
     * @param listener
     */
    public void getData(DaoSession daoSession, QueryBuilder queryBuilder, AsyncOperationListener listener) {
        AsyncSession asyncSession = daoSession.startAsyncSession();
        asyncSession.setListener(listener);
        asyncSession.queryUnique(queryBuilder.build());
    }

    /**
     * 删除
     */
    public void deleteData(DaoSession daoSession, QueryBuilder queryBuilder, AsyncOperationListener listener) {
        AsyncSession asyncSession = daoSession.startAsyncSession();
        asyncSession.setListener(listener);
        asyncSession.delete(queryBuilder.unique());
    }

    /**
     * 按条件查询一条数据 返回唯一或者null
     *
     * @param listener
     */
    public void updateData(DaoSession daoSession, Class clazz, AsyncOperationListener listener) {
        daoSession.update(clazz);
    }

    /**
     * 按条件查询所有数据
     *
     * @param listener
     */
    public void getList(DaoSession daoSession, QueryBuilder queryBuilder, AsyncOperationListener listener) {
        AsyncSession asyncSession = daoSession.startAsyncSession();
        asyncSession.setListener(listener);
        asyncSession.queryList(queryBuilder.build().forCurrentThread());
    }


    /**
     * 查询最新数据表
     *
     * @param deviceMonitorGeneId 设备监控因子id
     * @return LatestData
     */
    public LatestData queryLD(long deviceMonitorGeneId) {
        return getDaoSession().getLatestDataDao().queryBuilder()
                .where(LatestDataDao.Properties.DeviceMonitorGeneId.eq(deviceMonitorGeneId)).unique();

    }

    /**
     * 更新最新数据表
     *
     * @param latestData 最新数据
     */
    public void updateLD(LatestData latestData) {
        getDaoSession().getLatestDataDao().update(latestData);
    }

    /**
     * 查询原始数据表
     *
     * @param deviceMonitorGeneId 设备监控因子id
     * @return OriginalData
     */
    public OriginalData queryOD(long deviceMonitorGeneId) {
        return getDaoSession().getOriginalDataDao().queryBuilder()
                .where(OriginalDataDao.Properties.DeviceMonitorGeneId.eq(deviceMonitorGeneId)).unique();

    }

    /**
     * 更新原始数据表
     *
     * @param originalData 最新数据
     */
    public void updateOD(OriginalData originalData) {
        getDaoSession().getOriginalDataDao().update(originalData);
    }

    /**
     * 查询审核数据表
     *
     * @param deviceMonitorGeneId 设备监控因子id
     * @return OriginalData
     */
    public AuditData queryAD(long deviceMonitorGeneId) {
        return getDaoSession().getAuditDataDao().queryBuilder()
                .where(AuditDataDao.Properties.DeviceMonitorGeneId.eq(deviceMonitorGeneId)).unique();

    }

    /**
     * 更新审核数据表
     *
     * @param auditData 最新数据
     */
    public void updateAD(AuditData auditData) {
        getDaoSession().getAuditDataDao().update(auditData);
    }

    /**
     * 字典表插入数据
     *
     * @param descDicInfo
     */
    public void insertDictionary(DescDicInfo descDicInfo) {
        getDaoSession().getDescDicInfoDao().insert(descDicInfo);
    }


    /**
     * 查询协议名称
     *
     * @return 协议名称
     */
    public String queryProtocolName(String deviceBelong) {
        ConnectProtocol unique = getDaoSession().getConnectProtocolDao().queryBuilder().where(ConnectProtocolDao
                .Properties.DeviceBelong.eq(deviceBelong)).unique();
        return unique.getProtocolName();
    }

//    /**
//     * 查询设备监控因子ID和特殊值ID
//     *
//     * @param st                 监控类型
//     * @param code               对象编码
//     * @param dataType           数据类型
//     * @param deviceInstalInfoId 设备安装信息id
//     * @return
//     */
//    public Result queryGeneIdAndSVId(String st, String code, String dataType
//            , long deviceInstalInfoId) {
//        Result result = new Result();
//        String monitorTypeStr = "";
//        String objectCodeStr = "";
//        DescDicInfo objectCodeDescDicInfo = getDaoSession().getDescDicInfoDao().queryBuilder().where(DescDicInfoDao.Properties
//                .DicType.eq("ObjectCode"), DescDicInfoDao.Properties.DicKeyword.eq(code)).unique();
//        objectCodeStr = objectCodeDescDicInfo.getId();
//
//        List<DescDicInfo> monitorType = getDaoSession().getDescDicInfoDao().queryBuilder()
//                .where(DescDicInfoDao.Properties.DicType.eq("MonitorType")).list();
//        for (DescDicInfo descDicInfo : monitorType) {
//            String dicEntity = descDicInfo.getDicEntity();
//            if (!TextUtils.isEmpty(dicEntity) && !"q@w".equals(dicEntity)) {
//                String[] split = dicEntity.split("<ST>");
//                if (split.length == 2) {
//                    String[] strings = split[1].split("</ST>");
//                    if (strings[0].equals(st)) {
//                        monitorTypeStr = descDicInfo.getId();
//                        break;
//                    }
//                }
//            }
//        }
//
//        MonitorObject monitorObject = getDaoSession().getMonitorObjectDao().queryBuilder().where(
//                MonitorObjectDao.Properties.ObjCode.eq(objectCodeStr),
//                MonitorObjectDao.Properties.MonitorType.eq(monitorTypeStr)).unique();
//        String monitorObjectId = monitorObject.getId();
//        DescDicInfo dataTypeDescDicInfo = getDaoSession().getDescDicInfoDao().queryBuilder().where(DescDicInfoDao.Properties
//                .DicType.eq("DataType"), DescDicInfoDao.Properties.DicKeyword.eq(dataType)).unique();
//        String dataId = dataTypeDescDicInfo.getId();
//        MonitorGeneInfo monitorGeneInfo = getDaoSession().getMonitorGeneInfoDao().queryBuilder()
//                .where(MonitorGeneInfoDao.Properties.MonitorObjId.eq(monitorObjectId),
//                        MonitorGeneInfoDao.Properties.DataType.eq(dataId)).unique();
//        String monitorGeneInfoId = monitorGeneInfo.getId();
//        DeviceMonitorGene deviceMonitorGene = getDaoSession().getDeviceMonitorGeneDao().queryBuilder()
//                .where(DeviceMonitorGeneDao.Properties.MonitorGeneInfoId.eq(monitorGeneInfoId),
//                        DeviceMonitorGeneDao.Properties.DeviceInstallInfoId.eq(deviceInstalInfoId)).unique();
//        result.setId(deviceMonitorGene.getId());
//
//        SpecialValue specialValue = getDaoSession().getSpecialValueDao().queryBuilder()
//                .where(SpecialValueDao.Properties.MonitorObjId.eq(monitorObjectId),
//                        SpecialValueDao.Properties.DataType.eq(dataId)).unique();
//        result.setSpecialValueId(specialValue.getId());
//
//        return result;
//    }
//
//
//    /**
//     * 查询参数ID和特殊值ID
//     *
//     * @param st                 监控类型
//     * @param code               对象编码
//     * @param dataType           数据类型
//     * @param deviceInstalInfoId 设备安装信息id
//     * @return
//     */
//    public Result queryParameterIdAndSVId(String st, String code, String dataType
//            , long deviceInstalInfoId) {
//        Result result = new Result();
//        String monitorTypeStr = "";
//        String objectCodeStr = "";
//        DescDicInfo objectCodeDescDicInfo = getDaoSession().getDescDicInfoDao().queryBuilder().where(DescDicInfoDao.Properties
//                .DicType.eq("ObjectCode"), DescDicInfoDao.Properties.DicKeyword.eq(code)).unique();
//        objectCodeStr = objectCodeDescDicInfo.getId();
//
//        List<DescDicInfo> monitorType = getDaoSession().getDescDicInfoDao().queryBuilder()
//                .where(DescDicInfoDao.Properties.DicType.eq("MonitorType")).list();
//        for (DescDicInfo descDicInfo : monitorType) {
//            String dicEntity = descDicInfo.getDicEntity();
//            if (!TextUtils.isEmpty(dicEntity) && !"q@w".equals(dicEntity)) {
//                String[] split = dicEntity.split("<ST>");
//                if (split.length == 2) {
//                    String[] strings = split[1].split("</ST>");
//                    if (strings[0].equals(st)) {
//                        monitorTypeStr = descDicInfo.getId();
//                        break;
//                    }
//                }
//            }
//        }
//
//        MonitorObject monitorObject = getDaoSession().getMonitorObjectDao().queryBuilder().where(
//                MonitorObjectDao.Properties.ObjCode.eq(objectCodeStr),
//                MonitorObjectDao.Properties.MonitorType.eq(monitorTypeStr)).unique();
//        String monitorObjectId = monitorObject.getId();
//        DescDicInfo dataTypeDescDicInfo = getDaoSession().getDescDicInfoDao().queryBuilder().where(DescDicInfoDao.Properties
//                .DicType.eq("DataType"), DescDicInfoDao.Properties.DicKeyword.eq(dataType)).unique();
//        String dataId = dataTypeDescDicInfo.getId();
//        ParameterGene parameterGene = getDaoSession().getParameterGeneDao().queryBuilder()
//                .where(ParameterGeneDao.Properties.MonitorObjId.eq(monitorObjectId),
//                        ParameterGeneDao.Properties.DataType.eq(dataId)).unique();
//        String parameterGeneId = parameterGene.getId();
//        DeviceInstallInfo deviceInstallInfo = getDaoSession().getDeviceInstallInfoDao().queryBuilder()
//                .where(DeviceInstallInfoDao.Properties.Id.eq(deviceInstalInfoId)).unique();
//        long deviceBelongInfoId = deviceInstallInfo.getDeviceBelongInfoId();
//        DeviceMonitorParameter deviceMonitorParameter = getDaoSession().getDeviceMonitorParameterDao().queryBuilder()
//                .where(DeviceMonitorParameterDao.Properties.ParmGeneId.eq(parameterGeneId),
//                        DeviceMonitorParameterDao.Properties.DeviceBelongInfoId.eq(deviceBelongInfoId)).unique();
//        result.setId(deviceMonitorParameter.getId());
//
//        SpecialValue specialValue = getDaoSession().getSpecialValueDao().queryBuilder()
//                .where(SpecialValueDao.Properties.MonitorObjId.eq(monitorObjectId),
//                        SpecialValueDao.Properties.DataType.eq(dataId)).unique();
//        result.setSpecialValueId(specialValue.getId());
//
//        return result;
//    }


    /**
     * HJ212字段名转Keyword
     *
     * @param string
     * @return
     */
    public String rtdToKeyword(String string) {
        String result = "";
        switch (string) {
            case "Rtd":
                result = "Default";
                break;
            case "Min":
                result = "TotalizeMin";
                break;
            case "Avg":
                result = "TotalizeAverage";
                break;
            case "Max":
                result = "TotalizeMax";
                break;
            case "ZsRtd":
                result = "CorrectedDefault";
                break;
            case "ZsMin":
                result = "CorrectedMin";
                break;
            case "ZsAvg":
                result = "CorrectedAverage";
                break;
            case "ZsMax":
                result = "CorrectedMax";
                break;
            case "Cou":
                result = "Totalize";
                break;
        }

        return result;
    }

    /**
     * 删除在线仪配置的因子
     */
    public void deleteGene(CollectionContent collectionContent, final onFinishListener listener) {

        deleteData(BaseApp.getDaoInstant(), BaseApp.getDaoInstant().getDeviceMonitorGeneDao().queryBuilder()
                .where(DeviceMonitorGeneDao.Properties.Id.eq(collectionContent.getId())), new AsyncOperationListener() {
            @Override
            public void onAsyncOperationCompleted(AsyncOperation operation) {
                if (operation.isCompletedSucessfully()) {
                    listener.onSuccess();
                    Log.e("DaoMethods", "删除成功");
                } else {
                    listener.onFail("删除因子信息失败");
                }
            }
        });
    }

    /**
     * 删除采集配置流程数据
     */
    private List<DeviceMonitorParameter> deviceMonitorParameters = null;
    private List<DeviceMonitorGene> deviceMonitorGenes = null;
    private List<CollectTimeConfigure> collectTimeConfigures = null;
    //设备安装信息
    private DeviceInstallInfo deviceInstallInfo = null;
    //根据设备信息id找到 设备归属信息id
    private DeviceBelongInfo deviceBelongInfo = null;

    /**
     * 删除配置的在线仪
     *
     * @param reviewBean
     * @param listener
     */
    public void delete(ReviewBean reviewBean, final onFinishListener listener) {

        //设备安装信息
        deviceInstallInfo = BaseApp.getDaoInstant().getDeviceInstallInfoDao().queryBuilder()
                .where(DeviceInstallInfoDao.Properties.Id.eq(reviewBean.getDeviceInstallId())).uniqueOrThrow();

        //根据设备安装信息找到 设备归属信息id
        deviceBelongInfo = BaseApp.getDaoInstant().getDeviceBelongInfoDao().queryBuilder()
                .where(DeviceBelongInfoDao.Properties.Id.eq(deviceInstallInfo.getDeviceBelongInfoId())).uniqueOrThrow();


        //采集时段配置表
        collectTimeConfigures = BaseApp.getDaoInstant().getCollectTimeConfigureDao().queryBuilder()
                .where(CollectTimeConfigureDao.Properties.DeviceInstallInfoId.eq(deviceInstallInfo.getId())).list();

        //设备监控因子表
        deviceMonitorGenes = BaseApp.getDaoInstant().getDeviceMonitorGeneDao().queryBuilder()
                .where(DeviceMonitorGeneDao.Properties.DeviceInstallInfoId.eq(deviceInstallInfo.getId())).list();

        //设备监控参数
        deviceMonitorParameters = BaseApp.getDaoInstant().getDeviceMonitorParameterDao().queryBuilder()
                .where(DeviceMonitorParameterDao.Properties.DeviceBelongInfoId.eq(deviceBelongInfo.getId())).list();

        deleteDeviceMonitorParameters(new onFinishListener() {
            @Override
            public void onSuccess() {
                deleteDdeviceMonitorGenes(new onFinishListener() {
                    @Override
                    public void onSuccess() {
                        deleteCollectTimeConfigures(new onFinishListener() {
                            @Override
                            public void onSuccess() {
                                deleteData(BaseApp.getDaoInstant()
                                        , BaseApp.getDaoInstant().getDeviceInstallInfoDao().queryBuilder()
                                                .where(DeviceInstallInfoDao.Properties.Id.eq(deviceInstallInfo.getId()))
                                        , new AsyncOperationListener() {
                                            @Override
                                            public void onAsyncOperationCompleted(AsyncOperation operation) {
                                                if (operation.isCompletedSucessfully()) {
                                                    deleteData(BaseApp.getDaoInstant()
                                                            , BaseApp.getDaoInstant().getDeviceBelongInfoDao().queryBuilder()
                                                                    .where(DeviceBelongInfoDao.Properties.Id.eq(deviceBelongInfo.getId()))
                                                            , new AsyncOperationListener() {
                                                                @Override
                                                                public void onAsyncOperationCompleted(AsyncOperation operation) {
                                                                    if (operation.isCompletedSucessfully()) {
                                                                        listener.onSuccess();
                                                                        Log.e("DaoMethods", "删除成功");
                                                                    } else {
                                                                        listener.onFail("设备安装信息删除失败");
                                                                        Log.e("DaoMethods", "设备归属信息删除失败");
                                                                    }
                                                                }
                                                            });
                                                } else {
                                                    listener.onFail("设备安装信息删除失败");
                                                    Log.e("DaoMethods", "设备安装信息删除失败");
                                                }


                                            }
                                        });

                            }

                            @Override
                            public void onFail(String error) {
                                listener.onFail(error);
                                Log.e("DaoMethods", "删除数据失败" + error);
                            }
                        });
                    }

                    @Override
                    public void onFail(String error) {
                        listener.onFail(error);
                        Log.e("DaoMethods", "删除数据失败" + error);
                    }
                });
            }

            @Override
            public void onFail(String error) {
                listener.onFail(error);
                Log.e("DaoMethods", "删除数据失败" + error);
            }
        });
    }

    //采集时段配置表
    private void deleteCollectTimeConfigures(final onFinishListener listener) {
        if (collectTimeConfigures.isEmpty()) {
            listener.onSuccess();
            return;
        }
        DaoMethods.getInstance().deleteData(BaseApp.getDaoInstant()
                , BaseApp.getDaoInstant().getCollectTimeConfigureDao().queryBuilder()
                        .where(CollectTimeConfigureDao.Properties.Id.eq(collectTimeConfigures.get(0).getId()))
                , new AsyncOperationListener() {
                    @Override
                    public void onAsyncOperationCompleted(AsyncOperation operation) {
                        if (operation.isCompletedSucessfully()) {
                            collectTimeConfigures.remove(0);
                            deleteCollectTimeConfigures(listener);
                        } else {
                            listener.onFail("采集时段配置删除失败");
                            return;
                        }
                    }
                });
    }

    //设备监控参数
    private void deleteDeviceMonitorParameters(final onFinishListener listener) {
        if (deviceMonitorParameters.isEmpty()) {
            listener.onSuccess();
            return;
        }
        deleteData(BaseApp.getDaoInstant()
                , BaseApp.getDaoInstant().getDeviceMonitorParameterDao().queryBuilder()
                        .where(DeviceMonitorParameterDao.Properties.Id.eq(deviceMonitorParameters.get(0).getId()))
                , new AsyncOperationListener() {
                    @Override
                    public void onAsyncOperationCompleted(AsyncOperation operation) {
                        if (operation.isCompletedSucessfully()) {
                            deviceMonitorParameters.remove(0);
                            deleteDeviceMonitorParameters(listener);
                        } else {
                            listener.onFail("设备监控参数删除失败");
                            return;
                        }
                    }
                });
    }

    //设备监控因子
    private void deleteDdeviceMonitorGenes(final onFinishListener listener) {
        if (deviceMonitorGenes.isEmpty()) {
            listener.onSuccess();
            return;
        }
        deleteData(BaseApp.getDaoInstant()
                , BaseApp.getDaoInstant().getDeviceMonitorGeneDao().queryBuilder()
                        .where(DeviceMonitorGeneDao.Properties.Id.eq(deviceMonitorGenes.get(0).getId()))
                , new AsyncOperationListener() {
                    @Override
                    public void onAsyncOperationCompleted(AsyncOperation operation) {
                        if (operation.isCompletedSucessfully()) {
                            deviceMonitorGenes.remove(0);
                            deleteDdeviceMonitorGenes(listener);
                        } else {
                            listener.onFail("设备监控因子表删除失败");
                            return;
                        }
                    }
                });
    }

    public interface onFinishListener {
        void onSuccess();

        void onFail(String error);
    }

    /**
     * 查询设备对应的协议
     */
    private static String getProtocolName(String deviceBelongInfoId) {
        DeviceBelongInfoDao deviceBelongInfoDao = BaseApp.getDaoInstant().getDeviceBelongInfoDao();
        DeviceBelongInfo deviceBelongInfo = deviceBelongInfoDao.load(deviceBelongInfoId);
        String deviceInfoId = deviceBelongInfo.getDeviceInfoId();

        ConnectProtocolDao protocolDao = BaseApp.getDaoInstant().getConnectProtocolDao();
        WhereCondition queryCondition = ConnectProtocolDao.Properties.DeviceBelong.eq(deviceInfoId);
        ConnectProtocol protocol = protocolDao.queryBuilder().where(queryCondition).unique();
        return protocol.getProtocolName();
    }

    /**
     * 获取全部配置实体集合
     */
    public List<ReviewBean> getReviewBeans() {
        List<ReviewBean> reviewBeans = new ArrayList<>();
        //查询所有在线仪
        List<DeviceInstallInfo> deviceInstallinfos = BaseApp.getDaoInstant().getDeviceInstallInfoDao().queryBuilder()
                .where(DeviceInstallInfoDao.Properties.MonitorType.notEq("default")).list();

        for (DeviceInstallInfo deviceInstallinfo : deviceInstallinfos) {
            ReviewBean reviewBean = new ReviewBean();
            //查询归属设备信息表获得设备信息id
            DeviceBelongInfo deviceBelongInfo = BaseApp.getDaoInstant().getDeviceBelongInfoDao().queryBuilder().where(
                    DeviceBelongInfoDao.Properties.Id.eq(deviceInstallinfo.getDeviceBelongInfoId())).uniqueOrThrow();

            //查询设备信息表获取设备品牌  类型
            DeviceInfo deviceInfo = BaseApp.getDaoInstant().getDeviceInfoDao().queryBuilder().where(
                    DeviceInfoDao.Properties.Id.eq(deviceBelongInfo.getDeviceInfoId())).uniqueOrThrow();

            DescDicInfo descDicInfo = BaseApp.getDaoInstant().getDescDicInfoDao().queryBuilder().where(
                    DescDicInfoDao.Properties.Id.eq(deviceInfo.getDeviceType())).uniqueOrThrow();
            // 设备安装信息id
            reviewBean.setDeviceInstallId(deviceInstallinfo.getId());
            // 设备归属信息id
            reviewBean.setDeviceBelongInfoId(deviceBelongInfo.getId());
            //设备类型名称
            reviewBean.setDeviceTypeName(descDicInfo.getDicDesc());
            //设备类型id
            reviewBean.setTypeId(deviceInfo.getDeviceType());
            //查询st
            String monitorType = BaseApp.getDaoInstant().getDescDicInfoDao().load(deviceInstallinfo.getMonitorType()).getDicEntity();
            String ST = monitorType.substring(monitorType.indexOf("<ST>") + 4, monitorType.indexOf("</ST>"));

            //查询品牌名字
            DescDicInfo DescDicInfo = BaseApp.getDaoInstant().getDescDicInfoDao().queryBuilder()
                    .where(DescDicInfoDao.Properties.Id.eq(deviceInfo.getDeviceBrand())).uniqueOrThrow();
            //设备品牌
            reviewBean.setBrand(DescDicInfo.getDicDesc());
            //品牌id
            reviewBean.setBrandId(deviceInfo.getDeviceBrand());
            //st 监控类型值
            reviewBean.setSt(ST);
            //485 地址
            reviewBean.setDeviceMac(deviceInstallinfo.getCommunicateAddress());
            //型号
            reviewBean.setModel(deviceInfo.getDeviceModelNumber());
            //com
            reviewBean.setCom(deviceInstallinfo.getComNum());
            //波特率
            reviewBean.setBaudRate(deviceInstallinfo.getBaudRate());
            //起始位
            reviewBean.setDataPotion(deviceInstallinfo.getStartBit());
            //停止位
            reviewBean.setStopPosition(deviceInstallinfo.getEndBit());
            //校验位
            reviewBean.setCheckoutBit(deviceInstallinfo.getCheckBit());
            //时间范围
            List<CollectTimeConfigure> collectTimeConfigures = BaseApp.getDaoInstant().getCollectTimeConfigureDao().queryBuilder().where(
                    CollectTimeConfigureDao.Properties.DeviceInstallInfoId.eq(deviceInstallinfo.getId())).list();

            //各个mn号对应的时间段
            List<MnBean> mnBeans = new ArrayList<>();
            for (CollectTimeConfigure collectTimeConfigure : collectTimeConfigures) {
                MnBean mnBean = new MnBean();

                //查询所有在线仪
                DeviceInstallInfo shucaiyi = BaseApp.getDaoInstant().getDeviceInstallInfoDao().queryBuilder()
                        .where(DeviceInstallInfoDao.Properties.Id.eq(collectTimeConfigure.getDeviceId())).uniqueOrThrow();

                mnBean.setMn(shucaiyi.getMnNum());

                mnBean.setTime(collectTimeConfigure.getCollectTime());
                mnBeans.add(mnBean);
            }

            reviewBean.setWorkTimeList(mnBeans);
            //监控参数

            List<DeviceMonitorParameter> deviceMonitorParameters = BaseApp.getDaoInstant().getDeviceMonitorParameterDao()
                    .queryBuilder().where(DeviceMonitorParameterDao.Properties.DeviceBelongInfoId
                            .eq(deviceBelongInfo.getId())).list();
            List<SetControlBean> setControlBeans = new ArrayList<>();

            for (DeviceMonitorParameter deviceMonitorParameter : deviceMonitorParameters) {
                ParameterGene parameterGene = BaseApp.getDaoInstant().getParameterGeneDao()
                        .queryBuilder().where(ParameterGeneDao.Properties.Id
                                .eq(deviceMonitorParameter.getParmGeneId())).uniqueOrThrow();

                SetControlBean setControlBean = new SetControlBean();
                //设备监控参数id
                setControlBean.setDeviceMonitorGeneId(deviceMonitorParameter.getId());
                //监控参数名称
                setControlBean.setMonitorGene(parameterGene.getGeneName());
                //监控对象id
                setControlBean.setMonitorObjId(parameterGene.getMonitorObjId());
                //参数因子id
                setControlBean.setId(parameterGene.getId());
                //别名
                setControlBean.setAlias(deviceMonitorParameter.getAlias());
                //标识
                setControlBean.setIdentification(deviceMonitorParameter.getIndentity());
                setControlBeans.add(setControlBean);
            }
            reviewBean.setSetControlBeans(setControlBeans);

            //设备监控因子
            List<DeviceMonitorGene> deviceMonitorGenes = BaseApp.getDaoInstant().getDeviceMonitorGeneDao()
                    .queryBuilder().where(DeviceMonitorGeneDao.Properties.DeviceInstallInfoId
                            .eq(deviceInstallinfo.getId())).list();

            ConnectProtocol connectProtocol = BaseApp.getDaoInstant().getConnectProtocolDao()
                    .queryBuilder().where(ConnectProtocolDao.Properties.DeviceBelong
                            .eq(deviceInfo.getId())).uniqueOrThrow();
            //协议名称
            reviewBean.setProcotol(connectProtocol.getProtocolName());

            //接口类型
            reviewBean.setInterfaceType(connectProtocol.getInterfaceType());
            List<CollectionContent> collectionContents = new ArrayList<>();
            for (DeviceMonitorGene deviceMonitorGene : deviceMonitorGenes) {

                MonitorGeneInfo monitorGeneInfo = BaseApp.getDaoInstant().getMonitorGeneInfoDao().queryBuilder().where(
                        MonitorGeneInfoDao.Properties.Id.like(deviceMonitorGene.getMonitorGeneInfoId())).unique();

                MonitorObject monitorObject = BaseApp.getDaoInstant().getMonitorObjectDao().load(monitorGeneInfo.getMonitorObjId());
                String code = monitorObject.getObjCode();

                DescDicInfo descDicInfo1 = BaseApp.getDaoInstant().getDescDicInfoDao().queryBuilder()
                        .where(DescDicInfoDao.Properties.Id.like(monitorObject.getObjType())).unique();

                CollectionContent collectionContent = new CollectionContent();
                //区别流量因子的类型   瞬时流量，累计流量
                collectionContent.setGeneName(monitorGeneInfo.getGeneName());
                //设备监控因子id
                collectionContent.setDeviceMonitorGeneId(deviceMonitorGene.getId());
                //因子类型名称，浓度流量开关省缺
                collectionContent.setObjectName(null == descDicInfo1 ? "" : descDicInfo1.getDicDesc());
                //监控对象id
                collectionContent.setMonitorObjId(monitorGeneInfo.getMonitorObjId());
                //数据类型
                collectionContent.setDataLb(monitorGeneInfo.getDataType());
                //监控对象编码
                collectionContent.setObjCode(code);
                //因子
                collectionContent.setGene(monitorGeneInfo.getGeneName());
                //接口类型
                collectionContent.setType(connectProtocol.getInterfaceType());
                //设备信息id
                collectionContent.setId(deviceMonitorGene.getId());
                //设备别名
                collectionContent.setAlias(deviceMonitorGene.getAlias());
                //监控因子信息id
                collectionContent.setGeneId(deviceMonitorGene.getMonitorGeneInfoId());
                //单位系数
                collectionContent.setCoefficient(deviceMonitorGene.getUnitCoefficient());
                //标识
                collectionContent.setIdentification(deviceMonitorGene.getIndentity());
                //通道号
                collectionContent.setChannelNumber(String.valueOf(deviceMonitorGene.getChannelNumber()));
                //操作口
                collectionContent.setOperatingMouth(String.valueOf(deviceMonitorGene.getOperationPort()));
                //量程上限
                collectionContent.setMax(deviceMonitorGene.getRangeCap());
                //量程下限
                collectionContent.setMin(deviceMonitorGene.getLowerLimit());
                collectionContents.add(collectionContent);
            }

            reviewBean.setCollectionContent(collectionContents);
            //添加到自定义实体中
            reviewBeans.add(reviewBean);
        }

        return reviewBeans;
    }
}
