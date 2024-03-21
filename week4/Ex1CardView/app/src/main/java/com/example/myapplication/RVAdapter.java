package com.example.myapplication;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.io.File;
import java.util.ArrayList;

public class RVAdapter extends RecyclerView.Adapter<RVHolder>{
    ArrayList<CardItems> cardItems;

    public RVAdapter(ArrayList<CardItems> cardItems){
        this.cardItems = cardItems;
    }
    @NonNull
    @Override
    public RVHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext( ));
        View view = inflater.inflate(R.layout.rv_item, parent,false);
        return new RVHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RVHolder holder, int position) {
        CardItems currentItem = cardItems.get(position);
       holder.imageView.setImageResource(currentItem.getImage());
       holder.title.setText(currentItem.getText_item());

    }
    @Override
    public int getItemCount() {
        return cardItems.size();
    }
}
