package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Jarash_LIST_jkb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash__l_i_s_t_jkb);
    }

    public void Jerash(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A%E2%80%AD/@32.2533311,35.5470076,10z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiDZgdix2Lkg2LnYrNmE2YjZhg!3m5!1s0x151c803841ca5df5:0x4dd53d4d2761491b!8m2!3d32.2820706!4d35.8948556!15sCjrYp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKINmB2LHYuSDYudis2YTZiNmGIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/