package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Karak_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__karak__l_i_s_t);

    }

    public void Al_Karak_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.1849026,35.7125978,15z/data=!4m9!1m2!2m1!1z2KfZhNmD2LHZgyDYp9mE2KjZhtmDINin2YTYudix2KjZig!3m5!1s0x150370d393dfe22b:0x72db7483d13446c1!8m2!3d31.1852654!4d35.7033992!15sCiLYp9mE2YPYsdmDINin2YTYqNmG2YMg2KfZhNi52LHYqNmKIgOIAQGSAQRiYW5r?hl=en-US"));
        startActivity(intent);
    }
}