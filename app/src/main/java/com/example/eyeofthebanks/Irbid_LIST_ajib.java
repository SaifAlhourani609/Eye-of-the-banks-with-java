package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Irbid_LIST_ajib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid__l_i_s_t_ajib);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Jordan+Investment+Bank+AJIB+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D8%AA%D8%AB%D9%85%D8%A7%D8%B1+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+%D9%81%D8%B1%D8%B9+%D8%A7%D8%B1%D8%A8%D8%AF%E2%80%AD/@32.598292,35.8392429,11z/data=!4m9!1m2!2m1!1z2YHYsdmI2Lkg2KjZhtmDINin2YTYp9iz2KrYq9mF2KfYsSDYp9mE2LnYsdio2Yog2KfZhNij2LHYr9mG2YrigK0!3m5!1s0x151c775d70fd92bf:0x84905567bedb22da!8m2!3d32.5557635!4d35.8504553!15sCkHZgdix2YjYuSDYqNmG2YMg2KfZhNin2LPYqtir2YXYp9ixINin2YTYudix2KjZiiDYp9mE2KPYsdiv2YbZiuKArSIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    public void Abdulla_Bin_Al_Hussain(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D8%AA%D8%AB%D9%85%D8%A7%D8%B1+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+AJIB%E2%80%AD/@32.598292,35.8392429,11z/data=!4m9!1m2!2m1!1z2YHYsdmI2Lkg2KjZhtmDINin2YTYp9iz2KrYq9mF2KfYsSDYp9mE2LnYsdio2Yog2KfZhNij2LHYr9mG2YrigK0!3m5!1s0x151c76982ca82e7f:0xa941360d891265c0!8m2!3d32.551144!4d35.8525005!15sCkHZgdix2YjYuSDYqNmG2YMg2KfZhNin2LPYqtir2YXYp9ixINin2YTYudix2KjZiiDYp9mE2KPYsdiv2YbZiuKArSIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/