package com.example.myapplication;

import android.widget.ImageView;
import android.widget.TextView;

public class CardItems {

    private String text_item;
    private int imageResource;
    String imgUrl;

    public String getText_item() {
        return text_item;
    }

    public int getImage() {
        return imageResource;
    }

    public CardItems(int imageResource, String text_item) {

        this.imageResource = imageResource;
        this.text_item = text_item;

    }
}

