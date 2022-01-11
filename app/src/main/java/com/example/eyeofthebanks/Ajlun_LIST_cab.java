package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Ajlun_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajlun__l_i_s_t_cab);
    }

    public void Ajloun(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86%E2%80%AD/@32.3309129,35.7501717,17z/data=!4m9!1m2!2m1!1z2YXYqNmG2Ykg2YXYpNiz2LPYqSDYp9mE2KPZgtix2KfYtiDYudis2YTZiNmG!3m5!1s0x151c87db4d46f633:0x7e6dbaf2026faad0!8m2!3d32.3316519!4d35.7515534!15sCi3Zhdio2YbZiSDZhdik2LPYs9ipINin2YTYo9mC2LHYp9i2INi52KzZhNmI2YaSAQ9pbnZlc3RtZW50X2Jhbms?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/