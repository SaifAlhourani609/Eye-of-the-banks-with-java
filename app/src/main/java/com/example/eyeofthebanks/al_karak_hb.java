package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_karak_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_karak_hb);
    }

    public void karak__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank+for+Trading+and+Finance/@31.185181,35.703728,20z/data=!4m5!3m4!1s0x0:0x88b1ab2529ee6470!8m2!3d31.1852792!4d35.7035977?hl=ar"));
        startActivity(intent);
    }

    public void tuck__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%AB%D9%86%D9%8A%D9%87%E2%80%AD/@31.172816,35.736074,19z/data=!4m5!3m4!1s0x0:0x7c6cb8a7eb110b65!8m2!3d31.17249!4d35.7360603?hl=ar"));
        startActivity(intent);
    }

    public void qasswr__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@31.310616,35.743363,18z/data=!4m5!3m4!1s0x0:0xaf32d947a04e2f22!8m2!3d31.3103313!4d35.7436239?hl=ar"));
        startActivity(intent);
    }

    public void mutah__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank/@31.091576,35.701969,18z/data=!4m5!3m4!1s0x0:0x4b07d6b74d760392!8m2!3d31.0912644!4d35.7023512?hl=ar"));
        startActivity(intent);
    }
}