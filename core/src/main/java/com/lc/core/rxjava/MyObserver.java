package com.lc.core.rxjava;


import io.reactivex.functions.Consumer;

/**
 * Author:Edward
 * Date:2018/6/8
 * Description:
 */

public class MyObserver<T> implements Consumer<T> {

    private Subscriber<T> subscriber;

    public MyObserver(Subscriber<T> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void accept(T t) throws Exception {
        subscriber.onNext(t);
    }
}
