package com.example.android.miwok;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class wordsAdapter extends ArrayAdapter<Words> {

    private int mcolor1;
    private MediaPlayer mAduio;


    public wordsAdapter(Context context, ArrayList<Words> words, int mcolor) {
        super(context, 0, words);
        mcolor1 = mcolor;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_numbers, parent, false);
        }

        final Words cureentword = getItem(position);
        TextView engtranslat = (TextView) listItemView.findViewById(R.id.eng_id);
        engtranslat.setText(cureentword.getEngTranslte());
        TextView aratranslat = (TextView) listItemView.findViewById(R.id.ara_id);
        aratranslat.setText(cureentword.getAraTranslate());
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image1);

        if (cureentword.hasImage()) {
            imageView.setImageResource(cureentword.getImageID());
            imageView.setVisibility(View.VISIBLE);
        } else {
            imageView.setVisibility(View.GONE);
        }
        View txtcolor = listItemView.findViewById(R.id.aaaa);
        int color = ContextCompat.getColor(getContext(), mcolor1);
        txtcolor.setBackgroundColor(color);


        Button button = (Button) listItemView.findViewById(R.id.play_btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mAduio = MediaPlayer.create(getContext(),cureentword.getmAudio());
                mAduio.start();
            }
        });


        return listItemView;
    }

}
