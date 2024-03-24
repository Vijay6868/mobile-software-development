package com.example.ex2;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVHolder extends RecyclerView.ViewHolder {
    TextView tv_name;
    ImageView img_flag;
    public RVHolder(@NonNull View itemView) {
        super(itemView);
        tv_name = itemView.findViewById(R.id.tvName);
        img_flag = itemView.findViewById(R.id.imgFlag);
    }
}
