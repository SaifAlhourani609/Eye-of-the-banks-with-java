package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_tafilah_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_tafilah_jib);
    }

    public void hasa_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Islamic+Bank+Al-Hasa/@30.8191783,35.962544,14.72z/data=!4m13!1m7!3m6!1s0x1504776a2a0d4ecb:0xa55fd1859566e0e4!2sHasa!3b1!8m2!3d30.8260013!4d35.976529!3m4!1s0x150476e2a6ad8ff1:0x1a04a06deb641c23!8m2!3d30.817105!4d35.970673"));
        startActivity(intent);
    }

    public void tafilah_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+-%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B7%D9%81%D9%8A%D9%84%D8%A9%E2%80%AD/@30.8369428,35.6031153,18z/data=!4m13!1m7!3m6!1s0x0:0xc0e97c9d9247308b!2zMzDCsDUwJzEzLjUiTiAzNcKwMzYnMTUuMCJF!3b1!8m2!3d30.837083!4d35.604167!3m4!1s0x15039540a0e8d713:0xe1ab2f58c7316141!8m2!3d30.8362159!4d35.6036187?hl=en"));
        startActivity(intent);
    }
}