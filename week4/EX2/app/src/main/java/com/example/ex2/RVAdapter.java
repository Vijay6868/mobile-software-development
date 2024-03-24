package com.example.ex2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
//import android.view.LayoutInflater;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVHolder> {
    ArrayList<Country> countries;
    public RVAdapter(ArrayList<Country> countries){
        this.countries = countries;
    }
    @NonNull
    @Override
    public RVHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.rv_item,parent,false);
        return new RVHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVHolder holder, int position) {
        Country country = countries.get(position);
        holder.img_flag.setImageResource(country.getFlag());
        holder.tv_name.setText(country.getName());
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }
}
