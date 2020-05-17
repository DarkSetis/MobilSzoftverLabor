package com.example.gamelister

import com.example.gamelister.interactor.InteractorModule
import com.example.gamelister.mock.network.MockNetworkModule
import com.example.gamelister.model.db.RoomModule
import com.example.gamelister.test.GamesTest
import com.example.gamelister.test.MainTest
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [MockNetworkModule::class, TestModule::class, InteractorModule::class, RoomModule::class])
interface TestComponent : GameListerApplicationComponent {
    fun inject(detailsTest: GamesTest)
    fun inject(mainTest: MainTest)
}