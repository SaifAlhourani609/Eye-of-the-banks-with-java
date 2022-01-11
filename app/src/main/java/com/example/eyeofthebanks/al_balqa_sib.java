package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_sib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_sib);
    }

    public void balqa_sib(View view)  {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A5%D8%B3%D9%84%D8%A7%D9%85%D9%8A+%D8%A7%D9%84%D8%AF%D9%88%D9%84%D9%8A%E2%80%8E%E2%80%AD/@32.0283655,35.7440755,12z/data=!4m9!1m2!2m1!1z2KfZhNiz2YTYtyDYqNmG2YMg2LXZgdmI2Ycg2KfZhNin2LPZhNin2YXZiiA!3m5!1s0x151cbd5349204e53:0x5d4907030bfec99!8m2!3d32.0384029!4d35.7401776!15sCivYp9mE2LPZhNi3INio2YbZgyDYtdmB2YjZhyDYp9mE2KfYs9mE2KfZhdmKIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }
}