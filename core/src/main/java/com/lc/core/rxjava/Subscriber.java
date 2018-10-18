package com.lc.core.rxjava;

/**
 * Author:Edward
 * Date:2018/6/8
 * Description:
 */

public interface Subscriber<T> {

    T onSubscribe();

    void onNext(T t);

}
