package com.example.gamelister.ui.games;

import androidx.fragment.app.Fragment;

import com.example.gamelister.model.dto.Games;

import java.util.List;

/**
 * A placeholder fragment containing a simple screen.
 */
public class GamesFragment extends Fragment implements GamesScreen {

	@Override
	public void showGames(List<Games> games) {

	}

	@Override
	public void showNetworkError(String errorMsg) {

	}
}
