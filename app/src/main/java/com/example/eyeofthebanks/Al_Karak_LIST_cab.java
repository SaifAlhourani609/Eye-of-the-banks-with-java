package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Karak_LIST_cab extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__karak__l_i_s_t_cab);
    }

    public void Thanya(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/CairoAmman+bank/@31.17032,35.730836,20z/data=!4m5!3m4!1s0x150377526115d8f9:0x264543aa1d9ba8b!8m2!3d31.1703578!4d35.7308979?hl=en-US"));
        startActivity(intent);

    }

    public void Main(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+-+Al+Qaser/@31.301472,35.742583,19z/data=!4m5!3m4!1s0x150365692adb5b97:0x2267ebcf0b2a2469!8m2!3d31.3013283!4d35.742587?hl=en"));
        startActivity(intent);
    }
}
 /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/