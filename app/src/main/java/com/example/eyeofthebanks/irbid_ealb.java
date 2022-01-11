package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_ealb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_ealb);
    }

    public void irbid_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D9%82%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%8A+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%E2%80%AD/@32.553484,35.8544349,19.89z/data=!4m12!1m6!3m5!1s0x151c777ec9885c09:0xad6b06ae8cb11f94!2z2KfZhNio2YbZgyDYp9mE2LnZgtin2LHZiiDYp9mE2YXYtdix2Yog2KfZhNi52LHYqA!8m2!3d32.5534836!4d35.8549239!3m4!1s0x151c777ec9885c09:0xad6b06ae8cb11f94!8m2!3d32.5534836!4d35.8549239"));
        startActivity(intent);
    }
}