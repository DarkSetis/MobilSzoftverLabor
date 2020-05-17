package com.example.gamelister.interactor

import com.example.gamelister.interactor.games.GamesInteractor
import com.example.gamelister.network.GamesApi
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class InteractorModule {
    @Provides
    @Singleton
    fun provideGamesInteractor(gamesApi: GamesApi) = GamesInteractor(gamesApi)
}