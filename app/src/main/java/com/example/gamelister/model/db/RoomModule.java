package com.example.gamelister.model.db;

import android.content.Context;

import androidx.room.Room;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
class RoomModule {

    private static final String DB_NAME = "game-db";

    @Provides
    @Singleton
    GameDatabase provideGameDatabase(Context context) {
        return Room.databaseBuilder(
                context,
                GameDatabase.class,
                DB_NAME
        ).build();
    }

    @Provides
    @Singleton
    GameDao provideGameDao(GameDatabase gameDatabase) {
        return gameDatabase.gameDao();
    }
}
