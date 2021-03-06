package com.alex.m.dagger2testproject.presenters;

import com.alex.m.dagger2testproject.views.BaseView;

public interface BasePresenter<V extends BaseView> {

    void attachView(V view);

    boolean isViewAttached();

    void onDestroy();

    V getView();

}