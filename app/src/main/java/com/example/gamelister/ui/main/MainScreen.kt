package com.example.gamelister.ui.main

import com.example.gamelister.model.dto.Game

interface MainScreen {
    fun showGames(games: List<Game>?)
    fun showNetworkError(message: String)
}