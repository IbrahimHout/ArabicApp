package com.example.zezoom.arabicapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class LettersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_letters);

        ListView lettersListView = (ListView) findViewById(R.id.letterslest);

        ArrayList<Letter> letters = new ArrayList<>();
        letters.add(new Letter(1,"ألف","Aliph",R.raw.l_1,R.drawable.l_1));
        letters.add(new Letter(2,"باء","Ba'a",R.raw.l_2,R.drawable.l_2));
        letters.add(new Letter(3,"تاء","Ta'a",R.raw.l_3,R.drawable.l_3));
        letters.add(new Letter(4,"ثاء","Tha'a",R.raw.l_4,R.drawable.l_4));
        letters.add(new Letter(5,"جيم","Jeem",R.raw.l_5,R.drawable.l_5));
        letters.add(new Letter(6,"حاء","Ha'a",R.raw.l_6,R.drawable.l_6));
        letters.add(new Letter(7,"خاء","Kha'a",R.raw.l_7,R.drawable.l_7));
        letters.add(new Letter(8,"دال","Dal",R.raw.l_8,R.drawable.l_8));
        letters.add(new Letter(9,"ذال","Thal",R.raw.l_9,R.drawable.l_9));
        letters.add(new Letter(10,"راء","Ra'a",R.raw.l_10,R.drawable.l_10));
        letters.add(new Letter(11,"زاي","Zai",R.raw.l_11,R.drawable.l_11));
        letters.add(new Letter(12,"سين","Seen",R.raw.l_12,R.drawable.l_12));
        letters.add(new Letter(13,"شين","Sheen",R.raw.l_13,R.drawable.l_13));
        letters.add(new Letter(14,"صاد","Sad",R.raw.l_14,R.drawable.l_14));
        letters.add(new Letter(15,"ضاد","Dad",R.raw.l_15,R.drawable.l_15));
        letters.add(new Letter(16,"طاء","Ta'a",R.raw.l_16,R.drawable.l_16));
        letters.add(new Letter(17,"ظاء","Tha'a",R.raw.l_17,R.drawable.l_17));
        letters.add(new Letter(18,"عين","Aien",R.raw.l_18,R.drawable.l_18));
        letters.add(new Letter(19,"غين","Ghien",R.raw.l_19,R.drawable.l_19));
        letters.add(new Letter(20,"فاء","Fa'a",R.raw.l_20,R.drawable.l_20));
        letters.add(new Letter(21,"قاف","Qaf",R.raw.l_21,R.drawable.l_21));
        letters.add(new Letter(22,"كاف","Kaf",R.raw.l_22,R.drawable.l_22));
        letters.add(new Letter(23,"لام","Lam",R.raw.l_23,R.drawable.l_23));
        letters.add(new Letter(24,"ميم","Meem",R.raw.l_24,R.drawable.l_24));
        letters.add(new Letter(25,"نون","Noon",R.raw.l_25,R.drawable.l_25));
        letters.add(new Letter(26,"هاء","Ha'a",R.raw.l_26,R.drawable.l_26));
        letters.add(new Letter(27,"واو","Wow",R.raw.l_27,R.drawable.l_27));
        letters.add(new Letter(28,"ياء","Ya'a",R.raw.l_28,R.drawable.l_28));
        LettersAdapter lettersAdapter = new LettersAdapter(this,letters);
        lettersListView.setAdapter(lettersAdapter);


    }
}
