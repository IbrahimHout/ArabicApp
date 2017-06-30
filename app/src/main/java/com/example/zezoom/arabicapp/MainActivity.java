package com.example.zezoom.arabicapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView letterstv = (TextView) findViewById(R.id.letterstv);
        TextView colorstv = (TextView) findViewById(R.id.colorstv);
        TextView numberstv = (TextView) findViewById(R.id.numberstv);
        TextView phrasestv = (TextView) findViewById(R.id.phrasestv);

        letterstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intet = new Intent(MainActivity.this,LettersActivity.class);
                startActivity(intet);

            }
        });
        colorstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intet = new Intent(MainActivity.this,ColorsActivity.class);
                startActivity(intet);
            }
        });
        numberstv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intet = new Intent(MainActivity.this,NumbersActivity.class);
                startActivity(intet);

            }
        });
        phrasestv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intet = new Intent(MainActivity.this,PhrasesActivity.class);
                startActivity(intet);

            }
        });


    }


}
