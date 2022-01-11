package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Aqaba_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__aqaba__l_i_s_t_cab);
    }

    public void Aqaba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86%E2%80%AD/@29.52925,35.003972,19z/data=!4m5!3m4!1s0x15007039ceb0a849:0xf1dc8aca7a8b884c!8m2!3d29.5295015!4d35.0038056?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/