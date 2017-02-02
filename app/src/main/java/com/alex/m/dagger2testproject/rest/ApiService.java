package com.alex.m.dagger2testproject.rest;

import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;

public interface ApiService {

    @GET("users")
    Call<Response> users(@Body String userName);

}