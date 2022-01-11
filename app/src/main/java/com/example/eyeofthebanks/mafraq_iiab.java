package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mafraq_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafraq_iiab);
    }

    public void mafraq_iiab(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82%E2%80%AD/@32.3419335,36.1968589,17z/data=!3m1!4b1!4m5!3m4!1s0x151b99b808b9f409:0x1e7c2b09023909c2!8m2!3d32.341929!4d36.1990476?hl=en-US"));
            startActivity(intent);
    }
}