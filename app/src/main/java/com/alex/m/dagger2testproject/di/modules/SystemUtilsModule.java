package com.alex.m.dagger2testproject.di.modules;

import android.content.Context;

import com.alex.m.dagger2testproject.utils.SystemUtils;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class SystemUtilsModule {

    @Provides
    @Singleton
    SystemUtils provideSystemUtils(Context context) {
        return new SystemUtils(context);
    }
}