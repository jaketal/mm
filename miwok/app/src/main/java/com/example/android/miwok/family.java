package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class family extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        ArrayList<Words> family = new ArrayList<Words>();

        family.add(new Words("father", "әpә",R.drawable.family_father,R.raw.family_father));
        family.add(new Words("mother", "әṭa",R.drawable.family_mother,R.raw.family_mother));
        family.add(new Words("son", "angsi",R.drawable.family_son,R.raw.family_son));
        family.add(new Words("daughter", "tune",R.drawable.family_daughter,R.raw.family_daughter));
        family.add(new Words("older brother", "taachi",R.drawable.family_older_brother,R.raw.family_older_brother));
        family.add(new Words("younger brother", "chalitti",R.drawable.family_younger_brother,R.raw.family_younger_brother));
        family.add(new Words("older sister", "teṭe",R.drawable.family_older_sister,R.raw.family_older_sister));
        family.add(new Words("younger sister", "kolliti",R.drawable.family_younger_sister,R.raw.family_younger_sister));
        family.add(new Words("grandfather", "ama",R.drawable.family_grandfather,R.raw.family_grandfather));
        family.add(new Words("grandmother", "paapa",R.drawable.family_grandmother,R.raw.family_grandmother));


        wordsAdapter adapter= new wordsAdapter(this,family,R.color.category_family);

        ListView listView = findViewById(R.id.list);
        listView.setAdapter(adapter);

    }
}
