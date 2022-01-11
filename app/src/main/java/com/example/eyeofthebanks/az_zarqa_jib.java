package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_jib);
    }

    public void Western_Zarqa_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank+neighborhood+of+Zarqa+infallible/@32.0771163,36.0728176,16.08z/data=!4m9!1m2!2m1!1z2KfZhNiy2LHZgtin2KEg2KfZhNi62LHYqNmK2Ycg2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTYp9ix2K_ZhtmK!3m5!1s0x151b65432126db87:0x785fe013596fbe1a!8m2!3d32.0757807!4d36.0776035!15sCkjYp9mE2LLYsdmC2KfYoSDYp9mE2LrYsdio2YrZhyDYp9mE2KjZhtmDINin2YTYp9iz2YTYp9mF2Yog2KfZhNin2LHYr9mG2YoiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void awjan_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank+branch+Awajan/@32.0345278,36.0780891,17z/data=!4m13!1m7!3m6!1s0x0:0xc32436c5590786e1!2zMzLCsDAyJzA0LjMiTiAzNsKwMDQnNDkuMCJF!3b1!8m2!3d32.034528!4d36.080278!3m4!1s0x151b658d71fc921d:0xb3c7926698227219!8m2!3d32.0345995!4d36.0794533?hl=en"));
        startActivity(intent);
    }

    public void zarqa_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jordanislamicbank.com/ar/branch-atm?field_type_of_value_i18n=1&field_region_tid=1727&page=2"));
        startActivity(intent);
    }
}