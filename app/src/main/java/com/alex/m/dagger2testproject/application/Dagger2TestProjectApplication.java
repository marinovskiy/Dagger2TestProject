package com.alex.m.dagger2testproject.application;

import android.app.Application;

import com.alex.m.dagger2testproject.di.component.AppComponent;
import com.alex.m.dagger2testproject.di.component.DaggerAppComponent;
import com.alex.m.dagger2testproject.di.modules.AppModule;
import com.alex.m.dagger2testproject.utils.PreferenceUtil;

import javax.inject.Inject;

public class Dagger2TestProjectApplication extends Application {

    @Inject
    PreferenceUtil preferenceUtil;

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        appComponent = buildComponent();

        // this line need if you want to use injecting in your application class
        component().inject(this);

        if (preferenceUtil.isFirstRun()) {
            // do something...
        }
    }

    public AppComponent component() {
        return appComponent;
    }

    protected AppComponent buildComponent() {
        return DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();
    }
}