package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class maan_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan_boj);
    }

    public void maan__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Of+Jordan/@30.1939322,35.7295938,18.39z/data=!4m5!3m4!1s0x150146180323fc13:0x5db1a21c4fae3e6e!8m2!3d30.1935686!4d35.729969"));
        startActivity(intent);
    }
}