package com.example.cardview;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVHolder extends RecyclerView.ViewHolder {
    TextView tv;
    public RVHolder(@NonNull View itemView) {
        super(itemView);
        tv = itemView.findViewById(R.id.c_name);
    }
}
