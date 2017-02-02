package com.alex.m.dagger2testproject.models;

import com.alex.m.dagger2testproject.rest.ApiClient;

import okhttp3.ResponseBody;
import retrofit2.Call;

public class TestModelImpl implements TestModel {

    private ApiClient apiClient;

    public TestModelImpl(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    @Override
    public Call<ResponseBody> getAllNews(String userName) {
        return apiClient.getApiService().users(userName);
    }
}