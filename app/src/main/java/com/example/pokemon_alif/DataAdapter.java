package com.example.pokemon_alif;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.CardViewHolder> {
    private List<Pokemon> pokemons;
    private Context context;

    public DataAdapter(List<Pokemon> pokemons,Context context){
        this.pokemons = pokemons;
        this.context = context;
    }

    public List<Pokemon> getPokemons(){
        return pokemons;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.pokemon_layout, parent, false);
        CardViewHolder viewHolder = new CardViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int position) {
        final String nama,image;
        nama  = pokemons.get(position).getNama();
        image = pokemons.get(position).getImage();
        final int id = pokemons.get(position).getId();
        holder.tvNama.setText(nama);
        Glide.with(context).load(image).into(holder.imgImage);
        
    }

    @Override
    public int getItemCount() {
        return pokemons.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        ImageView imgImage;
        public CardViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = (TextView) itemView.findViewById(R.id.tx_nama);
            imgImage = (ImageView) itemView.findViewById(R.id.im_pokemon);
        }
    }
}
