package com.alex.m.dagger2testproject.di.component;

import com.alex.m.dagger2testproject.activities.MainActivity;
import com.alex.m.dagger2testproject.application.Dagger2TestProjectApplication;
import com.alex.m.dagger2testproject.di.modules.ApplicationModule;
import com.alex.m.dagger2testproject.di.modules.ModelModule;
import com.alex.m.dagger2testproject.di.modules.NetworkModule;
import com.alex.m.dagger2testproject.di.modules.PreferenceModule;
import com.alex.m.dagger2testproject.di.modules.PresenterModule;
import com.alex.m.dagger2testproject.di.modules.SystemUtilsModule;

import javax.inject.Singleton;

import dagger.Component;

@Component(modules = {
        ApplicationModule.class,
        ModelModule.class,
        NetworkModule.class,
        PreferenceModule.class,
        PresenterModule.class,
        SystemUtilsModule.class
})
@Singleton
public interface AppComponent {

    // application
    void inject(Dagger2TestProjectApplication dagger2TestProjectApplication);

    // activities
    void inject(MainActivity mainActivity);

}