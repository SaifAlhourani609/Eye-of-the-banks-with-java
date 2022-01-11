package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Madaba_LIST_BAE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_madaba__l_i_s_t__b_a_e);
    }

    public void Madaba(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@31.7207295,35.791115,16z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDZhdin2K_YqNin!3m5!1s0x151cacdc7943e0d7:0xac8508d90850212a!8m2!3d31.7255433!4d35.792235!15sCifYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INmF2KfYr9io2KciA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void main(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Etihad+Bank/@31.7207295,35.791115,16z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDZhdin2K_YqNin!3m5!1s0x151cacdc7c1a2133:0x4bc228cf46a4a36e!8m2!3d31.7255977!4d35.7922608!15sCifYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INmF2KfYr9io2KciA4gBAZIBDHNhdmluZ3NfYmFuaw"));
        startActivity(intent);
    }

    public void Down(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@31.7158975,35.7943724,16z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSDZhdin2K_YqNin!3m5!1s0x151cad6f7268485b:0xa262943ad26be758!8m2!3d31.7158975!4d35.7987498!15sCifYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5INmF2KfYr9io2KciA4gBAZIBA2F0bQ"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/