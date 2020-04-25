package com.example.gamelister.interactor.games;

import com.example.gamelister.model.GameResult;

import java.util.List;

public class GetGamesEvent {

    private int code;
    private List<GameResult> games;
    private Throwable throwable;

    public GetGamesEvent() {
    }

    public GetGamesEvent(int code, List<GameResult> games, Throwable throwable) {
        this.code = code;
        this.games = games;
        this.throwable = throwable;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<GameResult> getGames() {
        return games;
    }

    public void setGames(List<GameResult> games) {
        this.games = games;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
