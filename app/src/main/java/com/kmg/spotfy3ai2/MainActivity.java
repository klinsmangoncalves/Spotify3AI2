package com.kmg.spotfy3ai2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;


public class MainActivity extends AppCompatActivity {


    ImageView coverImage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        coverImage = findViewById(R.id.ivCover);

        Glide.with(this).load("https://img.youtube.com/vi/GAly0cOLMc8/0.jpg").into(coverImage);

        //Glide.with(this).load("https://img.youtube.com/vi/WLVUPcC09KU/0.jpg").into(cover);

    }
}
