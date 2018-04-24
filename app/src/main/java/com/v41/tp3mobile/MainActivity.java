package com.v41.tp3mobile;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int hello = 10;
        int fuckingcunt = 0000;
    }

    public void onClickPlayButton(View view) {
        //TODO: show dialog where player chooses his deck and difficulty
//        Intent intent = new Intent(this, Deck.class);
//
//        startActivity(intent);
    }

    public void onClickDeckButton(View view) {
        Intent intent = new Intent(this, DeckManagementActivity.class);

        startActivity(intent);
    }
}
