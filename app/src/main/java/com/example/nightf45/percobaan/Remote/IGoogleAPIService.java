package com.example.nightf45.percobaan.Remote;

import com.example.nightf45.percobaan.Model.MyPlaces;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Url;

public interface IGoogleAPIService {
    @GET
    Call<MyPlaces> getNearbyPlace(@Url String url);
}
