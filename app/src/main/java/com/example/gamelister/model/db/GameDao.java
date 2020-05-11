package com.example.gamelister.model.db;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.gamelister.model.db.entity.RoomGame;

import java.util.List;

@Dao
abstract class GameDao {
    @Query("SELECT * FROM games")
    abstract List<RoomGame> getAll();

    @Query("SELECT * FROM games WHERE id = :id")
    abstract RoomGame getOneById(Long id);

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    abstract void create(RoomGame game);

    @Query("DELETE FROM games")
    abstract void deleteAll();

    @Query("DELETE FROM games WHERE id = :id")
    abstract void deleteOneById(Long id);
}