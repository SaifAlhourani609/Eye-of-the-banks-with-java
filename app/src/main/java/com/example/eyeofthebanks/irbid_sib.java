package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_sib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_sib);
    }

    public void city_sib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86+%D8%AF%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A%E2%80%AD/@32.535974,35.8654428,19.47z/data=!4m13!1m7!3m6!1s0x0:0x0!2zMzLCsDMyJzA4LjgiTiAzNcKwNTEnNTMuNCJF!3b1!8m2!3d32.535769!4d35.864842!3m4!1s0x151c76f35bee3ba9:0xf4f3fd3bfa4951d6!8m2!3d32.5357569!4d35.8657654"));
        startActivity(intent);
    }

    public void hashimi_sib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86+%D8%AF%D8%A8%D9%8A+%D8%A7%D9%84%D8%A5%D8%B3%D9%84%D8%A7%D9%85%D9%8A+-+Jordan+Dubai+Islamic+Bank%D8%8C+%D8%A7%D8%B1%D8%A8%D8%AF%E2%80%AD/@32.5569327,35.8542186,19z/data=!4m12!1m6!3m5!1s0x151c769e9ad55099:0x52f65c06508fba3e!2z2KjZhtmDINin2YTYo9ix2K_ZhiDYr9io2Yog2KfZhNil2LPZhNin2YXZiiAtIEpvcmRhbiBEdWJhaSBJc2xhbWljIEJhbmvYjCDYp9ix2KjYrw!8m2!3d32.556866!4d35.854747!3m4!1s0x151c769e9ad55099:0x52f65c06508fba3e!8m2!3d32.556866!4d35.854747"));
        startActivity(intent);
    }

    public void st_sib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+ATM/@32.5444139,35.8573911,19.97z/data=!4m5!3m4!1s0x151c7691816b291d:0x73ce4c047732db9c!8m2!3d32.5442729!4d35.8585385"));
        startActivity(intent);
    }
}