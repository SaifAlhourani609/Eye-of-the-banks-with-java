package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Aqaba_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__aqaba__l_i_s_t__a_b_c);
    }

    public void Aqaba_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank+%D8%A7%D9%84%D9%85%D8%A4%D8%B3%D8%B3%D8%A9+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A%D8%A9+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%81%D9%8A%D8%A9%E2%80%AD/@29.5304955,35.0027284,17z/data=!3m1!4b1!4m5!3m4!1s0x15007037702afcbf:0x8216064a7924556f!8m2!3d29.5304909!4d35.0049171"));
        startActivity(intent);
    }

    public void An_Nahdahh(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+ABC%E2%80%AD/@29.5281986,35.0019928,17z/data=!4m9!1m2!2m1!1zCSDZgdix2Lkg2KfZhNi52YLYqNipINio2YbZgyDYp9mE2YXYpNiz2LPYqSDYp9mE2LnYsdio2YrYqSDYp9mE2YXYtdix2YHZitip!3m5!1s0x15007036e284c327:0xfc36f7bcb6003a9d!8m2!3d29.5304883!4d35.0049208!15sCknZgdix2Lkg2KfZhNi52YLYqNipINio2YbZgyDYp9mE2YXYpNiz2LPYqSDYp9mE2LnYsdio2YrYqSDYp9mE2YXYtdix2YHZitipIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }
  /*  Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/
}