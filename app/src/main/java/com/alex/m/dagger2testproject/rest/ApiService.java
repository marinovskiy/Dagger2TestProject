package com.alex.m.dagger2testproject.rest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("users/{userName}")
    Call<ResponseBody> users(@Path("userName") String userName);

}