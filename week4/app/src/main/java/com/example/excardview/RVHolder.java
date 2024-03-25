package com.example.excardview;

import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RVHolder extends RecyclerView.ViewHolder {
    ViewGroup lnLayout;
    public RVHolder(@NonNull View itemView) {
        super(itemView);
        lnLayout = itemView.findViewById(R.id.carLayout);
    }
}
