package com.example.volleydemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {
    String api = "https://jsonplaceholder.typicode.com/photos";
    TextView tvHello;
    ArrayList<UserModel> allUsersList;
    UserModel singleModel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
        allUsersList = new ArrayList<>();
        tvHello = findViewById(R.id.tv_hello);


    }
    public void getData(){
        // Instantiate the RequestQueue.
                RequestQueue queue = Volley.newRequestQueue(this);


// Request a string response from the provided URL.
        StringRequest stringRequest = new StringRequest(Request.Method.GET, api,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        // Display the first 500 characters of the response string.
                        //Log.e("api","onErrorResponse: "+response.toString());
                        try {
                            JSONArray array = new JSONArray(response);
                            for(int i=0;i<array.length();i++){
                                JSONObject singleObject = array.getJSONObject(i);
                                    singleModel = new UserModel(
                                        singleObject.getInt("albumId"),
                                        singleObject.getInt("id"),
                                        singleObject.getString("title"),
                                        singleObject.getString("url"),
                                        singleObject.getString("thumbnailUrl"));

                                allUsersList.add(singleModel);
                            }
                            display();
                            Log.e("api", "onErrorResponse");
                        } catch (JSONException e) {
                            e.printStackTrace();
                            Log.e("api","onResponse: "+e.getMessage());
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e("api","onErrorResponse: " + error.getLocalizedMessage());
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);
    }
    public void display(){
        tvHello.setText(allUsersList.get(0).getTitle());
    }
}