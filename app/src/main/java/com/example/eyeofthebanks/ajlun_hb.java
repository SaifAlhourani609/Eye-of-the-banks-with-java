package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ajlun_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajlun_hb);
    }

    public void ajlun__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.332212,35.75118,17z/data=!4m5!3m4!1s0x0:0x9a24d6ef14b93c80!8m2!3d32.3329697!4d35.7512981?hl=ar"));
        startActivity(intent);
    }

    public void kufranjah__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank/@32.3329697,35.7491094,17z/data=!3m1!4b1!4m5!3m4!1s0x151c87dcade658c9:0x9a24d6ef14b93c80!8m2!3d32.3329697!4d35.7512981"));
        startActivity(intent);
    }
}