package com.example.jsongfg;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RetrofitAPI {
    @GET("63OH")

        // as we are calling data from array
        // so we are calling it with json object
        // and naming that method as getCourse();
    Call<RecyclerData> getCourse();



    @GET("/photos")
    Call<List<RetroPhoto>> getAllPhotos();
}

