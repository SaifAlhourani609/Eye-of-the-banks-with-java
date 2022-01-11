package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ajlun_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajlun_jib);
    }

    public void anjara_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank/@32.3284886,35.7509138,17.33z/data=!4m9!1m2!2m1!1zINi52YbYrNix2Kkg2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTYp9ix2K_ZhtmK!3m5!1s0x151c87db293c6e57:0x1003ccdb37547891!8m2!3d32.3302432!4d35.7511519!15sCjXYudmG2KzYsdipINin2YTYqNmG2YMg2KfZhNin2LPZhNin2YXZiiDYp9mE2KfYsdiv2YbZiiIDiAEBkgEPaW52ZXN0bWVudF9iYW5r?hl=en"));
        startActivity(intent);

    }

    public void ibbin_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+%D8%B9%D8%A8%D9%8A%D9%86+%D8%B9%D8%A8%D9%84%D9%8A%D9%86%E2%80%AD/@32.3549035,35.7973547,15.56z/data=!4m13!1m7!3m6!1s0x0:0x98958867cf4d46e5!2zMzLCsDIxJzIzLjUiTiAzNcKwNDcnNDYuMCJF!3b1!8m2!3d32.3565278!4d35.7961111!3m4!1s0x151c7d4fe835bd9b:0x9090b3ddddcc2d97!8m2!3d32.3588343!4d35.7943519?hl=en"));
        startActivity(intent);
    }
}