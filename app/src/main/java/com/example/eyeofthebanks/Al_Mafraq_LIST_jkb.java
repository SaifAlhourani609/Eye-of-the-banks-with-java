package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Mafraq_LIST_jkb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mafraq__l_i_s_t_jkb);
    }

    public void Al_Mafraq_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+Al-Mafraq+Branch%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82%E2%80%AD/@32.3436263,36.2078251,17z/data=!3m1!4b1!4m5!3m4!1s0x151b99cb92555e6b:0x7926784ebfe11a66!8m2!3d32.3436218!4d36.2100138"));
        startActivity(intent);
    }
}
 /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/