package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_nbk extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_nbk);
    }

    public void main_NBK(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/National+Bank+of+Kuwait+-+Jordan/@31.9600046,35.8797595,15.08z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTZg9mI2YrYqiDYp9mE2YjYt9mG2Yog2YHYsdi5INi02KfYsdi5INmF2YPZhyA!3m5!1s0x151ca050899c09a7:0x9a352b40b5fa0e07!8m2!3d31.9662059!4d35.8815528!15sCjfYqNmG2YMg2KfZhNmD2YjZitiqINin2YTZiNi32YbZiiDZgdix2Lkg2LTYp9ix2Lkg2YXZg9mHIgOIAQFaOSI32KjZhtmDINin2YTZg9mI2YrYqiDYp9mE2YjYt9mG2Yog2YHYsdi5INi02KfYsdi5INmF2YPZh5IBBGJhbmuaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTTJNSFZZV1VwUkVBRQ"));
        startActivity(intent);
    }

    public void khelda_NBK(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/National+Bank+of+Kuwait+NBK+-+ATM/@31.9943511,35.8292685,18.44z/data=!4m12!1m6!3m5!1s0x151ca18acf95e58f:0xdf0e60b05de675f5!2sNational+Bank+of+Kuwait+NBK+-+ATM!8m2!3d31.994925!4d35.829937!3m4!1s0x151ca18acf95e58f:0xdf0e60b05de675f5!8m2!3d31.994925!4d35.829937"));
        startActivity(intent);
    }
}