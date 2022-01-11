package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_ahli);
    }

    public void aqaba__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@29.5298267,35.0037841,19z/data=!4m9!1m2!2m1!1z2KfZhNi52YLYqNmHINin2YTYqNmG2YMg2KfZhNin2YfZhNmK!3m5!1s0x15007037a3d96653:0x48154dcba217b7f8!8m2!3d29.5298267!4d35.0042442!15sCiTYp9mE2LnZgtio2Ycg2KfZhNio2YbZgyDYp9mE2KfZh9mE2YoiA4gBAZIBA2F0bQ"));
        startActivity(intent);
    }

    public void safeway_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank+ATM+-+JO138/@29.5375999,35.0109514,18.14z/data=!4m5!3m4!1s0x150070238b6cb773:0xaa9d811f5d0d9767!8m2!3d29.5391807!4d35.0115388"));
        startActivity(intent);
    }
}