package com.example.gamelister.ui.main;

import com.example.gamelister.ui.Presenter;

import javax.inject.Inject;

public class MainPresenter extends Presenter<MainScreen> {

    @Inject
    public MainPresenter() {
    }

	@Override
	public void attachScreen(MainScreen screen) {
		super.attachScreen(screen);
	}

	@Override
	public void detachScreen() {
		super.detachScreen();
	}

	public void showArtistsSearchList(
			String gamesSearchTerm) {
		screen.showGames(gamesSearchTerm);
	}
}
