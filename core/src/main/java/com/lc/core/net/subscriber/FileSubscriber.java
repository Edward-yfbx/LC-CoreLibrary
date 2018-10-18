package com.lc.core.net.subscriber;


import com.lc.core.net.body.ProgressEvent;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;
import org.greenrobot.eventbus.ThreadMode;

import rx.Subscriber;

/**
 * Author:Edward
 * Date:2018/5/4
 * Description:
 */

public abstract class FileSubscriber<T> extends Subscriber<T> {


    public FileSubscriber() {
        EventBus.getDefault().register(this);
    }

    @Override
    public void onCompleted() {
        EventBus.getDefault().unregister(this);
    }

    @Override
    public void onError(Throwable e) {
        e.printStackTrace();
        EventBus.getDefault().unregister(this);
    }

    public abstract void updateProgress(int percent);


    @Subscribe(threadMode = ThreadMode.MAIN)
    public void onProgress(ProgressEvent event) {
        updateProgress(event.percent);
    }
}
