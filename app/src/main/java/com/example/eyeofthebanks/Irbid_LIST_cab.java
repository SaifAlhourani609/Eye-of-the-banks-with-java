package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Irbid_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid__l_i_s_t_cab);
    }

    public void field(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.555389,35.849083,18z/data=!4m5!3m4!1s0x151c76a20ce5b2a5:0x226d6796d07dfe19!8m2!3d32.5556071!4d35.8493221?hl=en-US"));
        startActivity(intent);
    }


    public void Yarmouk(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.536273,35.854233,18z/data=!4m5!3m4!1s0x151c76ebdcb290bb:0x3768c8f1f67982d9!8m2!3d32.5363366!4d35.8534779?hl=en-US"));
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.557022,35.854484,19z/data=!4m5!3m4!1s0x151c7730f3a33063:0x3362a0c9a7baabdc!8m2!3d32.5570212!4d35.8539479?hl=en-US"));
        startActivity(intent);
    }

    public void Kenana(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Amman+Cairo+Bank/@32.6328718,35.837983,18z/data=!4m5!3m4!1s0x151c74ba853a1747:0x94aef7ba24e6e8!8m2!3d32.6328491!4d35.8409942?hl=en-US"));
        startActivity(intent);
    }

    public void Said(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.506141,35.687269,18z/data=!4m5!3m4!1s0x151c65a5635dcc93:0x27262d93d6081234!8m2!3d32.506582!4d35.6878836?hl=en-US"));
        startActivity(intent);
    }

    public void Omar(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank/@32.562139,35.863278,17z/data=!4m5!3m4!1s0x151c7428d9e89a7f:0xa51edaf13ace0470!8m2!3d32.5614846!4d35.8631448?hl=en-US"));
        startActivity(intent);
    }

    public void Abdullah(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/King+Abdullah+University+Hospital/@32.501243,35.994071,18z/data=!4m5!3m4!1s0x151b894f02de6993:0x2e9c8598ea8b72b8!8m2!3d32.5015538!4d35.994147?hl=en-US"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/