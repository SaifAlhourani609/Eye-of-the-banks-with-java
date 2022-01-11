package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class maan_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan_ahli);
    }

    public void maan__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank+ATM/@30.1966335,35.7349674,20.67z/data=!4m5!3m4!1s0x1501461bf931fb75:0x84d646a8c0acf3fe!8m2!3d30.1967478!4d35.7350134"));
        startActivity(intent);
    }
}