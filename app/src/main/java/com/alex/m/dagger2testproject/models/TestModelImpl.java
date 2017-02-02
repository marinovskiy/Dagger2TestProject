package com.alex.m.dagger2testproject.models;

import com.alex.m.dagger2testproject.rest.ApiClient;

import retrofit2.Call;
import retrofit2.Response;

public class TestModelImpl implements TestModel {

    private ApiClient apiClient;

    public TestModelImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public Call<Response> getAllNews(String userName) {
        return apiClient.getApiService().users(userName);
    }
}