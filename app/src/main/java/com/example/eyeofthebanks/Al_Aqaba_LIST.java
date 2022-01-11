package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Aqaba_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__aqaba__l_i_s_t);

    }


    public void Al_Aqaba_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@29.528132,35.004066,19z/data=!4m5!3m4!1s0x0:0x6675bb75c447dcfc!8m2!3d29.5281986!4d35.0041815?hl=en-US"));
        startActivity(intent);
    }

    public void Hotel(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ATM+Arab+Aapennek/@29.534448,34.995258,20z/data=!4m5!3m4!1s0x0:0x4f8e4800cb1305e2!8m2!3d29.5344931!4d34.99508?hl=en-US"));
        startActivity(intent);
    }
}