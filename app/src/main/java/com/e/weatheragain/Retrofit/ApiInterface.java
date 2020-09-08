package com.e.weatheragain.Retrofit;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {

    @GET("weather?appid=ced92faf514feea6cf41f580b2d80f1f&units=metric")
    Call<Example> getWeatherData(@Query("q") String name);
}
