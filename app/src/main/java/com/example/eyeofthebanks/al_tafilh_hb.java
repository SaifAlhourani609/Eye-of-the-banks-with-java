package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_tafilh_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_tafilh_hb);
    }

    public void tafilah__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%84%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D8%A9+%D9%88%D8%A7%D9%84%D8%AA%D9%85%D9%88%D9%8A%D9%84%E2%80%AD/@30.836966,35.605809,19z/data=!4m5!3m4!1s0x0:0x462d73ef05c324c4!8m2!3d30.8370642!4d35.6053564?hl=ar"));
        startActivity(intent);
    }
}