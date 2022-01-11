package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_boj);
    }

    public void irbid__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@32.5542277,35.8518445,19.39z/data=!4m5!3m4!1s0x151c7699189dc38f:0x469a521bf9b932ab!8m2!3d32.5543628!4d35.8529846"));
        startActivity(intent);
    }

    public void der_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+jordan/@32.5010223,35.6845092,19.92z/data=!4m5!3m4!1s0x151c65f34b2a187d:0xc0966aebea36b3a3!8m2!3d32.5012303!4d35.6841818"));
        startActivity(intent);
    }

    public void husun_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%E2%80%AD/@32.5481773,35.8541925,17.93z/data=!4m5!3m4!1s0x151c769728cbea0b:0x5294250f90de4358!8m2!3d32.5476189!4d35.8549004"));
        startActivity(intent);
    }
}