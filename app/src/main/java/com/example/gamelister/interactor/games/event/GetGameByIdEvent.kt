package com.example.gamelister.interactor.games.event

import com.example.gamelister.model.dto.Game

data class GetGameByIdEvent(
    var code: Int = 0,
    var game: Game? = null,
    var throwable: Throwable? = null
)