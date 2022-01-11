package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Aqaba_LIST_BAE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__aqaba__l_i_s_t__b_a_e);
    }

    public void Aqaba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@29.5313002,34.9943205,15z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2LnZgtio2Kkg!3m5!1s0x15007036e1fe4fbd:0x976c86a87e1957e2!8m2!3d29.5313002!4d35.0030752!15sCinYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTYudmC2KjYqSIDiAEBWisiKdio2YbZgyDYp9mE2KPYqtit2KfYryDZgdix2Lkg2KfZhNi52YLYqNipkgEEYmFua5oBJENoZERTVWhOTUc5blMwVkpRMEZuU1VSTGNtRkRNMjFSUlJBQg"));
        startActivity(intent);
    }

    public void Electricity(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@29.5313002,34.9943205,15z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2LnZgtio2Kkg!3m5!1s0x1500701fbbdaa57f:0x8385949985fa8992!8m2!3d29.5371459!4d35.0125847!15sCinYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTYudmC2KjYqSIDiAEBkgEDYXRt"));
        startActivity(intent);
    }

    public void Hayatt(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@29.5480537,34.9804108,15z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDYp9mE2LnZgtio2Kkg!3m5!1s0x1500718664e3f6e1:0xab7a1c479bf8e970!8m2!3d29.5480398!4d34.9890424!15sCinYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INin2YTYudmC2KjYqSIDiAEBkgEDYXRt"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/