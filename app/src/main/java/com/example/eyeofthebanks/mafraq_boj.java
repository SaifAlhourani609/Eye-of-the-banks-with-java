package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mafraq_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafraq_boj);
    }

    public void mafraq__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@32.3448285,36.2079116,18.23z/data=!4m5!3m4!1s0x151b99b801f6d215:0x573bde870fe0703f!8m2!3d32.3446338!4d36.2087763"));
        startActivity(intent);
    }
}