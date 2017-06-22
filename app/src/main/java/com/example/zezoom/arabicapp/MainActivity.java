package com.example.zezoom.arabicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void openLettersActivity(View view){
        Intent intet = new Intent(this,LettersActivity.class);
        startActivity(intet);
    }
    public void openColorsActivity(View view){
        Intent intet = new Intent(this,ColorsActivity.class);
        startActivity(intet);
    }
    public void openNumbersActivity(View view){
        Intent intet = new Intent(this,NumbersActivity.class);
        startActivity(intet);
    }
    public void openPhrasesActivity(View view){
        Intent intet = new Intent(this,PhrasesActivity.class);
        startActivity(intet);
    }
}
