package com.example.ex2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Country> countries = new ArrayList<>();
        countries.add( new Country(R.drawable.india,"INDIA"));
        countries.add( new Country(R.drawable.france,"FRANCE"));
        countries.add( new Country(R.drawable.australia,"AUSTRALIA"));
        countries.add( new Country(R.drawable.germany,"GERMANY"));
        countries.add( new Country(R.drawable.norway,"NORWAY"));

        RVAdapter adapter = new RVAdapter(countries);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(adapter);
    }
}