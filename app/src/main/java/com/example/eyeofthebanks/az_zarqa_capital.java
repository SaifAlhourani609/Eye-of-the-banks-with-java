package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_capital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_capital);
    }

    public void ghosha_capital(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Capital+Bank/@31.988112,35.875288,21z/data=!4m5!3m4!1s0x0:0x48596ae802b62b5f!8m2!3d31.9881214!4d35.8752514?hl=en"));
        startActivity(intent);
    }

    public void new_capital(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Capital+Bank/@32.085783,36.086111,16z/data=!4m5!3m4!1s0x0:0x858de9113da297f4!8m2!3d32.0857831!4d36.0861112?hl=en"));
        startActivity(intent);
    }
}