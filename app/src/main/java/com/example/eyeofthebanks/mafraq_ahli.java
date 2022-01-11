package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mafraq_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafraq_ahli);
    }

    public void mafraq__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.339657,36.2097242,20.67z/data=!4m5!3m4!1s0x151b99b74d7b59a9:0xf5a351a0f3d49d92!8m2!3d32.3398064!4d36.20986"));
        startActivity(intent);
    }
}