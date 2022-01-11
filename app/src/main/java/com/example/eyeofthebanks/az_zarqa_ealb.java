package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_ealb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_ealb);
    }

    public void az_zarqa_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D9%82%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A%E2%80%AD/@32.0876647,36.100582,17z/data=!4m12!1m6!3m5!1s0x151b701cf67cd3ef:0x5bd661b3c3ebb02!2z2KfZhNio2YbZgyDYp9mE2LnZgtin2LHZiiDYp9mE2YXYtdix2Yo!8m2!3d32.0876602!4d36.1027707!3m4!1s0x151b701cf67cd3ef:0x5bd661b3c3ebb02!8m2!3d32.0876602!4d36.1027707"));
        startActivity(intent);
    }
}