package com.example.pokemon_alif;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public abstract class DataDao {
    @Query("SELECT * FROM Pokemon")
    public abstract List<Pokemon> getAll();

    @Insert
    public abstract void insertAll(Pokemon pokemon);

    @Delete
    public abstract void delete(Pokemon pokemon);

}