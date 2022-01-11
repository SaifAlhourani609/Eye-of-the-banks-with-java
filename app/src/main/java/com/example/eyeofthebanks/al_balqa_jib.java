package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_jib);
    }

    public void basha_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Islamic+Bank+ATM/@32.0575893,35.8345631,18.42z/data=!4m9!1m2!2m1!1zRWluIEFsLUJhc2hhINin2YTYqNmG2YMg2KfZhNin2LPZhNin2YXZig!3m5!1s0x151c9ed133ac66e9:0x5132ca61d71c13fe!8m2!3d32.0578943!4d35.8352821!15sCihFaW4gQWwtQmFzaGEg2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKIgOIAQGSAQNhdG0"));
        startActivity(intent);
    }

    public void shuna_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank+%2F+Barn/@31.8988529,35.6158874,18z/data=!4m13!1m7!3m6!1s0x0:0xadcb03a101efb96!2zMzHCsDUzJzU2LjYiTiAzNcKwMzcnMDIuMSJF!3b1!8m2!3d31.899061!4d35.617247!3m4!1s0x151cb70ee661c8c7:0x2fcf48d57b273e9a!8m2!3d31.8988461!4d35.6166585?hl=en"));
        startActivity(intent);
    }

    public void alla_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank/@32.1897659,35.6214521,19.17z/data=!4m13!1m7!3m6!1s0x0:0x241b2d18762ffcb9!2zMzLCsDExJzIxLjciTiAzNcKwMzcnMTguMCJF!3b1!8m2!3d32.189361!4d35.621667!3m4!1s0x151c93badc2197d9:0x30c178276e98bcee!8m2!3d32.1894235!4d35.6216022?hl=en"));
        startActivity(intent);
    }

    public void salt_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Islamic+Bank/@32.037587,35.7285483,20.61z/data=!4m13!1m7!3m6!1s0x0:0xc0baccc05efd637d!2zMzLCsDAyJzE0LjciTiAzNcKwNDMnNDMuNSJF!3b1!8m2!3d32.037417!4d35.72875!3m4!1s0x151cbd454efd5a09:0xb57c8802965942f1!8m2!3d32.0376839!4d35.7288721?hl=en"));
        startActivity(intent);
    }
}