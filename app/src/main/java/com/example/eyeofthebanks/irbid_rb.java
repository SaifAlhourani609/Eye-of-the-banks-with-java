package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_rb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_rb);
    }

    public void city_RB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Irbid+City+Center/@32.5358248,35.8561363,15z/data=!4m9!1m2!2m1!1z2KfYsdio2K8g2LPZitiq2Yog2LPZhtiq2LE!3m5!1s0x151c76f344fa4c67:0x8f66171f036354d6!8m2!3d32.5358248!4d35.864891!15sChrYp9ix2KjYryDYs9mK2KrZiiDYs9mG2KrYsVocIhrYp9ix2KjYryDYs9mK2KrZiiDYs9mG2KrYsZIBD3Nob3BwaW5nX2NlbnRlcg"));
        startActivity(intent);
    }

    public void irbid__rb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Al+Rajhi+Bank/@32.5521799,35.8573784,19.67z/data=!4m8!1m2!2m1!1z2YXYr9mK2YbYqSDYp9ix2KjYryDZhdmC2KfYqNmEINin2YTYqNmG2YMg2KfZhNmF2LHZg9iy2Yo!3m4!1s0x151c76916dac0453:0x70fb8b1695b7c1e2!8m2!3d32.5522539!4d35.8572621"));
        startActivity(intent);
    }
}