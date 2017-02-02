package com.alex.m.dagger2testproject.models;

import okhttp3.ResponseBody;
import retrofit2.Call;

public interface TestModel extends BaseModel {

    Call<ResponseBody> getAllNews(String userName);

}