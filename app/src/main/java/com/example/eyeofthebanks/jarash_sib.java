package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class jarash_sib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash_sib);
    }

    public void jarash__sib(View view)  {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Safwa+Islamic+Bank/@32.2829118,35.8947342,20.12z/data=!4m12!1m6!3m5!1s0x151c818cbe01292d:0x2cb06a27adcd3697!2sSafwa+Islamic+Bank!8m2!3d32.2828983!4d35.8950269!3m4!1s0x151c818cbe01292d:0x2cb06a27adcd3697!8m2!3d32.2828983!4d35.8950269"));
        startActivity(intent);
    }
}