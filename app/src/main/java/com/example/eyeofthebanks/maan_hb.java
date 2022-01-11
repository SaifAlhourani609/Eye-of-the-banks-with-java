package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class maan_hb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan_hb);
    }

    public void maan__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Housing+Bank/@30.197498,35.735267,16z/data=!4m5!3m4!1s0x0:0x1d8f0d439dea1729!8m2!3d30.1961163!4d35.7357003?hl=ar"));
        startActivity(intent);
    }

    public void petra__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A5%D8%B3%D9%83%D8%A7%D9%86+%D9%84%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D8%A9+%D9%88%D8%A7%D9%84%D8%AA%D9%85%D9%88%D9%8A%D9%84%E2%80%AD/@30.321126,35.48084,20z/data=!4m5!3m4!1s0x0:0x81bb2db0aa999f5a!8m2!3d30.3212442!4d35.4805557?hl=ar"));
        startActivity(intent);
    }

    public void shobak__hb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B3%D9%83%D8%A7%D9%86%E2%80%AD/@30.519738,35.541834,18z/data=!4m5!3m4!1s0x0:0x4ee7fc3c36a615d8!8m2!3d30.5190762!4d35.5417304?hl=ar"));
        startActivity(intent);
    }
}