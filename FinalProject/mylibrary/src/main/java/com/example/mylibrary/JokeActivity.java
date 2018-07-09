package com.example.mylibrary;

import android.content.Context;
import android.os.AsyncTask;
import android.support.v4.util.Pair;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {
TextView joke;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);;
        joke = findViewById(R.id.joke_textview);
        joke.setText(getIntent().getExtras().getString("Joke"));
    }


}
