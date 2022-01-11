package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_capital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_capital);
    }

    public void aqaba__capital(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Capital+Bank+Aqaba+Branch/@29.531854,35.001997,20z/data=!4m5!3m4!1s0x0:0x7d97510f1e9b84c0!8m2!3d29.5318539!4d35.0019972?hl=en"));
        startActivity(intent);
    }
}