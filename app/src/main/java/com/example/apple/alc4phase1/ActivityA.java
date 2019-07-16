package com.example.apple.alc4phase1;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class ActivityA extends AppCompatActivity {

    Button myProfil, aboutALc;
    TextView tvTitle;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        Typeface tf = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Bold.ttf");
        Typeface tf2 = Typeface.createFromAsset(getAssets(), "fonts/Montserrat-Regular.ttf");
        myProfil = (Button) findViewById(R.id.btnProfile);
        myProfil.setTypeface(tf);
        aboutALc = (Button) findViewById(R.id.btnAlc);
        aboutALc.setTypeface(tf);
        tvTitle = (TextView)findViewById(R.id.tvTitle);
        tvTitle.setTypeface(tf);
        myProfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityA.this, ActivityC.class);
                startActivity(intent);
            }
        });

        aboutALc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ActivityA.this, ActivityB.class);
                startActivity(intent);
            }
        });
    }
}
