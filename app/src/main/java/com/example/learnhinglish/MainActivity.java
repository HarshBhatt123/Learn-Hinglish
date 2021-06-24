package com.example.learnhinglish;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mp;



    public void click (View view) throws IOException {

        Button buttonClicked = (Button)  view;
        mp = MediaPlayer.create(this,getResources().getIdentifier(buttonClicked.getTag().toString(),"raw",getPackageName()));

            mp.start();








    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}