package com.outman.mamashare.api;

import com.outman.mamashare.entity.User;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * mamashare API
 */
public interface APIService {

    @POST("/account/login")
    Call<User> login(@Path("loginName") String username, @Path("loginPwd") String pwd);
}
