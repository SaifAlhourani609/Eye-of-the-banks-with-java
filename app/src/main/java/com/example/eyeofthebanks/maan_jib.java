package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class maan_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan_jib);
    }

    public void ayl_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/%D8%B5%D8%B1%D8%A7%D9%81+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A%E2%80%AD/@30.2054722,35.5396028,19z/data=!4m13!1m7!3m6!1s0x0:0x8043f09b92ff8e5a!2zMzDCsDEyJzE5LjciTiAzNcKwMzInMjAuNiJF!3b1!8m2!3d30.2054722!4d35.5390556!3m4!1s0x15016ac69037dff9:0xf32e280d0032bbd3!8m2!3d30.2054001!4d35.5392413?hl=ar"));
        startActivity(intent);
    }

    public void musa_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/jordan+islamic+bank/@30.3212528,35.4786247,17z/data=!3m1!4b1!4m5!3m4!1s0x1501692d78e8fd75:0x23d95768e29e02c9!8m2!3d30.3212482!4d35.4808134"));
        startActivity(intent);
    }
}