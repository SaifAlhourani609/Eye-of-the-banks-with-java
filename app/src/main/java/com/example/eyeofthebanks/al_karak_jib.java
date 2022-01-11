package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_karak_jib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_karak_jib);
    }

    public void almarj_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/Jordan+Islamic+Bank+(Prairie+Branch)/@31.1738712,35.7178343,16z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTYp9ix2K_ZhtmKINin2YTZhdix2Kwg2KfZhNmD2LHZg-KArSA!3m5!1s0x15037734a1f4d7c1:0x31d92212328dded0!8m2!3d31.1773796!4d35.7137153!15sCkPYp9mE2KjZhtmDINin2YTYp9iz2YTYp9mF2Yog2KfZhNin2LHYr9mG2Yog2KfZhNmF2LHYrCDYp9mE2YPYsdmD4oCtIgOIAQGSAQNhdG0"));
        startActivity(intent);
    }

    public void qasser_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A5%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A%E2%80%AD/@31.3106301,35.742991,18.44z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYs9mE2KfZhdmKINin2YTZgti12LE!3m5!1s0x15036532e7175d1f:0x310f6132aba0d8b6!8m2!3d31.3107221!4d35.7432585!15sCibYp9mE2KjZhtmDINin2YTYp9iz2YTYp9mF2Yog2KfZhNmC2LXYsSIDiAEBkgEMc2F2aW5nc19iYW5r?hl=en"));
        startActivity(intent);
    }

    public void mutah_jib(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.jo/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A%E2%80%AD/@31.0918944,35.6975649,20.25z/data=!4m13!1m7!3m6!1s0x0:0x64ef9def3c4fbe4a!2zMzHCsDA1JzMxLjAiTiAzNcKwNDEnNTIuMyJF!3b1!8m2!3d31.091944!4d35.697861!3m4!1s0x15039d77c5463661:0xf0280b22f74e2e4a!8m2!3d31.0920688!4d35.6977287?hl=en"));
        startActivity(intent);
    }
}