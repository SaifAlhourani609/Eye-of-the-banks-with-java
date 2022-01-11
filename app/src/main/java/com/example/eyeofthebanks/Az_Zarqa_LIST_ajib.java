package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Az_Zarqa_LIST_ajib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zarqa__l_i_s_t_ajib);
    }

    public void Zarqa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(" https://www.google.com/maps/place/Arab+Investment+Bank+of+Jordan/@32.0869722,36.0972712,17z/data=!3m1!4b1!4m5!3m4!1s0x151b7002c5e64873:0xb23303576395bed6!8m2!3d32.0869677!4d36.0994599"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/