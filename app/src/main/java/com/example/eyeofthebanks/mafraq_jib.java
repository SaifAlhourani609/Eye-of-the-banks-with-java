package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mafraq_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafraq_jib);
    }

    public void mafrak_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Islamic+Bank/@32.3396332,36.2076416,17z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTYp9ix2K_ZhtmKINio2YjYp9io2Kkg2KfZhNmF2YHYsdmC4oCtIA!3m5!1s0x151b99b84ee3f78f:0x74d9bab4511322bc!8m2!3d32.3412633!4d36.2051389!15sCkXYp9mE2KjZhtmDINin2YTYp9iz2YTYp9mF2Yog2KfZhNin2LHYr9mG2Yog2KjZiNin2KjYqSDYp9mE2YXZgdix2YLigK0iA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void salheyah_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/ATM+Islamic+Bank/@32.260655,36.4744707,19.89z/data=!4m13!1m7!3m6!1s0x0:0x555a21f864196e13!2zMzLCsDE1JzM5LjYiTiAzNsKwMjgnMjguOSJF!3b1!8m2!3d32.260989!4d36.474708!3m4!1s0x151bafcbfb09a157:0x7da18bcb69bf1be5!8m2!3d32.2609819!4d36.4747545?hl=en"));
        startActivity(intent);
    }

    public void balama_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank/@32.2353383,36.0886968,18.08z/data=!4m13!1m7!3m6!1s0x0:0x93e30c460f38e6d5!2zMzLCsDE0JzA3LjgiTiAzNsKwMDUnMjIuMCJF!3b1!8m2!3d32.235511!4d36.089456!3m4!1s0x151b781d603ab96f:0xff78c82b4dbd065f!8m2!3d32.2352697!4d36.0893325?hl=en"));
        startActivity(intent);
    }
}