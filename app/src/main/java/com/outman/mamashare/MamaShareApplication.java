package com.outman.mamashare;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 *
 */
public class MamaShareApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        //初始化leak canary
        LeakCanary.install(this);
    }
}
