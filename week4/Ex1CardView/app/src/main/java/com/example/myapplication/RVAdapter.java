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
        String t_title = currentItem.getText_item();
        holder.title.setText(t_title);
        String path = currentItem.getImgUrl();
        File imgFile = new File(path);

        if(imgFile.exists()){
            Bitmap bitmap = BitmapFactory.decodeFile(imgFile.getAbsolutePath()); // Decode the file path string to a Bitmap
            holder.imageView.setImageBitmap(bitmap); // Set the Bitmap to the ImageView
        }

    }

    @Override
    public int getItemCount() {
        return cardItems.size();
    }
}
