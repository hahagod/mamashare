package com.outman.mamashare.core.http;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

/**
 * Retrofit 封装
 */
public class AppRetrofit {

    private static final String BASE_URL = "http://tapi.m.0-6.com/api/android/";

    private AppRetrofit() {
    }

    public static class RetrofitHolder {
        private static final OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(new HeaderInterceptor())
                .build();

        public static final Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .build();
    }

    public static Retrofit getInstance() {
        return RetrofitHolder.retrofit;
    }

}
