package com.alex.m.dagger2testproject.presenters;

import com.alex.m.dagger2testproject.models.TestModel;
import com.alex.m.dagger2testproject.views.MainView;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainPresenterImpl extends AbstractPresenter<MainView> implements MainPresenter {

    private TestModel testModel;

    public MainPresenterImpl(TestModel testModel) {
        this.testModel = testModel;
    }

    @Override
    public void loadNews(String userName) {
        testModel.getAllNews(userName).enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                if (isViewAttached()) {
                    getView().showResults();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {
                if (isViewAttached()) {
                    getView().showError();
                }
            }
        });
    }
}