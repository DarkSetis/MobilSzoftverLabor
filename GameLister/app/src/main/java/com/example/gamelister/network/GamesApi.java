package com.example.gamelister.network;

import com.example.gamelister.model.GameResult;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Query;

public interface GamesApi {

    @GET("search")
    Call<GameResult> getGames(@Header("Authorization") String authorisation,
                              @Query("api_key") String apiKey);
}
