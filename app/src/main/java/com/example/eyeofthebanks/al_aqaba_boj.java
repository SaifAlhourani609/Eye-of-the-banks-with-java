package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_boj);
    }

    public void aqaba__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Of+Jordan/@29.5324473,35.0021754,18.22z/data=!4m5!3m4!1s0x150070372ae2c277:0xdb89f6626f3e500e!8m2!3d29.5329723!4d35.0031891"));
        startActivity(intent);
    }
}