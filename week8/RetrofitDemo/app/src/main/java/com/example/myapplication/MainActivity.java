package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    UserControllerRESTAPI restapi;
    Users users;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btloadUsers,btdisplayUsers;

        btloadUsers = findViewById(R.id.loadusers);
        btdisplayUsers = findViewById(R.id.displayusers);

        btloadUsers.setOnClickListener(v -> {
            restapi = new UserControllerRESTAPI();
            restapi.start();
        });

        btdisplayUsers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tv = findViewById(R.id.tv);
                if(restapi !=null){
                    users = restapi.getUsers();
                    if(users != null){
                        tv.setText("users count :"+users.userList.size() +"\n"+
                                users.userList.toString());

                        tv.setMovementMethod(new ScrollingMovementMethod());
                        //tv.setText(users.userList.size());

                    }
                    else {
                        tv.setText("Empty List");
                    }
                }else{
                    tv.setText("Users not loaded ");
                }
            }
        });
    }


}