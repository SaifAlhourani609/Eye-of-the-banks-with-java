package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_iiab);
    }

    public void aqaba__iiab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%AF%D9%88%D9%84%D9%8A%E2%80%AD/@29.5288006,35.0014875,17z/data=!3m1!4b1!4m5!3m4!1s0x150070378b5ec791:0xd028748ad9558ba1!8m2!3d29.528796!4d35.0036762?hl=en-US"));
        startActivity(intent);
    }
}