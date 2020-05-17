package com.example.gamelister.model.db

import android.arch.persistence.room.Room
import android.content.Context
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RoomModule {
    companion object {
        private const val DB_NAME = "game-db"
    }

    @Provides
    @Singleton
    fun provideGameDatabase(context: Context): GameDataBase {
        return Room.databaseBuilder(
            context,
            GameDataBase::class.java,
            DB_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideGameDao(gameDataBase: GameDataBase): GameDao = gameDataBase.gameDao()
}
