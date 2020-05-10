package com.example.gamelister.model.dto;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameResult {

    @SerializedName("results")
    @Expose
    private Games games;

    public Games getGames() {
        return games;
    }

    public void setGames(Games games) {
        this.games = games;
    }
}
