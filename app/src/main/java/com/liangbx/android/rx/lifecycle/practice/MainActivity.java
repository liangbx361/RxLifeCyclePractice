package com.liangbx.android.rx.lifecycle.practice;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.trello.rxlifecycle.components.support.RxAppCompatActivity;

import rx.Observable;
import rx.functions.Action1;

public class MainActivity extends RxAppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void start(View view) {
        Observable.interval(1, java.util.concurrent.TimeUnit.SECONDS)
                .compose(this.<Long>bindToLifecycle())
                .subscribe(new Action1<Long>() {
                    @Override
                    public void call(Long aLong) {
                        Log.d("MainActivity", "time --> " + aLong);
                    }
                }, new Action1<Throwable>() {
                    @Override
                    public void call(Throwable throwable) {
                        throwable.printStackTrace();
                    }
                });
    }
}
