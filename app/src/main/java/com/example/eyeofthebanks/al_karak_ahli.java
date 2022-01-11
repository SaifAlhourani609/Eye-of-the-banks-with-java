package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_karak_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_karak_ahli);
    }

    public void karak__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@31.1850945,35.7030592,20.67z/data=!4m5!3m4!1s0x150370d38e2d2c15:0xf3cc495b86f01db1!8m2!3d31.185199!4d35.7031101"));
        startActivity(intent);
    }

    public void mutah_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@31.0911875,35.7035154,19z/data=!4m9!1m2!2m1!1z2YXYpNiq2Ycg2KfZhNio2YbZgyDYp9mE2KfZh9mE2Yo!3m5!1s0x15039d9d70036b49:0x4ad83cdb9ac37b0f!8m2!3d31.0911875!4d35.7040625!15sCiDZhdik2KrZhyDYp9mE2KjZhtmDINin2YTYp9mH2YTZiiIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }
}