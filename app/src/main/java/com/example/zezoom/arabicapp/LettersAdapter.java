package com.example.zezoom.arabicapp;

import android.content.Context;
import android.media.MediaPlayer;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ZeZOoM on 29/06/2017.
 */

 class LettersAdapter extends ArrayAdapter<Letter> {
    MediaPlayer player;

    public LettersAdapter(Context context, ArrayList<Letter> letters) {
        super(context, 0, letters);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.listitemletter,parent,false);
        }
        final Letter letter = getItem(position);
        TextView ar = (TextView) listItemView.findViewById(R.id.arletter);
        TextView en = (TextView) listItemView.findViewById(R.id.enletter);
        ImageView letter_img = (ImageView) listItemView.findViewById(R.id.letterimg);
        ImageButton voice = (ImageButton) listItemView.findViewById(R.id.voicebtn);


        ar.setText(letter.getAr_letter());
        en.setText(letter.getEn_letter());
        letter_img.setImageResource(letter.getPic());
        voice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                player = MediaPlayer.create(getContext(),letter.getVoice());
                player.start();
            }
        });


        return listItemView;
    }
}
