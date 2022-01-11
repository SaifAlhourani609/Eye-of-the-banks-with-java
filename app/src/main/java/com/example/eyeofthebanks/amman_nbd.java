package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_nbd extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_nbd);
    }

    public void main_nbd(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/National+Bank+of+Abu+Dhabi+NBAD/@31.975552,35.894332,16.71z/data=!4m12!1m6!3m5!1s0x151ca014f1c07605:0xea31022fc9e31683!2sNational+Bank+of+Abu+Dhabi+NBAD!8m2!3d31.9756037!4d35.8970026!3m4!1s0x151ca014f1c07605:0xea31022fc9e31683!8m2!3d31.9756037!4d35.8970026"));
    startActivity(intent);
    }
}