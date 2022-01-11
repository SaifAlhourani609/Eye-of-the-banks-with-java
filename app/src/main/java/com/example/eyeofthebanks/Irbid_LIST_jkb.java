package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Irbid_LIST_jkb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid__l_i_s_t_jkb);
    }

    public void Al_Husson_Street(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/JKB:+King+Abdullah+II+St%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D8%B4%D8%A7%D8%B1%D8%B9+%D8%A7%D9%84%D9%85%D9%84%D9%83+%D8%B9%D8%A8%D8%AF%D8%A7%D9%84%D9%84%D9%87+%D8%A7%D9%84%D8%AB%D8%A7%D9%86%D9%8A%E2%80%AD/@32.5426552,35.8532543,15z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiBuZWFyINi02KfYsdi5INin2YTYstix2YLYp9ih2IwgSXJiaWQ!3m5!1s0x151c76973dce1389:0xf8ee0effb8689774!8m2!3d32.548748!4d35.854042!15sCk3Yp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKIG5lYXIg2LTYp9ix2Lkg2KfZhNiy2LHZgtin2KHYjCBJcmJpZCIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    public void Jordan_Kuwait_Bank(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank/@32.5365268,35.8612214,15z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiBuZWFyINi02KfYsdi5INin2YTYstix2YLYp9ih2IwgSXJiaWQ!3m5!1s0x151c768aea0df90b:0xe3967d834757923b!8m2!3d32.5365183!4d35.8699469!15sCk3Yp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKIG5lYXIg2LTYp9ix2Lkg2KfZhNiy2LHZgtin2KHYjCBJcmJpZCIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    public void Yarmouk_University(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank+-+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A%E2%80%AD/@32.5365268,35.8612214,15z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KfYsdiv2YbZiiDYp9mE2YPZiNmK2KrZiiBuZWFyINi02KfYsdi5INin2YTYstix2YLYp9ih2IwgSXJiaWQ!3m5!1s0x151c76eacbc2a2c1:0x92026462c7dbcbdd!8m2!3d32.5420562!4d35.8542533!15sCk3Yp9mE2KjZhtmDINin2YTYp9ix2K_ZhtmKINin2YTZg9mI2YrYqtmKIG5lYXIg2LTYp9ix2Lkg2KfZhNiy2LHZgtin2KHYjCBJcmJpZCIDiAEBkgELYmFua19vcl9hdG0"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/