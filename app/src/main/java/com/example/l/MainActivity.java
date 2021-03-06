package com.example.l;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.Locale;

import static android.content.pm.ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE;

public class MainActivity extends AppCompatActivity {
    ImageView img_quran,img_azkar ,img_stories,img_anasheed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.sound);
        img_stories = findViewById(R.id.btn_stories);
        img_anasheed = findViewById(R.id.btn_anasheed);
        img_azkar = findViewById(R.id.btn_azkar);
        img_quran = findViewById(R.id.btn_quran);
        img_stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
                Intent intent = new Intent(MainActivity.this, Stories.class);
                startActivity(intent);
            }
        });

        img_azkar.setOnClickListener(new View.OnClickListener() {
            @Override
            // Amira
            public void onClick(View v) {
                mediaPlayer.start();

            }
        });
        img_anasheed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.start();
            }
        });
        img_quran.setOnClickListener(new View.OnClickListener() {
            @Override
            //Arwa
            public void onClick(View v) {
                mediaPlayer.start();
                Intent quraan = new Intent(MainActivity.this,Quran.class);
                startActivity(quraan);
            }
        });
    }}