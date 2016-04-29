package com.outman.mamashare.core.http;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * retrofit 2.+ add all request interceptor
 */
public class HeaderInterceptor implements Interceptor{

    @Override
    public Response intercept(Chain chain) throws IOException {

        Request request = chain.request();

        request = request.newBuilder()
                    .addHeader("", "")//TODO add headers
                    .build();

        return chain.proceed(request);
    }
}
