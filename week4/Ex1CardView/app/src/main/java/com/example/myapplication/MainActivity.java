package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import android.widget.ImageView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<CardItems> items = new ArrayList<>();
        items.add(new CardItems(R.drawable.img1,"image1"));
        items.add(new CardItems(R.drawable.img2,"image2"));
        items.add(new CardItems(R.drawable.img3,"image3"));

        recyclerView = findViewById(R.id.rv);
        RVAdapter adapter = new RVAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}