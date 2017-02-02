package com.alex.m.dagger2testproject.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.alex.m.dagger2testproject.R;
import com.alex.m.dagger2testproject.application.Dagger2TestProjectApplication;
import com.alex.m.dagger2testproject.presenters.MainPresenter;
import com.alex.m.dagger2testproject.utils.SystemUtils;
import com.alex.m.dagger2testproject.views.MainView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity implements MainView {

    @Inject
    SystemUtils systemUtils;
    @Inject
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Dagger2TestProjectApplication) getApplication()).component().inject(this);

        mainPresenter.attachView(this);

        if (systemUtils.isConnected()) {
            mainPresenter.loadNews("johndoe");
        }
    }

    @Override
    public void showResults() {
        // show data
    }

    @Override
    public void showError() {
        Toast.makeText(this, "Sorry, data has not loaded", Toast.LENGTH_SHORT).show();
    }
}