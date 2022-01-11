package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_ajlun_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_ajlun_boj);
    }

    public void ajlun__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Bank/@32.3329549,35.7517749,18.28z/data=!4m5!3m4!1s0x151c87c349c3f60f:0xb4759f9b1bb43f8f!8m2!3d32.3331918!4d35.7520531"));
        startActivity(intent);
    }
}