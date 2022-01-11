package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_jcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_jcb);
    }

    public void salt__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Commercial+Bank/@32.0404634,35.7289042,19.53z/data=!4m5!3m4!1s0x151cbd5ad6f9374d:0x18e277f60a102802!8m2!3d32.040485!4d35.7292158"));
        startActivity(intent);
    }
}