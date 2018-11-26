package com.example.byras.basicphrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    MediaPlayer mediaPlayer;

    public void play(View view) throws IOException {
        Button button = (Button) view;
        String buttonIdString = button.getTag().toString();

        int resID = getResources().getIdentifier("hello", "raw", getPackageName());

        if (buttonIdString.equals("doYouSpeak")) {
            resID = getResources().getIdentifier("doyouspeakenglish", "raw", getPackageName());
        }

        if (buttonIdString.equals("goodEavning")) {
            resID = getResources().getIdentifier("goodevening", "raw", getPackageName());
        }

        if (buttonIdString.equals("hello")) {
            resID = getResources().getIdentifier("hello", "raw", getPackageName());
        }

        if (buttonIdString.equals("howAreYou")) {
            resID = getResources().getIdentifier("howareyou", "raw", getPackageName());
        }

        if (buttonIdString.equals("iLiveIn")) {
            resID = getResources().getIdentifier("ilivein", "raw", getPackageName());
        }

        if (buttonIdString.equals("myNameIs")) {
            resID = getResources().getIdentifier("mynameis", "raw", getPackageName());
        }

        if (buttonIdString.equals("please")) {
            resID = getResources().getIdentifier("please", "raw", getPackageName());
        }

        if (buttonIdString.equals("welcome")) {
            resID = getResources().getIdentifier("welcome", "raw", getPackageName());
        }

        mediaPlayer = MediaPlayer.create(this, resID);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mediaPlayer = new MediaPlayer();

    }
}
