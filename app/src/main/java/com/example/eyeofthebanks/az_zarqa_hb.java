package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class az_zarqa_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az_zarqa_hb);
    }

    public void zarqa__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A5%D8%B3%D9%83%D8%A7%D9%86+-+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1%E2%80%AD/@32.06185,36.091896,20z/data=!4m5!3m4!1s0x0:0x6e6214435bc60237!8m2!3d32.0618735!4d36.0919611?hl=ar"));
        startActivity(intent);
    }

    public void russeifa__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@32.018027,36.041775,20z/data=!4m5!3m4!1s0x0:0x5a40951129707d01!8m2!3d32.0181182!4d36.0417632?hl=ar"));
        startActivity(intent);
    }

    public void qasr__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%84%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D8%A9+%D9%88%D8%A7%D9%84%D8%AA%D9%85%D9%88%D9%8A%D9%84%E2%80%AD/@32.06421,36.084325,18z/data=!4m5!3m4!1s0x0:0x79e37d72e0d8ce9b!8m2!3d32.0638586!4d36.084372?hl=ar"));
        startActivity(intent);
    }

    public void maasom__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%84%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D9%87+%D9%88%D8%A7%D9%84%D8%AA%D9%85%D9%88%D9%8A%D9%84%E2%80%AD/@32.078524,36.074405,18z/data=!4m5!3m4!1s0x0:0x8ff8058d848d860e!8m2!3d32.0779611!4d36.0747081?hl=ar"));
        startActivity(intent);
    }

    public void new__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%AC%D8%AF%D9%8A%D8%AF%D8%A9%E2%80%AD/@32.085986,36.086648,19z/data=!4m5!3m4!1s0x0:0x928d570f18b921ae!8m2!3d32.0858544!4d36.086778?hl=ar"));
        startActivity(intent);
    }

    public void azraq__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@31.882764,36.832761,19z/data=!4m5!3m4!1s0x0:0x696919da2c862f4!8m2!3d31.8824904!4d36.8324811?hl=ar"));
        startActivity(intent);
    }
}