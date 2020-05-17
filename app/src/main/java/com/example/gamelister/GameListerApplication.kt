package com.example.gamelister

import android.app.Application
import com.example.gamelister.ui.UIModule

class GameListerApplication: Application() {
    lateinit var injector: GameListerApplicationComponent

    override fun onCreate() {
        super.onCreate()
        injector = DaggerGameListerApplicationComponent.builder().uIModule(UIModule(this)).build()
    }
}