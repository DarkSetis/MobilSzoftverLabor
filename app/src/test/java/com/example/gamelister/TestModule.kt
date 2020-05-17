package com.example.gamelister

import android.content.Context
import com.example.gamelister.interactor.games.GamesInteractor
import com.example.gamelister.ui.detail.DetailPresenter
import com.example.gamelister.ui.main.MainPresenter
import com.example.gamelister.utils.UiExecutor
import dagger.Module
import dagger.Provides
import java.util.concurrent.Executor
import javax.inject.Singleton

@Module
class TestModule(private val context: Context) {

    @Provides
    fun provideContext() = context

    @Provides
    @Singleton
    fun provideMainPresenter(executor: Executor, gamesInteractor: GamesInteractor) = MainPresenter(executor, gamesInteractor)

    @Provides
    @Singleton
    fun provideDetailPresenter(executor: Executor, gamesInteractor: GamesInteractor) = DetailPresenter(executor, gamesInteractor)

    @Provides
    @Singleton
    fun provideNetworkExecutor(): Executor = UiExecutor()
}