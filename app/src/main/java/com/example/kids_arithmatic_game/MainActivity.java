package com.example.kids_arithmatic_game;

import static android.app.ProgressDialog.show;

import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.ui.state.ToggleableState;

import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    String selectedItem;
    String operation;
    public static final String MSG = "com.example.kids_arithmatic_game.PL_NAME";
    public static final String AGE = "com.example.kids_arithmatic_game.PL_AGE";
    public static final String OP = "com.example.kids_arithmatic_game.OP";


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
    // handling game start button
    public void startGame(View view){
        Intent intent = new Intent(this, gamePlay.class);
        EditText txtName = findViewById(R.id.tbName);
        EditText txtAge = findViewById(R.id.tb_Age);
        operation = selectedItem;

        String name = txtName.getText().toString();
        //Toast.makeText(this, name, Toast.LENGTH_SHORT).show();
        String age = txtAge.getText().toString();


        intent.putExtra(MSG,name);
        intent.putExtra(AGE,age);
        intent.putExtra(OP,operation);

        startActivity(intent);
    }
}