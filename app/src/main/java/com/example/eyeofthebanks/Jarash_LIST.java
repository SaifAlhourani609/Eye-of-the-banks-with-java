package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Jarash_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash__l_i_s_t);

    }

    public void Jarash_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.276377,35.898895,16z/data=!4m5!3m4!1s0x0:0xa558e143afc4208a!8m2!3d32.2792437!4d35.8951879?hl=en-US"));
        startActivity(intent);
    }
}