package com.example.gamelister.interactor;

import com.example.gamelister.network.GamesApi;

import javax.inject.Inject;

public class GamesInteractor {

    GamesApi gamesApi;

    @Inject
    public GamesInteractor(GamesApi gamesApi) {
        this.gamesApi = gamesApi;
        SpotifyDemoApplication.injector.inject(this);
    }

}
