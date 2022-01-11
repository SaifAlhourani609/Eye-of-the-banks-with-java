package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Jarash_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jarash__l_i_s_t_cab);
    }

    public void Philadelphia(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.165059,35.851094,18z/data=!4m5!3m4!1s0x151c9cca922328a7:0x176b2a5a13c10a24!8m2!3d32.1648933!4d35.8508701?hl=en-US"));
        startActivity(intent);
    }

    public void Jerash_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+-+Jarash/@32.275,35.894278,19z/data=!4m5!3m4!1s0x151c81ef28e1be3f:0x9b44b1c614cc7461!8m2!3d32.2751841!4d35.8944188?hl=en-US"));
        startActivity(intent);
    }


}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/