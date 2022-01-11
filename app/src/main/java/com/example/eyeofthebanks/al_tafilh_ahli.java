package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_tafilh_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_tafilh_ahli);
    }

    public void tafilah__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@30.8369545,35.6065853,19.58z/data=!4m5!3m4!1s0x1503951e89cb5f0d:0x6ca9b4e59621e689!8m2!3d30.8371497!4d35.6067485"));
        startActivity(intent);
    }
}