package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_karak_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_karak_boj);
    }

    public void karak__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Of+Jordan/@31.1850043,35.7039821,20.19z/data=!4m5!3m4!1s0x150370d3bedde485:0x5318189026f4351f!8m2!3d31.1851782!4d35.7040858"));
        startActivity(intent);
    }
}