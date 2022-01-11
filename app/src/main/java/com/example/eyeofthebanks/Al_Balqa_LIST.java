package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.eyeofthebanks.Arab_Bank.Arab_Bank;

public class Al_Balqa_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balqa__l_i_s_t);
    }

    public void As_Salt_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.041339,35.730115,18z/data=!4m5!3m4!1s0x0:0x40b85c127ef5a57a!8m2!3d32.0411429!4d35.72903?hl=en-US"));
        startActivity(intent);
    }

    public void salt(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+bank+Salt+branch/@32.056247,35.752221,18z/data=!4m5!3m4!1s0x0:0x44474798fdfe74c2!8m2!3d32.0558981!4d35.7516679?hl=en-US"));
        startActivity(intent);
    }
}