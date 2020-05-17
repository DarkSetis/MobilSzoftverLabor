package com.example.gamelister.ui.detail

import com.example.gamelister.model.dto.Game

interface DetailScreen {
    fun showGame(game: Game?)
    fun showNetworkError(message: String)
}