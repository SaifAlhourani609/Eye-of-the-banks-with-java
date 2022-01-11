package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_ealb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_ealb);
    }

    public void aqaba_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D9%82%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A%E2%80%AD/@29.5304786,35.0042484,19.56z/data=!4m5!3m4!1s0x150071527ba778d7:0x840da15b8254cc78!8m2!3d29.5306847!4d35.004276"));
        startActivity(intent);
    }
}