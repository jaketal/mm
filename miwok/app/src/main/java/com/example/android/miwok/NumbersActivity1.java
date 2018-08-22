package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class NumbersActivity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

     final    ArrayList<Words> numbers = new ArrayList<com.example.android.miwok.Words>();
        numbers.add(new com.example.android.miwok.Words("one", "lutti",R.drawable.number_one,R.raw.number_one));
        numbers.add(new com.example.android.miwok.Words("two", "otiiko",R.drawable.number_two,R.raw.number_two));
        numbers.add(new com.example.android.miwok.Words("three", "tolookosu",R.drawable.number_three,R.raw.number_three));
        numbers.add(new com.example.android.miwok.Words("four", "oyyisa",R.drawable.number_four,R.raw.number_four));
        numbers.add(new com.example.android.miwok.Words("five", "massokka",R.drawable.number_five,R.raw.number_five));
        numbers.add(new com.example.android.miwok.Words("six", "temmokka",R.drawable.number_six,R.raw.number_six));
        numbers.add(new com.example.android.miwok.Words("seven", "kenekaku",R.drawable.number_seven,R.raw.number_seven));
        numbers.add(new com.example.android.miwok.Words("eight", "kawinta",R.drawable.number_eight,R.raw.number_eight));
        numbers.add(new com.example.android.miwok.Words("nine", "wo'e",R.drawable.number_nine,R.raw.number_nine));
        numbers.add(new com.example.android.miwok.Words("ten", "na'aacha",R.drawable.number_ten,R.raw.number_ten));

        com.example.android.miwok.wordsAdapter adapter = new com.example.android.miwok.wordsAdapter(this,numbers,R.color.category_numbers);
        ListView listView = findViewById(R.id.list);


        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Words words= numbers.get(position);
                MediaPlayer mediaPlayer = MediaPlayer.create(NumbersActivity1.this,words.getmAudio());
                mediaPlayer.start();
            }
        });
        listView.setAdapter(adapter);
    }
}
