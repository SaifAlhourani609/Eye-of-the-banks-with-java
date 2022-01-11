package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_iiab);
    }

    public void salt__iiab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A5%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%AF%D9%88%D9%84%D9%8A%E2%80%8E%E2%80%AD/@32.0384006,35.7379963,17z/data=!3m1!4b1!4m5!3m4!1s0x151cbd5349204e53:0x5d4907030bfec99!8m2!3d32.0384006!4d35.740185"));
        startActivity(intent);
    }
}


