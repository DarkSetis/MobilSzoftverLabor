package com.example.gamelister.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class GameResult {

    @SerializedName("results")
    @Expose
    private Games games;

    public Games getArtists() {
        return games;
    }

    public void setArtists(Games artists) {
        this.games = artists;
    }
}
