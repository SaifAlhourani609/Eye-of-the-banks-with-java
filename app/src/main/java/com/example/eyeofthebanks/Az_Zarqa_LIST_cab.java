package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Az_Zarqa_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zarqa__l_i_s_t_cab);
    }

    public void New(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.0863035,36.0955918,17z/data=!3m1!4b1!4m5!3m4!1s0x151b700286bb09c1:0x8055b569962cf83a!8m2!3d32.0863035!4d36.0977805?hl=en-US"));
        startActivity(intent);
    }

    public void Zarqa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D9%91%D8%A7%D9%86%E2%80%AD/@32.061982,36.0951025,21z/data=!4m5!3m4!1s0x151b6f8eabe8360f:0x8096e9457aca5e54!8m2!3d32.0619283!4d36.0950641?hl=en-US"));
        startActivity(intent);
    }

    public void Rusaifa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86+%2F+%D8%A7%D9%84%D8%B1%D8%B5%D9%8A%D9%81%D9%87%E2%80%AD/@32.016778,36.045528,18z/data=!4m5!3m4!1s0x151b674db6fb1c71:0xff154537b35bb712!8m2!3d32.0168228!4d36.0457594?hl=en-US"));
        startActivity(intent);
    }

    public void North(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.0285,36.050944,18z/data=!4m5!3m4!1s0x151b65d3e1ff3221:0x4bad81a16857abf4!8m2!3d32.0283245!4d36.0511898?hl=en-US"));
        startActivity(intent);
    }

    public void Zarqa_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.060583,36.092111,17z/data=!4m5!3m4!1s0x151b6f88fe6c6179:0x8a3231ac1a8bc4b1!8m2!3d32.060798!4d36.0924754?hl=en-US"));
        startActivity(intent);

    }

    public void Baghdad(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.064639,36.094528,17z/data=!4m5!3m4!1s0x151b6f8b8db25f69:0xc496c093b9640eee!8m2!3d32.0638615!4d36.0942557?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/