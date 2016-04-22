package com.outman.mamashare;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by dell on 2016-4-21.
 */
public class MamaShareApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化leak canary
        LeakCanary.install(this);
    }
}
