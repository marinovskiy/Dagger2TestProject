package com.alex.m.dagger2testproject.di.modules;

import com.alex.m.dagger2testproject.models.TestModel;
import com.alex.m.dagger2testproject.presenters.MainPresenter;
import com.alex.m.dagger2testproject.presenters.MainPresenterImpl;

import dagger.Module;
import dagger.Provides;

@Module
public class PresenterModule {

    @Provides
    MainPresenter provideMainPresenter(TestModel testModel) {
        return new MainPresenterImpl(testModel);
    }
}