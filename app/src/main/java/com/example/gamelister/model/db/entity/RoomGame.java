package com.example.gamelister.model.db.entity;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "games")
public class RoomGame {
    @PrimaryKey(autoGenerate = true)
    public Long id;
    public String name;
    public String image;
    public String deck;
    public String description;
    public String originalReleaseDate;
    public String platform;
}
