package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_sib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_sib);
    }

    public void aqaba_sib(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Safwa+Islamic+Bank/@29.5319288,34.9999687,17z/data=!3m1!4b1!4m5!3m4!1s0x150071743b8b8d45:0x5ab17406e2cd5fbb!8m2!3d29.5319242!4d35.0021574"));
            startActivity(intent);
    }
}