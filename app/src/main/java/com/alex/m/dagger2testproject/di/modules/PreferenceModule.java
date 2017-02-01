package com.alex.m.dagger2testproject.di.modules;

import android.content.Context;

import com.alex.m.dagger2testproject.utils.PreferenceUtil;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class PreferenceModule {

    @Provides
    @Singleton
    PreferenceUtil providePreferenceUtil(Context context) {
        return new PreferenceUtil(context);
    }
}