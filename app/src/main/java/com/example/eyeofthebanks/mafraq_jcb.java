package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mafraq_jcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafraq_jcb);
    }

    public void mafraq__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82%E2%80%AD/@32.3380129,36.214,19.17z/data=!4m5!3m4!1s0x151b99b4c019e2bf:0x240b998a02aa0961!8m2!3d32.3380656!4d36.2143027"));
        startActivity(intent);
    }


}