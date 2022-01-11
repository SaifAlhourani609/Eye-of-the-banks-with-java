package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_ahli);
    }

    public void zarqa_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.0617187,36.0921061,19.22z/data=!4m5!3m4!1s0x151b6f896c38cd4f:0x2345e60444650683!8m2!3d32.0618554!4d36.0929712"));
        startActivity(intent);
    }

    public void free_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.0607381,36.093803,19.92z/data=!4m12!1m6!3m5!1s0x151b6f01cdef04f3:0x5d733e5400f6826a!2sJordan+Ahli+Bank!8m2!3d32.0608187!4d36.0941795!3m4!1s0x151b6f01cdef04f3:0x5d733e5400f6826a!8m2!3d32.0608187!4d36.0941795"));
        startActivity(intent);
    }

    public void new_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.0858722,36.0879754,20.42z/data=!4m5!3m4!1s0x151b655590f331ab:0xa692bf9fc9083681!8m2!3d32.0858195!4d36.08846"));
        startActivity(intent);
    }
}