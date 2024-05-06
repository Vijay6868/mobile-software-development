package com.example.firebase_demo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    EditText et_name, et_age;
    Button bt_submit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_name = findViewById(R.id.editTextText);
        et_age = findViewById(R.id.editTextNumber);
        bt_submit = findViewById(R.id.button);


        handleSubmit();
    }

    private void handleSubmit() {
        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseDatabase.getInstance().getReference().child("Vendor1").setValue("ram");
            }
        });
    }
}