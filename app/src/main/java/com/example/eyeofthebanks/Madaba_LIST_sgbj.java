package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Madaba_LIST_sgbj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba__l_i_s_t_sgbj);
    }

    public void madba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Societe+Generale+Bank+Jordan+SGBJ/@31.7176232,35.7894525,17z/data=!3m1!4b1!4m5!3m4!1s0x151cacd1175f7a37:0x73c35fad05c80dda!8m2!3d31.7176187!4d35.7916412"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/