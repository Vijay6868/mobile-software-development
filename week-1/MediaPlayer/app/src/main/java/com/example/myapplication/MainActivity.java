package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.media.MediaPlayer;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mediaPlayer = MediaPlayer.create(this,R.raw.sample );
        //mediaPlayer.start();
    }
    public void playAudio(View view){
        if(!mediaPlayer.isPlaying()){
            mediaPlayer.start();
        }

    }
    public void pauseAudio(View view){
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }
}