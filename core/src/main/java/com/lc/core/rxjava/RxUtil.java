package com.lc.core.rxjava;

import io.reactivex.Observable;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;

/**
 * Author:Edward
 * Date:2018/6/8
 * Description:
 */

public class RxUtil {


    public static <T> void subscribe(Subscriber<T> subscriber) {
        Observable.create(new MyObservable<T>(subscriber))
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new MyObserver<T>(subscriber));
    }


}
