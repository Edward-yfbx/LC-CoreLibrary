package com.lc.core.base;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import com.lc.core.bean.DaoMaster;
import com.lc.core.bean.DaoSession;


/**
 * Created by leo on 2018/3/23 14:31.
 * Contact:　　　lvyongxu@gmail.com
 * Description:
 */

public class BaseApp extends Application {

    private static BaseApp instance;
    private static DaoSession daoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        setupDatabase();
        //LitePal.initialize(this);
    }

    public static BaseApp getInstance() {
        return instance;
    }


    private void setupDatabase() {
        //创建数据库
        DaoMaster.DevOpenHelper helper = new DaoMaster.DevOpenHelper(this, "greendao.db", null);
        //获得可写数据库
        SQLiteDatabase db = helper.getWritableDatabase();
        //获得数据库对象
        DaoMaster daoMaster = new DaoMaster(db);
        //获得dao对象管理者
        daoSession = daoMaster.newSession();
    }

    public static DaoSession getDaoInstant() {
        return daoSession;
    }
}
