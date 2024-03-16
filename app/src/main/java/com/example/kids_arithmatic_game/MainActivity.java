package com.example.kids_arithmatic_game;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.state.ToggleableState;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String selectedItem;
    String Operation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       dropDownItem();
    }

    // returns selected item in the dropDown, that is operation, +,- or X
    public String dropDownItem(){
        ArrayList<String> items = new ArrayList<>();
        items.add("+");
        items.add("-");
        items.add("X");

        Spinner dropdown = findViewById(R.id.dd_operator);
        ArrayAdapter<String> adapter;
        adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item,items);
        dropdown.setAdapter(adapter);
        dropdown.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(MainActivity.this, items.get(position), Toast.LENGTH_SHORT).show();
                selectedItem = items.get(position);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        return selectedItem;

    }
}