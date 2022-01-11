package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_sc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_sc);
    }

    public void main_SC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Standard+Chartered+Bank/@31.9658102,35.8789833,15z/data=!4m9!1m2!2m1!1sAl+Thaqafeh+St,+Amman+Standard+Chartered!3m5!1s0x151ca06c8925730d:0x58a0e63e40915135!8m2!3d31.9705999!4d35.8997942!15sCihBbCBUaGFxYWZlaCBTdCwgQW1tYW4gU3RhbmRhcmQgQ2hhcnRlcmVkIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void mekkaSt_SC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Standard+Chartered+Bank+-+ATM/@31.9755618,35.845687,14z/data=!4m9!1m2!2m1!1z2LPYqtin2YbYr9ix2K8g2KrYtNin2LHYqtix2K8gbmVhciDYtNin2LHYuSDZhdmD2Kkg2KfZhNmF2YPYsdmF2KnYjCDYudmF2ZHYp9mG2Iwg2KfZhNij2LHYr9mG!3m5!1s0x151ca1b0182b7ad5:0xd61b5fc18b6f5d3f!8m2!3d31.975796!4d35.861912!15sCl3Ys9iq2KfZhtiv2LHYryDYqti02KfYsdiq2LHYryBuZWFyINi02KfYsdi5INmF2YPYqSDYp9mE2YXZg9ix2YXYqdiMINi52YXZkdin2YbYjCDYp9mE2KPYsdiv2YYiA4gBAZIBA2F0bQ"));
        startActivity(intent);
    }

    public void swaifyeh_SC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Standard+Chartered/@31.9573807,35.8682016,16.69z/data=!4m9!1m2!2m1!1z2LPYqtin2YbYr9ix2K8g2KfZhNi12YjZitmB2YrZhw!3m5!1s0x151ca1015bec1abf:0x7d3f2801d8d8c897!8m2!3d31.959259!4d35.8673455!15sCh_Ys9iq2KfZhtiv2LHYryDYp9mE2LXZiNmK2YHZitmHkgEDYXRt"));
        startActivity(intent);
    }

    public void circle_SC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Standard+Chartered+Bank/@31.9585375,35.8702169,15z/data=!4m9!1m2!2m1!1z2LPYqtin2YbYr9ix2K8g2KrYtNin2LHYqtix2K8gbmVhciDYtNin2LHYuSDZhdmD2Kkg2KfZhNmF2YPYsdmF2KnYjCDYudmF2ZHYp9mG2Iwg2KfZhNij2LHYr9mG!3m5!1s0x151ca0558b679ba7:0x4dce7669fc70bcc1!8m2!3d31.960977!4d35.8756671!15sCl3Ys9iq2KfZhtiv2LHYryDYqti02KfYsdiq2LHYryBuZWFyINi02KfYsdi5INmF2YPYqSDYp9mE2YXZg9ix2YXYqdiMINi52YXZkdin2YbYjCDYp9mE2KPYsdiv2YYiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }
}