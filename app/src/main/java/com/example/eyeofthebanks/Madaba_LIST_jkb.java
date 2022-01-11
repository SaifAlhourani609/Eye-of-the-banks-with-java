package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Madaba_LIST_jkb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba__l_i_s_t_jkb);
    }

    public void Madaba_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+Madaba+Branch+%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D9%85%D8%A3%D8%AF%D8%A8%D8%A7%E2%80%AD/@31.7249959,35.7902783,17z/data=!3m1!4b1!4m5!3m4!1s0x151cacd0635e386b:0x1571c8659f5ac7ce!8m2!3d31.7249914!4d35.792467"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/