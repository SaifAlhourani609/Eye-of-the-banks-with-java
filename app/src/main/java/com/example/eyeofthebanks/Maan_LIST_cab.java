package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Maan_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan__l_i_s_t_cab);
    }

    public void Talal(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86+%D9%81%D8%B1%D8%B9+%D8%AC%D8%A7%D9%85%D8%B9%D8%A9+%D8%A7%D9%84%D8%AD%D8%B3%D9%8A%D9%86+%D8%A8%D9%86+%D8%B7%D9%84%D8%A7%D9%84+%D9%85%D8%B9%D8%A7%D9%86%E2%80%AD/@30.268306,35.680389,17z/data=!4m5!3m4!1s0x150144f61bca17d1:0x9d81d84699eec84d!8m2!3d30.2686757!4d35.6815624?hl=en-US"));
        startActivity(intent);
    }

    public void Shoubak(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D9%87+%D8%B9%D9%85%D8%A7%D9%86%E2%80%AD/@30.518389,35.540528,19z/data=!4m5!3m4!1s0x1503df89a09455ff:0x5d9c1bd56f2bd738!8m2!3d30.518411!4d35.5404131?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/