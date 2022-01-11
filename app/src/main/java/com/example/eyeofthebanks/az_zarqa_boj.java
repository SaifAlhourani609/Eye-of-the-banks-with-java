package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_boj);
    }

    public void zarqa__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@32.064263,36.085445,20.33z/data=!4m5!3m4!1s0x151b6563c03efb85:0x4fdc6187bc6097d3!8m2!3d32.064209!4d36.0853367"));
        startActivity(intent);
    }

    public void russeifa__boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan+Al-Ruseifa+%7C+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86+%D8%A7%D9%84%D8%B1%D8%B5%D9%8A%D9%81%D8%A9%E2%80%AD/@32.0279248,36.0357643,19.69z/data=!4m16!1m10!4m9!1m4!2m2!1d35.9043105!2d31.9416302!4e1!1m3!2m2!1d36.0361839!2d32.0282004!3m4!1s0x151b64281683f129:0x750c926a9a6b009e!8m2!3d32.0280729!4d36.0361309"));
        startActivity(intent);
    }
}