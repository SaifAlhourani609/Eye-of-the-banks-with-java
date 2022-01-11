package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class mafraq_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mafraq_hb);
    }

    public void mafraq__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank+for+Trading+and+Finance/@32.3406631,36.2079917,18.08z/data=!4m5!3m4!1s0x151b99b758009d4b:0x7f955100680beece!8m2!3d32.3406129!4d36.208832"));
        startActivity(intent);
    }
}