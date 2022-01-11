package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Balqa_LIST_jkb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balqa__l_i_s_t_jkb);
    }

    public void Baqah_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+Baq%E2%80%99ah+Branch+%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%A8%D9%82%D8%B9%D8%A9%E2%80%AD/@32.0696909,35.5575983,10z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiDZgdix2Lkg2LnYrNmE2YjZhg!3m5!1s0x151c9ec55a4b0b73:0xc329ab9b27a0617f!8m2!3d32.0696909!4d35.8377497!15sCjrYp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKINmB2LHYuSDYudis2YTZiNmGIgOIAQFaPCI62KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiDZgdix2Lkg2LnYrNmE2YjZhpIBBGJhbmuaASNDaFpEU1VoTk1HOW5TMFZKUTBGblNVTkxNbVYxUkV0bkVBRQ"));
        startActivity(intent);
    }

    public void Al_Salt_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+Al-Salt+Branch%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B3%D9%84%D8%B7%E2%80%AD/@32.0696909,35.5575983,10z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiDZgdix2Lkg2LnYrNmE2YjZhg!3m5!1s0x151cbd457610bacf:0x786b72623506f5b!8m2!3d32.0373971!4d35.7393451!15sCjrYp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKINmB2LHYuSDYudis2YTZiNmGIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void Al_Ahliyya_Amman_University(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+Ahliyya+Uni+%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D8%AC%D8%A7%D9%85%D8%B9%D8%A9+%D8%B9%D9%85%D8%A7%D9%86+%D8%A7%D9%84%D8%A3%D9%87%D9%84%D9%8A%D8%A9%E2%80%AD/@32.0436317,35.7772246,17z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiDZgdix2Lkg2LnYrNmE2YjZhg!3m5!1s0x151c98637c159f9d:0x5adce7a23032ad1b!8m2!3d32.0436317!4d35.7794133!15sCjrYp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKINmB2LHYuSDYudis2YTZiNmGIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/