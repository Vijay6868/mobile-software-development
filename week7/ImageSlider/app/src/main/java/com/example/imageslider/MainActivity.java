package com.example.imageslider;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;

import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<SlideModel> imageList = new ArrayList<>();
        imageList.add(new SlideModel(R.drawable.img1, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img2, ScaleTypes.CENTER_CROP));
        imageList.add(new SlideModel(R.drawable.img3,ScaleTypes.CENTER_CROP));
        ArrayList<SlideModel> list1 = new ArrayList<>();


        ImageSlider imageSlider = findViewById(R.id.image_slider);
        imageSlider.setImageList(imageList);

    }
}