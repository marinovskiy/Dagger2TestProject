package com.alex.m.dagger2testproject.models;

import com.alex.m.dagger2testproject.rest.ApiClient;
import com.alex.m.dagger2testproject.utils.PreferenceUtil;

import retrofit2.Call;
import retrofit2.Response;

public class TestModelImpl implements TestModel {

    private ApiClient apiClient;

    private PreferenceUtil preferenceUtil;

    public TestModelImpl(ApiClient apiClient, PreferenceUtil preferenceUtil) {
        this.apiClient = apiClient;
        this.preferenceUtil = preferenceUtil;
    }

    @Override
    public Call<Response> getAllNews() {
        return apiClient.getApiService().testRequest(preferenceUtil.getAuthToken());
    }
}