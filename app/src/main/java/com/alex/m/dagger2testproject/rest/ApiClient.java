package com.alex.m.dagger2testproject.rest;

import retrofit2.Retrofit;

public class ApiClient {

    private ApiService apiService;

    public ApiClient(Retrofit retrofit) {
        apiService = retrofit.create(ApiService.class);
    }

    public ApiService getApiService() {
        return apiService;
    }
}