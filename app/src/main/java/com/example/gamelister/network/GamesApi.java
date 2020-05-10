package com.example.gamelister.network;

import com.example.gamelister.model.dto.GameItem;
import com.example.gamelister.model.dto.Games;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface GamesApi {
  
  /**
   * Get a video game
   * 
   * @param gameId ID of game to return
   * @param apiKey The API key
   * @param format Response format
   * @return Call<ComponentsschemasResponseOne>
   */
  
  @GET("game/{gameId}")
  Call<GameItem> getOneGame(
          @Path("gameId") Long gameId, @Query("api_key") String apiKey, @Query("format") String format
  );

  
  /**
   * Get all video games
   * 
   * @param apiKey The API key
   * @param format Response format
   * @return Call<ComponentsschemasResponseList>
   */
  
  @GET("games")
  Call<Games> getAllGames(
          @Query("api_key") String apiKey, @Query("format") String format
  );

  
}
