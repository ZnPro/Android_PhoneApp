package com.cos.phoneapp;

import java.util.List;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public interface PhoneService {

@GET("phone")
    Call<CMRespDto<List<Phone>>> findAll();

    Retrofit retrofit= new Retrofit.Builder()
            .baseUrl("http://192.168.0.161:8080/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();
}
