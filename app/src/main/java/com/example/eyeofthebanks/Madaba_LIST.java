package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.eyeofthebanks.Arab_Bank.Madaba;

public class Madaba_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba__l_i_s_t);

    }

    public void Madaba_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.717841,35.79414,18z/data=!4m5!3m4!1s0x0:0xbd824b3ad80b957!8m2!3d31.7183397!4d35.7929005?hl=en-US"));
        startActivity(intent);
    }
}