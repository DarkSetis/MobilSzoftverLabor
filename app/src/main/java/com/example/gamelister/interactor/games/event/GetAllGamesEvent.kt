package com.example.gamelister.interactor.games.event

import com.example.gamelister.model.dto.Game

data class GetAllGamesEvent(
    var code: Int = 0,
    var games: List<Game>? = null,
    var throwable: Throwable? = null
)