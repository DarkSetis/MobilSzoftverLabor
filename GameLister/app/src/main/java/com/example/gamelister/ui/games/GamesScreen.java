package com.example.gamelister.ui.games;

import com.example.gamelister.model.Games;

import java.util.List;

public interface GamesScreen {
	void showGames(List<Games> games);

	void showNetworkError(String errorMsg);
}
