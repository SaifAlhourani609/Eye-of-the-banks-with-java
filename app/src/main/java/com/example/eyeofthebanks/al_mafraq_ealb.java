package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_mafraq_ealb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_mafraq_ealb);
    }

    public void al_mafraq_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D9%82%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A%E2%80%AD/@32.3426748,36.2083173,17z/data=!4m12!1m6!3m5!1s0x151b99b7a1c34b27:0xe1d64d778c4fb42d!2z2KfZhNio2YbZgyDYp9mE2LnZgtin2LHZiiDYp9mE2LnYsdio2Yog2KfZhNmF2LXYsdmK!8m2!3d32.3426703!4d36.210506!3m4!1s0x151b99b7a1c34b27:0xe1d64d778c4fb42d!8m2!3d32.3426703!4d36.210506"));
        startActivity(intent);
    }
}