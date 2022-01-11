package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class amman_rafidaen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_rafidaen);
    }

    public void main_RB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Rafidain+Bank/@31.9521089,35.7749825,11z/data=!4m9!1m2!2m1!1z2YXYtdix2YEg2KfZhNix2KfZgdiv2YrZhg!3m5!1s0x151ca07f5edc96bd:0xf27b34151fa8cded!8m2!3d31.9521222!4d35.9150657!15sChnZhdi12LHZgSDYp9mE2LHYp9mB2K_ZitmGIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void swaifyeh_RB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D9%85%D8%B5%D8%B1%D9%81+%D8%A7%D9%84%D8%B1%D8%A7%D9%81%D8%AF%D9%8A%D9%86%E2%80%AD/@31.9521089,35.7749825,11z/data=!4m9!1m2!2m1!1z2YXYtdix2YEg2KfZhNix2KfZgdiv2YrZhg!3m5!1s0x151ca103fa58b671:0x2f4c6fbbd81c2288!8m2!3d31.9582459!4d35.8666394!15sChnZhdi12LHZgSDYp9mE2LHYp9mB2K_ZitmGIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }


    /*  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/
}
