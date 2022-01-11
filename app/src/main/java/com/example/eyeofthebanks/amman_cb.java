package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_cb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_cb);
    }

    public void main_CB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Citibank/@31.9652311,35.893965,17z/data=!4m5!3m4!1s0x151ca068416a34fb:0xd7e42124a4bba220!8m2!3d31.965939!4d35.8950602"));
        startActivity(intent);
    }
}