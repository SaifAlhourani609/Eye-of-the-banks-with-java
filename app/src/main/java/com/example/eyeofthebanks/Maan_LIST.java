package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Maan_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maan__l_i_s_t);
    }

    public void Maan_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=30.202048,35.729675&z=18&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=12272284596113704836"));
        startActivity(intent);
    }

    public void Wadi_Musa_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@30.321645,35.480287,19z/data=!4m5!3m4!1s0x0:0xacef116c287cacc0!8m2!3d30.3217246!4d35.4798179?hl=en-US"));
        startActivity(intent);
    }
}