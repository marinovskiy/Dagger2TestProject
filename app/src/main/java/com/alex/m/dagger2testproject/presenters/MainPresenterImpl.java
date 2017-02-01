package com.alex.m.dagger2testproject.presenters;

import com.alex.m.dagger2testproject.models.TestModel;
import com.alex.m.dagger2testproject.views.MainView;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenterImpl extends AbstractPresenter<MainView> implements MainPresenter {

    private TestModel testModel;

    public MainPresenterImpl(TestModel testModel) {
        this.testModel = testModel;
    }

    @Override
    public void loadNews() {
        testModel.getAllNews().enqueue(new Callback<Response>() {
            @Override
            public void onResponse(Call<Response> call, Response<Response> response) {
                if (isViewAttached()) {
                    getView().showResults();
                }
            }

            @Override
            public void onFailure(Call<Response> call, Throwable t) {
                if (isViewAttached()) {
                    getView().showError();
                }
            }
        });
    }
}