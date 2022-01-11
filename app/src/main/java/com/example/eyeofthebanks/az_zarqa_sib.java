package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_sib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_sib);
    }

    public void saadeh_sib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%B5%D9%81%D9%88%D9%87+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A%E2%80%AD/@32.0635221,36.0869556,17z/data=!4m13!1m7!3m6!1s0x151b6f8be1aa8513:0xdfbe6ba3b9f2159c!2sAl-Saadeh+St,+Az-Zarqa!3b1!8m2!3d32.0635176!4d36.0891443!3m4!1s0x151b6576a5405de1:0x4d5638862525b92b!8m2!3d32.0638579!4d36.0872592"));
        startActivity(intent);
    }

    public void new_zarqa_sib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Safwa+Islamic+Bank/@32.0860729,36.0864528,18.69z/data=!4m13!1m7!3m6!1s0x0:0x0!2zMzLCsDA1JzA4LjciTiAzNsKwMDUnMTQuNSJF!3b1!8m2!3d32.085736!4d36.087356!3m4!1s0x151b6555b8164b0b:0x8beb0a135c53823f!8m2!3d32.085738!4d36.0868837"));
        startActivity(intent);
    }
}