package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Balqa_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__balqa__l_i_s_t__a_b_c);
    }

    public void ABC_bank_ATM(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+bank+ATM/@32.0424801,35.7779408,17z/data=!3m1!4b1!4m5!3m4!1s0x151c99fbc9ab0001:0x215073e0aaea46a8!8m2!3d32.0424801!4d35.7801295"));
        startActivity(intent);
    }
}
 /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/