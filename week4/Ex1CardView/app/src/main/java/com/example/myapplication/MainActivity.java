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

        ArrayList<CardItems> items = new ArrayList<>();
        items.add(new CardItems("/Users/vj/Documents/Developer/mobile-software-development/week4/Ex1CardView/app/src/main/res/drawable/img1.jpg","image1"));
        items.add(new CardItems("/Users/vj/Documents/Developer/mobile-software-development/week4/Ex1CardView/app/src/main/res/drawable/img2.jpg","image2"));
        items.add(new CardItems("/Users/vj/Documents/Developer/mobile-software-development/week4/Ex1CardView/app/src/main/res/drawable/img3.jpg","image3"));

        recyclerView = findViewById(R.id.rv);
        RVAdapter adapter = new RVAdapter(items);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);



    }
}