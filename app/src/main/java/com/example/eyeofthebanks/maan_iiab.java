package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class maan_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan_iiab);
    }

    public void maan__iiab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%AF%D9%88%D9%84%D9%8A%E2%80%AD/@30.2033525,35.7256258,16.19z/data=!4m12!1m6!3m5!1s0x1501461aa53cd087:0xb6d2b8174e91547!2z2KfZhNio2YbZgyDYp9mE2LnYsdio2Yog2KfZhNin2LPZhNin2YXZiiDYp9mE2K_ZiNmE2Yo!8m2!3d30.2022435!4d35.7302883!3m4!1s0x1501461aa53cd087:0xb6d2b8174e91547!8m2!3d30.2022435!4d35.7302883?hl=en-US"));
        startActivity(intent);
    }
}