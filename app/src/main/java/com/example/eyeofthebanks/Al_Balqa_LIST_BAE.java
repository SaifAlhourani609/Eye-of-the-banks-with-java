package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Balqa_LIST_BAE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balqa__l_i_s_t__b_a_e);
    }

    public void Salt(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@32.0869513,35.8061925,10z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2KjZhNmC2KfYoQ!3m5!1s0x151c99fc9381c8e3:0x18aec4227d36e0c3!8m2!3d32.0570273!4d35.7471508!15sCivYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTYqNmE2YLYp9ihIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void Main(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%AA%D8%AD%D8%A7%D8%AF%E2%80%AD/@32.0869513,35.8061925,10z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2KjZhNmC2KfYoQ!3m5!1s0x151c9f901a3d4f81:0x7bc1a53e5b2419b!8m2!3d32.008294!4d35.8834911!15sCivYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTYqNmE2YLYp9ihIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/