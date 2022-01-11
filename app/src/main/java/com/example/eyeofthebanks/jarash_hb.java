package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class jarash_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash_hb);
    }

    public void jarash__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.283115,35.894916,18z/data=!4m5!3m4!1s0x0:0x2cba315c15a728af!8m2!3d32.2822653!4d35.8948844?hl=ar"));
        startActivity(intent);
    }
}