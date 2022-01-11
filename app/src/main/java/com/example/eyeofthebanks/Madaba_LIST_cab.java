package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Madaba_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba__l_i_s_t_cab);
    }

    public void German(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+ATM/@31.77612,35.802433,17z/data=!4m5!3m4!1s0x151cadb8064db737:0x4961e0af7f527dbb!8m2!3d31.7759072!4d35.8042376?hl=en-US"));
        startActivity(intent);
    }

    public void Madaba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@31.718891,35.792606,19z/data=!4m5!3m4!1s0x151cacd0606ddd9f:0x5c8e6969437dab5e!8m2!3d31.7189531!4d35.7926949?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/