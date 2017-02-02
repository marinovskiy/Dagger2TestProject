package com.alex.m.dagger2testproject.models;

import retrofit2.Call;
import retrofit2.Response;

public interface TestModel extends BaseModel {

    Call<Response> getAllNews(String userName);

}