package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Irbid_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid__l_i_s_t__a_b_c);
    }

    public void Bank_Irbid(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank+Irbid/@32.5334885,35.8346768,14z/data=!4m9!1m2!2m1!1z2YHYsdi5INin2LHYqNivINio2YbZgyDYp9mE2YXYpNiz2LPYqSDYp9mE2LnYsdio2YrYqSDYp9mE2YXYtdix2YHZitip!3m5!1s0x151c76849b381453:0x11f33575376e8627!8m2!3d32.5520232!4d35.8627087!15sCkXZgdix2Lkg2KfYsdio2K8g2KjZhtmDINin2YTZhdik2LPYs9ipINin2YTYudix2KjZitipINin2YTZhdi12LHZgdmK2KkiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }
     /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/
}