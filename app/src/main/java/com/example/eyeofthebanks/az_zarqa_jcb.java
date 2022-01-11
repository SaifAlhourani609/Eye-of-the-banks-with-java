package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_jcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_jcb);
    }

    public void zarq__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1%E2%80%AD/@32.0640292,36.0831966,17z/data=!3m1!4b1!4m5!3m4!1s0x151b6563bfbd6859:0x75952a4b2e88917d!8m2!3d32.0640247!4d36.0853853"));
        startActivity(intent);
    }

    public void yajouz__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Commercial+Bank,+Branch+yajouz/@32.0279343,36.0377536,19.81z/data=!4m5!3m4!1s0x151b64283c51a1bd:0x9fe4b027b7d5f60d!8m2!3d32.0281127!4d36.0380564"));
        startActivity(intent);
    }
}