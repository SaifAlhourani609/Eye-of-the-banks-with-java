package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Madaba_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba__l_i_s_t__a_b_c);
    }

    public void Maadaba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+ABC/@31.7238176,35.6527721,11z/data=!4m9!1m2!2m1!1zCSDZgdix2Lkg2KfZhNmF2YHYsdmCICDYqNmG2YMgQUJD!3m5!1s0x151cacdb0b4be399:0x61426e26ab496248!8m2!3d31.7238176!4d35.7928478!15sCh_Zgdix2Lkg2KfZhNmF2YHYsdmCICDYqNmG2YMgQUJDIgOIAQFaICIe2YHYsdi5INin2YTZhdmB2LHZgiDYqNmG2YMgYWJjkgEDYXRt"));
        startActivity(intent);
    }
}