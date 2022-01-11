package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_rb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_rb);
    }

    public void zarqa_rb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Rajhi+Bank/@32.08623,36.086048,18z/data=!4m12!1m6!3m5!1s0x151b6555b0ea3195:0xa39107a426dbd38!2sRajhi+Bank!8m2!3d32.0861283!4d36.0871298!3m4!1s0x151b6555b0ea3195:0xa39107a426dbd38!8m2!3d32.0861283!4d36.0871298"));
        startActivity(intent);
    }
}