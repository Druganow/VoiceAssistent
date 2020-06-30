package com.example.voiceassistent;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ForecastApi {
    @GET("/current?access_key=a5631a1d3ebbde9d4b57c71444b68e13")
    Call<Forecast> getCurrentWeather(@Query("query") String city);
}

