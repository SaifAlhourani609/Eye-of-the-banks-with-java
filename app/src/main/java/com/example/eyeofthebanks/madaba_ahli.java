package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class madaba_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba_ahli);
    }

    public void madaba__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@31.7234939,35.7929533,18.78z/data=!4m5!3m4!1s0x151cadc225122909:0x2550cfd6adc33ef0!8m2!3d31.7232701!4d35.7925749"));
        startActivity(intent);
    }
}