package com.example.zaidi_app_project.API;

import com.example.zaidi_app_project.Models.Model;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Methods {

    @GET("api/Verify")
    Call<Model> getAllData(@Query("mobileno") String mobileno);
}
