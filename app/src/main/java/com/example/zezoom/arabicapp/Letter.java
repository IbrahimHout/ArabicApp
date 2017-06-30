package com.example.zezoom.arabicapp;

import android.widget.ListView;

import java.io.Serializable;

/**
 * Created by ZeZOoM on 18/02/2017.
 */

 class Letter implements Serializable {
    private int id;
    private String Ar_letter;
    private String En_letter;
    private int voice;
    private int pic;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAr_letter() {
        return Ar_letter;
    }

    public void setAr_letter(String ar_letter) {
        Ar_letter = ar_letter;
    }

    public String getEn_letter() {
        return En_letter;
    }

    public void setEn_letter(String en_letter) {
        En_letter = en_letter;
    }



    public int getVoice() {
        return voice;
    }

    public void setVoice(int voice) {
        this.voice = voice;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public Letter(int id, String ar_letter, String en_letter, int voice, int pic) {

        this.id = id;
        Ar_letter = ar_letter;
        En_letter = en_letter;
        this.voice = voice;
        this.pic = pic;
    }




}
