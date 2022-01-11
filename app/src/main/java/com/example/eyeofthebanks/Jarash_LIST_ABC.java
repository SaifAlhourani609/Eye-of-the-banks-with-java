package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Jarash_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash__l_i_s_t__a_b_c);
    }

    public void Jerash(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@32.2732097,35.8895847,17z/data=!3m1!4b1!4m5!3m4!1s0x151c81df67a1f137:0x60e06d9975379445!8m2!3d32.2732052!4d35.8917734"));
        startActivity(intent);
    }
} /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/
