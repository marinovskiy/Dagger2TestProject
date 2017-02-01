package com.alex.m.dagger2testproject.presenters;

import com.alex.m.dagger2testproject.views.MainView;

public interface MainPresenter extends BasePresenter<MainView> {

    void loadNews();

}