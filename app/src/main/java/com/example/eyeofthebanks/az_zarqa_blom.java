package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_blom extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_blom);
    }

    public void free_zones_BLOM(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D9%84%D8%A8%D9%86%D8%A7%D9%86+%D9%88%D8%A7%D9%84%D9%85%D9%87%D8%AC%D8%B1+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D9%85%D9%86%D8%B7%D9%82%D8%A9+%D8%A7%D9%84%D8%AD%D8%B1%D8%A9%E2%80%AD/@32.0871666,36.2121713,19z/data=!4m8!1m2!2m1!1z2KfZhNmF2YbYt9mC2Kkg2KfZhNit2LHYqSAxINio2YjYp9io2KkgQkxBTQ!3m4!1s0x151b72533a8e0a55:0x7ca024b3e36edd3d!8m2!3d32.0866484!4d36.2125793"));
        startActivity(intent);
    }
}