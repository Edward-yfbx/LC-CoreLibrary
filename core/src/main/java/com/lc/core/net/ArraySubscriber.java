package com.lc.core.net;

import android.content.Context;


import com.lc.core.net.subscriber.NetSubscriber;

import java.util.List;

/**
 * Date:2017/12/15
 * Author:Edward
 * Description:
 */

public abstract class ArraySubscriber<T> extends NetSubscriber<NetResult<List<T>>> {

    public ArraySubscriber() {
    }

    public ArraySubscriber(Context context) {
        super(context);
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);

    }

    @Override
    public void onNext(NetResult<List<T>> result) {
        onSuccess(result);
    }

    public abstract void onSuccess(NetResult<List<T>> result);

}
