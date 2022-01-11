package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class jarash_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash_jib);
    }

    public void jarash_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A5%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A%E2%80%AD/@32.2814948,35.8946201,18z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTYp9ix2K_ZhtmKINis2LHYtA!3m5!1s0x151c816d97d34ebb:0x10be48995be80415!8m2!3d32.2806686!4d35.8952403!15sCjHYp9mE2KjZhtmDINin2YTYp9iz2YTYp9mF2Yog2KfZhNin2LHYr9mG2Yog2KzYsdi0IgOIAQGSAQ9pbnZlc3RtZW50X2Jhbms?hl=en"));
        startActivity(intent);
    }
}