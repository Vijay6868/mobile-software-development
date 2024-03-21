package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class RVHolder extends RecyclerView.ViewHolder {
    TextView title;
    ImageView imageView;
    CardView cardLayout;
    public RVHolder(@NonNull View itemView) {
        super(itemView);
        title = itemView.findViewById(R.id.title);
        imageView = itemView.findViewById(R.id.Item_image);
        cardLayout = itemView.findViewById(R.id.carLayout);
    }
}
