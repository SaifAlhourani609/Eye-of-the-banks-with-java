package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class jarash_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash_ahli);
    }

    public void jarash__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.2804168,35.8945092,18.86z/data=!4m5!3m4!1s0x151c803826bb054d:0x7ae5d707a53a3e80!8m2!3d32.280831!4d35.8951721"));
        startActivity(intent);
    }
}