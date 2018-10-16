package com.lc.core.net;

import android.content.Context;

import com.lc.core.net.subscriber.NetSubscriber;


/**
 * Date:2017/12/15
 * Author:Edward
 * Description:
 */

public abstract class EntitySubscriber<T> extends NetSubscriber<NetResult<T>> {

    public EntitySubscriber() {
    }

    public EntitySubscriber(Context context) {
        super(context);
    }

    @Override
    public void onError(Throwable e) {
        super.onError(e);
    }

    @Override
    public void onNext(NetResult<T> tNetResult) {
        super.onNext(tNetResult);
    }

    public abstract void onSuccess(NetResult<T> result);


}
