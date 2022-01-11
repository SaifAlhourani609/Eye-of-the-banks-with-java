package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_iiab);
    }

    public void zarqa_iiab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%AF%D9%88%D9%84%D9%8A%E2%80%AD/@32.0556363,36.0848322,14.36z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2LnYsdio2Yog2KfZhNin2LPZhNin2YXZiiDYp9mE2K_ZiNmE2Yog2KfZhNiy2LHZgtin2KE!3m5!1s0x151b656276c27b0b:0xc4970b38bd36b114!8m2!3d32.0626161!4d36.0891683!15sCkTYp9mE2KjZhtmDINin2YTYudix2KjZiiDYp9mE2KfYs9mE2KfZhdmKINin2YTYr9mI2YTZiiDYp9mE2LLYsdmC2KfYoSIDiAEBkgEPaW52ZXN0bWVudF9iYW5r?hl=en-US"));
        startActivity(intent);

    }
}