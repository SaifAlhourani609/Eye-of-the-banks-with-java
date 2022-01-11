package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Tafilah_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__tafilah__l_i_s_t_cab);
    }

    public void Tafila(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("google.com/maps/place/Cairo+Amman+Bank+%2F+Tafeileh+Branch/@30.837583,35.642167,20z/data=!4m5!3m4!1s0x15039488a6c29d1f:0x9516afea224811d4!8m2!3d30.8376382!4d35.6421315?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/