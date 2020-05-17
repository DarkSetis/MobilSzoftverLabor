package com.example.gamelister

import com.example.gamelister.interactor.InteractorModule
import com.example.gamelister.model.db.RoomModule
import com.example.gamelister.network.NetworkModule
import com.example.gamelister.ui.UIModule
import com.example.gamelister.ui.detail.DetailActivity
import com.example.gamelister.ui.main.MainActivity
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [UIModule::class, NetworkModule::class, InteractorModule::class,  RoomModule::class])
interface GameListerApplicationComponent {
    fun inject(gameListActivity: MainActivity)
    fun inject(gameDetailActivity: DetailActivity)
}