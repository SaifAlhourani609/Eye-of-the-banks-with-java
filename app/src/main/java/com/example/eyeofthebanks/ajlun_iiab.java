package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ajlun_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajlun_iiab);
    }

    public void ajlun__iiab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Islamic+Bank+International/@32.3289785,35.7496384,18z/data=!4m12!1m6!3m5!1s0x151c87dac77becaf:0x4cd0df70fee6d525!2sArab+Islamic+Bank+International!8m2!3d32.3289219!4d35.7507274!3m4!1s0x151c87dac77becaf:0x4cd0df70fee6d525!8m2!3d32.3289219!4d35.7507274"));
        startActivity(intent);
    }
}