package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_jib);
    }

    public void aqaba_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+bank+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A5%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A%E2%80%AD/@29.5301782,35.0036504,18z/data=!4m12!1m6!3m5!1s0x1500703775017127:0x7ac8df6634316c8d!2zSm9yZGFuIElzbGFtaWMgYmFuayDYp9mE2KjZhtmDINin2YTYpdiz2YTYp9mF2Yog2KfZhNij2LHYr9mG2Yo!8m2!3d29.5301245!4d35.0045463!3m4!1s0x1500703775017127:0x7ac8df6634316c8d!8m2!3d29.5301245!4d35.0045463?hl=en"));
        startActivity(intent);
    }
}