package com.example.pokemon_alif;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity
public class Pokemon {
    @PrimaryKey(autoGenerate = true)
    private int id;
    @ColumnInfo(name = "nama")
    private String nama;
    @ColumnInfo(name = "img")
    private String image;
    @Ignore
    public Pokemon(String nama, String image){
        this.nama = nama;
        this.image = image;
    }

    public Pokemon(int id, String nama, String image){
        this.id = id;
        this.nama = nama;
        this.image = image;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public String getImage() {
        return image;
    }
}