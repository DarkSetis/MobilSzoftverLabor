package com.example.gamelister.model.db;

import androidx.room.Database;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.example.gamelister.model.db.entity.RoomGame;

@Database(exportSchema = true, version = 1, entities = RoomGame.class)
@TypeConverters(GameConverter.class)
public abstract class GameDatabase extends RoomDatabase {

    abstract GameDao gameDao();

}
