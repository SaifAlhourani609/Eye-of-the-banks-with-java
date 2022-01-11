package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Mafraq_LIST_BAE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mafraq__l_i_s_t__b_a_e);
    }

    public void main(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@32.340225,36.2029141,17z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSAg2KfZhNmF2YHYsdmC!3m5!1s0x151b99bbc6b5488f:0x93a160ceb11ac2f3!8m2!3d32.340225!4d36.2051028!15sCirYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5ICDYp9mE2YXZgdix2YIiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/