package com.example.riserva;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView= findViewById(R.id.textViews);
        imageView=findViewById(R.id.imageView);
        if (getSupportActionBar() != null)
        {
            getSupportActionBar().hide();
        }
       new Handler().postDelayed(new Runnable() {
           @Override
           public void run() {
               Intent homeIntent = new Intent(MainActivity.this, MainActivity2.class);
               startActivity (homeIntent);
               finish();
           }
       },3000);
    }
    }

