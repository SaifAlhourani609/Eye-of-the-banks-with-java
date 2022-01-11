package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Karak_LIST_BAE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__karak__l_i_s_t__b_a_e);
    }

    public void High(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@31.169924,35.4491587,10z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2YPYsdmD!3m5!1s0x150377386276f4b3:0x37c47fd644cb57f6!8m2!3d31.169924!4d35.7293101!15sCifYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTZg9ix2YMiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void Karak(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@31.169924,35.4491587,10z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2YPYsdmD!3m5!1s0x15037d6eb7ac766b:0x234111bc65177f8b!8m2!3d31.2104302!4d35.837128!15sCifYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTZg9ix2YMiA4gBAVopIifYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTZg9ix2YOSAQNhdG2aASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVUmhkVWwxZWtoM0VBRQ"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/