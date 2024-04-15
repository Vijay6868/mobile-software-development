package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.SharedPreferences;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    static final String SHARED_PREF = "PrefDemo";
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sharedPreferences = getSharedPreferences(SHARED_PREF, MODE_PRIVATE);
    }
    public  void writePref(View view){
        editor.putString("hello","welocome to shared preferences");
        editor.putInt("high_score", 4545);
        editor.putBoolean("dark_mode",false);
        editor.apply();
    }
    public void readPref(View view){
        int intVal = sharedPreferences.getInt("high_score",0);
        boolean boolVal = sharedPreferences.getBoolean("dark_mode",true);
        String str = sharedPreferences. getString("hello","-----");
        Toast.makeText(this, "", Toast.LENGTH_SHORT).show();
    }
}