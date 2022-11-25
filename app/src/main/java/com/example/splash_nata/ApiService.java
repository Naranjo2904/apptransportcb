package com.example.splash_nata;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface ApiService {
    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"})

    @GET("rutaapi/")
    Call<List<Object>> rutasapi();

}
