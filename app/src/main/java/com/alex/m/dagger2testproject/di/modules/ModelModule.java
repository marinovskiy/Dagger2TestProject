package com.alex.m.dagger2testproject.di.modules;

import com.alex.m.dagger2testproject.models.TestModel;
import com.alex.m.dagger2testproject.models.TestModelImpl;
import com.alex.m.dagger2testproject.rest.ApiClient;

import dagger.Module;
import dagger.Provides;

@Module
public class ModelModule {

    @Provides
    TestModel provideTestModel(ApiClient apiClient) {
        return new TestModelImpl(apiClient);
    }
}