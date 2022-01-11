package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_boj);
    }

    public void salt__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan+Salt+%7C+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86+%D8%A7%D9%84%D8%B3%D9%84%D8%B7%E2%80%AD/@32.0369573,35.7277139,19.42z/data=!4m5!3m4!1s0x151cbd453e981743:0x3e992d8f94e10ece!8m2!3d32.0373492!4d35.7281014"));
        startActivity(intent);
    }

    public void fuheis__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Of+Jordan/@32.0013875,35.7859106,18.17z/data=!4m5!3m4!1s0x151ca318d5448b6b:0x802217875c8e3d74!8m2!3d32.0023145!4d35.7873705"));
        startActivity(intent);
    }
}