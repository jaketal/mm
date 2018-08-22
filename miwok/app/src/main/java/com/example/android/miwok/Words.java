package com.example.android.miwok;

import android.media.MediaPlayer;

public class Words {

    private String mengTranslte;
    private String maraTranslate;
    private int mImage = NO_IMAGE_PROVIDED;
    private static final int  NO_IMAGE_PROVIDED = -1;
    private int mAudio ;


    public Words(String engTranslte, String araTranslate,int aduio) {
        mengTranslte = engTranslte;
        maraTranslate = araTranslate;
        mAudio = aduio;
    }

    public Words(String mengTranslte, String maraTranslate, int mImage,int aduio) {
        this.mengTranslte = mengTranslte;
        this.maraTranslate = maraTranslate;
        this.mImage = mImage;
        mAudio = aduio;
    }

    public String getEngTranslte() {
        return mengTranslte;
    }

    public String getAraTranslate() {
        return maraTranslate;
    }

    public int getImageID() { return mImage; }

    public boolean hasImage(){
        return mImage != NO_IMAGE_PROVIDED;
    }

    public  int getmAudio (){return mAudio;}

}