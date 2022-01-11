package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_hb);
    }

    public void salt__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.043259,35.727127&z=18&t=m&hl=ar&gl=US&mapclient=apiv3&cid=13083424849719785836"));
        startActivity(intent);
    }

    public void baqa__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.077028,35.842196&z=18&t=m&hl=ar&gl=US&mapclient=apiv3&cid=1191559192390309555"));
        startActivity(intent);
    }

    public void fuhies__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank/@32.003461,35.777368,16z/data=!4m5!3m4!1s0x0:0x76821e5b784ce32f!8m2!3d32.0017411!4d35.7772344?hl=ar"));
        startActivity(intent);
    }

    public void deir__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.184663,35.621977,18z/data=!4m5!3m4!1s0x0:0xae3e55e010a05d00!8m2!3d32.1841219!4d35.6212659?hl=ar"));
        startActivity(intent);
    }
}