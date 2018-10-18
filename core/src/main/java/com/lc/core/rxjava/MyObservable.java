package com.lc.core.rxjava;


import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;

/**
 * Author:Edward
 * Date:2018/6/8
 * Description:
 */

public class MyObservable<T> implements ObservableOnSubscribe<T> {

    private Subscriber<T> subscriber;

    MyObservable(Subscriber<T> subscriber) {
        this.subscriber = subscriber;
    }

    @Override
    public void subscribe(ObservableEmitter<T> emitter) throws Exception {
        emitter.onNext(subscriber.onSubscribe());
        emitter.onComplete();
    }
}
