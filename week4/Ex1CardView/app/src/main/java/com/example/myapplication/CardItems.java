package com.example.myapplication;

import android.widget.ImageView;
import android.widget.TextView;

public class CardItems {

    String text_item;
    String imgUrl;

    public String getText_item() {
        return text_item;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public CardItems(String imgUrl, String text_item) {

        this.text_item = text_item;
        this.imgUrl = imgUrl;

    }
}

