package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_hb);
    }

    public void husun__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%AD%D8%B5%D9%86%E2%80%AD/@32.488209,35.883998,18z/data=!4m5!3m4!1s0x0:0x5494abf09b244f0f!8m2!3d32.4877009!4d35.8837777?hl=ar"));
        startActivity(intent);
    }

    public void ramtha__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank/@32.562229,36.011474,18z/data=!4m5!3m4!1s0x0:0x9d2427606f0c4aa!8m2!3d32.5616346!4d36.0113976?hl=ar"));
        startActivity(intent);
    }

    public void edoun__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/The+Housing+Bank/@32.509128,35.856245,17z/data=!4m5!3m4!1s0x0:0x1be4a4d088937043!8m2!3d32.5083444!4d35.8562184?hl=ar"));
        startActivity(intent);
    }

    public void yarmouk__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.542868,35.8502167,17.36z/data=!4m5!3m4!1s0x0:0x330cf9c49618a435!8m2!3d32.5422538!4d35.8506866?hl=ar"));
        startActivity(intent);
    }

    public void dome__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A5%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.546021,35.856414,18z/data=!4m5!3m4!1s0x0:0x181fe359bea7d3f8!8m2!3d32.5456991!4d35.8567303?hl=ar"));
        startActivity(intent);
    }

    public void quds__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank/@32.555157,35.848247,18z/data=!4m5!3m4!1s0x0:0x34b48fd97a4d3e3e!8m2!3d32.5547217!4d35.8480024?hl=ar"));
        startActivity(intent);
    }

    public void hakama__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%81%D8%B1%D8%B9+%D8%B4%D8%A7%D8%B1%D8%B9+%D8%AD%D9%83%D9%85%D8%A7%E2%80%AD/@32.570847,35.85809,16z/data=!4m5!3m4!1s0x0:0x61dd5a87f84e4398!8m2!3d32.5692972!4d35.858057?hl=ar"));
        startActivity(intent);
    }

    public void shuna__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.610961,35.609869,17z/data=!4m5!3m4!1s0x0:0x6c279430a6af5ed4!8m2!3d32.6101187!4d35.6098454?hl=ar"));
        startActivity(intent);
    }

    public void kinanah__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank+ATM/@32.639284,35.835924,17z/data=!4m5!3m4!1s0x0:0xdffe07dce14b1b87!8m2!3d32.6388895!4d35.8357783?hl=ar"));
        startActivity(intent);
    }

    public void der__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%81%D8%B1%D8%B9+%D8%AF%D9%8A%D8%B1%D8%A7%D8%A8%D9%8A+%D8%B3%D8%B9%D9%8A%D8%AF%E2%80%AD/@32.504624,35.684586,18z/data=!4m5!3m4!1s0x0:0x496071caaa076539!8m2!3d32.504044!4d35.6844745?hl=ar"));
        startActivity(intent);
    }
}