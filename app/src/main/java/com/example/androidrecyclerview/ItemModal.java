package com.example.androidrecyclerview;

import android.widget.Button;

public class ItemModal {
    private String name ;
    private int imgId;

    public ItemModal(String name, int imgId) {
        this.name = name;
        this.imgId = imgId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return imgId;
    }
}
