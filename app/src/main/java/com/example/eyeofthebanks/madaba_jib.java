package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class madaba_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba_jib);
    }

    public void malih_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/ATM+Jordan+Islamic+Bank/@31.5882373,35.8083143,18.81z/data=!4m13!1m7!3m6!1s0x0:0xca6863c3603e159a!2zMzHCsDM1JzA1LjUiTiAzNcKwNDgnMjcuMiJF!3b1!8m2!3d31.584866!4d35.807554!3m4!1s0x150351204f33512b:0x85f07f7f83473da!8m2!3d31.5881795!4d35.8078846?hl=en"));
        startActivity(intent);
    }

    public void Madaba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Islamic+Bank/@31.7126385,35.794878,17.78z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTYp9ix2K_ZhtmKINmF2YTZitit4oCt4oCt!3m5!1s0x151caccdc21c10bb:0x948cf152d1ad3ae6!8m2!3d31.7129903!4d35.7966918!15sCjnYp9mE2KjZhtmDINin2YTYp9iz2YTYp9mF2Yog2KfZhNin2LHYr9mG2Yog2YXZhNmK2K3igK3igK0iA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void shifaa_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/31%C2%B043'51.2%22N+35%C2%B047'30.7%22E/@31.7308889,35.7896724,17z/data=!3m1!4b1!4m5!3m4!1s0x0:0xdc5bcae567140b7!8m2!3d31.730894!4d35.791861?dcr=0"));
        startActivity(intent);
    }
}