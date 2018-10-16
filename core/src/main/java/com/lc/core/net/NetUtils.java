package com.lc.core.net;

import okhttp3.Headers;


/**
 * Date:2017/12/12
 * Author:Edward
 * Description:
 */
public class NetUtils extends BaseNetCreator {

    private static final String HOST = "http://47.105.104.177:8081/burgerkingeam/";


    public synchronized static <T> T api(Class<T> clazz) {
        return new NetUtils().create(clazz);
    }

    @Override
    public String getHost() {
        return HOST;
    }

    @Override
    public Headers addHeaders() {
        Headers.Builder builder = new Headers.Builder();
        //builder.add("userId", "");
        return builder.build();
    }

    @Override
    public boolean printLog() {
        return true;
    }

    @Override
    public boolean needDownloadProgress() {
        return false;
    }
}
