package com.alex.m.dagger2testproject.presenters;

import com.alex.m.dagger2testproject.views.BaseView;

public abstract class AbstractPresenter<V extends BaseView> implements BasePresenter<V> {

    private V view;

    @Override
    public void attackView(V view) {
        this.view = view;
    }

    @Override
    public boolean isViewAttached() {
        return view != null;
    }

    @Override
    public void onDestroy() {
        view = null;
    }

    @Override
    public V getView() {
        return view;
    }
}