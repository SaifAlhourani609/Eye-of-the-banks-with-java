package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_ab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_ab);
    }

    public void main_AB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Audi+-+ATM/@31.9627036,35.905945,18z/data=!4m8!1m2!2m1!1z2KjZhtmDINi52YjYr9mHINin2YTYudio2K_ZhNmK!3m4!1s0x151ca070494c1d7b:0x6e29ff3aa79d99a8!8m2!3d31.9629926!4d35.905999"));
        startActivity(intent);
    }

    public void abdoun_AB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Audi+-+ATM/@31.960586,35.873935,21z/data=!4m12!1m6!3m5!1s0x151ca0ff9bbf46cd:0x247daac1d3fb738e!2sBank+Audi+-+ATM!8m2!3d31.9605614!4d35.8738958!3m4!1s0x151ca0ff9bbf46cd:0x247daac1d3fb738e!8m2!3d31.9605614!4d35.8738958?hl=en-US"));
        startActivity(intent);
    }

    public void mecca_AB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Mecca+Mall/@31.9775961,35.8432693,21z/data=!4m18!1m12!4m11!1m4!2m2!1d35.8279705!2d32.0574971!4e1!1m4!2m2!1d35.843258!2d31.977631!4e1!3e0!3m4!1s0x151ca19bc3e1d1ed:0xc7b138ad3619f9b8!8m2!3d31.9775067!4d35.84328"));
        startActivity(intent);
    }

    public void saqra_AB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Audi+-+ATM/@31.961323,35.8917094,20z/data=!4m12!1m6!3m5!1s0x151ca05dc281d49b:0x252e27f9d03c5c4b!2sBank+Audi+-+ATM!8m2!3d31.9612588!4d35.8919931!3m4!1s0x151ca05dc281d49b:0x252e27f9d03c5c4b!8m2!3d31.9612588!4d35.8919931?hl=en-US"));
        startActivity(intent);
    }

    public void swaifyeh_AB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Audi+-+ATM/@31.9586372,35.8599684,17z/data=!4m5!3m4!1s0x151ca10f772c4e6b:0x416e45fda06f66b2!8m2!3d31.95883!4d35.85989?hl=en-US"));
        startActivity(intent);
    }
}