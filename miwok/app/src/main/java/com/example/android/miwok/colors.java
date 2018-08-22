package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Words> colors = new ArrayList<com.example.android.miwok.Words>();
        colors.add(new com.example.android.miwok.Words("red", "weṭeṭṭi",R.drawable.color_red,R.raw.color_red));
        colors.add(new com.example.android.miwok.Words("green", "chokokki",R.drawable.color_green,R.raw.color_green));
        colors.add(new com.example.android.miwok.Words("brown", "ṭakaakki",R.drawable.color_brown,R.raw.color_brown));
        colors.add(new com.example.android.miwok.Words("gray", "ṭopoppi",R.drawable.color_gray,R.raw.color_gray));
        colors.add(new com.example.android.miwok.Words("black", "kululli",R.drawable.color_black,R.raw.color_black));
        colors.add(new com.example.android.miwok.Words("white", "kelelli",R.drawable.color_white,R.raw.color_white));
        colors.add(new com.example.android.miwok.Words("dusty yellow", "ṭopiisә",R.drawable.color_dusty_yellow,R.raw.color_dusty_yellow));
        colors.add(new com.example.android.miwok.Words("mustard yellow", "chiwiiṭә",R.drawable.color_mustard_yellow,R.raw.color_mustard_yellow));


        com.example.android.miwok.wordsAdapter adapter = new com.example.android.miwok.wordsAdapter(this,colors,R.color.category_colors);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
