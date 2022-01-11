package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Balqa_LIST_ajib extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balqa__l_i_s_t_ajib);
    }

    public void Salt(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(\"\"));\n" +
                "    startActivity(intent);"));
        startActivity(intent);
    }

    public void Salt5(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Ajib+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D8%AA%D8%AB%D9%85%D8%A7%D8%B1+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A%E2%80%AD/@32.0084852,35.7306289,12z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYp9iz2KrYq9mF2KfYsSDYp9mE2LnYsdio2Yog2KfZhNin2LHYr9mG2YogbmVhciDYp9mE2LPZhNi3!3m5!1s0x151c99cad74ad119:0x8010ff4745ce33d7!8m2!3d32.0559469!4d35.7515906!15sCkXYqNmG2YMg2KfZhNin2LPYqtir2YXYp9ixINin2YTYudix2KjZiiDYp9mE2KfYsdiv2YbZiiBuZWFyINin2YTYs9mE2LciA4gBAZIBBGJhbms"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
    startActivity(intent);*/