package com.outman.mamashare.core.http;

import retrofit2.Retrofit;

/**
 * Retrofit 封装
 */
public class RetrofitUtil {

    private static final String BASE_URL = " http://tapi.m.0-6.com/api/android/";

    private static Retrofit retrofit;

    private RetrofitUtil(){
        if(retrofit == null){
            retrofit = new Retrofit.Builder()
                            .baseUrl(BASE_URL)
                            .build();
        }
    }
}
