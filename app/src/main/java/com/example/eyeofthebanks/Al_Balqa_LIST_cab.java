package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Balqa_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balqa__l_i_s_t_cab);
    }



    public void Sweileh(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank%2F+Al-Baqa'a+Branch/@32.077237,35.839623,19z/data=!4m5!3m4!1s0x151c9eba12240e4b:0x80c654a517f4b4b2!8m2!3d32.0773486!4d35.8396906?hl=en-US"));
        startActivity(intent);
    }

    public void Abdullah(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86%E2%80%AD/@32.044389,35.776,20z/data=!4m5!3m4!1s0x151c98651daa88a3:0xe73ecdb691023c50!8m2!3d32.0443447!4d35.7760076?hl=en-US"));
        startActivity(intent);
    }

    public void Deir(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+branch+Deir+Alla/@32.159722,35.616222,18z/data=!4m5!3m4!1s0x151c947941fd4d2b:0xf9f604667140f8db!8m2!3d32.1595821!4d35.6163796?hl=en-US"));
        startActivity(intent);
    }

    public void South(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86%E2%80%AD/@31.900833,35.62231,21z/data=!4m5!3m4!1s0x151cb71244dceb13:0x455043c6af7055b1!8m2!3d31.9008192!4d35.6223271?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/