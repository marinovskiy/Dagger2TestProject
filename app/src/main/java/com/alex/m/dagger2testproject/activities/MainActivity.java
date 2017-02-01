package com.alex.m.dagger2testproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.alex.m.dagger2testproject.R;
import com.alex.m.dagger2testproject.application.Dagger2TestProjectApplication;
import com.alex.m.dagger2testproject.rest.ApiClient;
import com.alex.m.dagger2testproject.utils.PreferenceUtil;
import com.alex.m.dagger2testproject.utils.SystemUtils;

import javax.inject.Inject;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Inject
    SystemUtils systemUtils;
    @Inject
    PreferenceUtil preferenceUtil;
    @Inject
    ApiClient apiClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Dagger2TestProjectApplication) getApplication()).component().inject(this);

        if (systemUtils.isConnected()) {
            apiClient.getApiService().testRequest(preferenceUtil.getAuthToken())
                    .enqueue(new Callback<Response>() {
                        @Override
                        public void onResponse(Call<Response> call, Response<Response> response) {
                        }

                        @Override
                        public void onFailure(Call<Response> call, Throwable t) {
                        }
                    });
        }
    }
}