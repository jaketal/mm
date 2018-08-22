package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class phrases extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);


        ArrayList<Words> phrases = new ArrayList<com.example.android.miwok.Words>();
        phrases.add(new com.example.android.miwok.Words("Where are you going?", "minto wuksus",R.raw.phrase_where_are_you_going));
        phrases.add(new com.example.android.miwok.Words("What is your name?", "tinnә oyaase'nә",R.raw.phrase_what_is_your_name));
        phrases.add(new com.example.android.miwok.Words("My name is...", "oyaaset...",R.raw.phrase_my_name_is));
        phrases.add(new com.example.android.miwok.Words("How are you feeling?", "michәksәs?",R.raw.phrase_how_are_you_feeling));
        phrases.add(new com.example.android.miwok.Words("I’m feeling good.", "kuchi achit",R.raw.phrase_im_feeling_good));
        phrases.add(new com.example.android.miwok.Words("Are you coming?", "әәnәs'aa?",R.raw.phrase_are_you_coming));
        phrases.add(new com.example.android.miwok.Words("Yes, I’m coming.", "hәә’ әәnәm",R.raw.phrase_yes_im_coming));
        phrases.add(new com.example.android.miwok.Words("I’m coming.", "әәnәm",R.raw.phrase_im_coming));
        phrases.add(new com.example.android.miwok.Words("Let’s go.", "yoowutis",R.raw.phrase_lets_go));
        phrases.add(new com.example.android.miwok.Words("Come here.", "әnni'nem",R.raw.phrase_come_here));

        wordsAdapter adapter = new wordsAdapter(this,phrases,R.color.category_phrases);
        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
