package com.example.pokemon_alif;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.List;

public class MainAppActivity extends AppCompatActivity {
    DataAdapter adapter;
    List<Pokemon> pokemons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_app_activity);
        showRecycleView();
    }

    private void showRecycleView() {
        RecyclerView view = (RecyclerView) findViewById(R.id.rv_pokemon);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(this,2);
        view.setLayoutManager(mLayoutManager);

        pokemons = MainActivity.db.dataDao().getAll(); //Ambil semua data
        adapter = new DataAdapter(pokemons, this);
        view.setAdapter(adapter);
    }
}