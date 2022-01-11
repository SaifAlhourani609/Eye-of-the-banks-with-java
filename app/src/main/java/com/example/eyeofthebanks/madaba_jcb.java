package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class madaba_jcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba_jcb);
    }

    public void madaba__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Commercial+Bank/@31.7193143,35.7922694,19.17z/data=!4m5!3m4!1s0x151cacd0615b47bd:0x39114129bf48c2c6!8m2!3d31.7191476!4d35.7928207"));
        startActivity(intent);
    }
}