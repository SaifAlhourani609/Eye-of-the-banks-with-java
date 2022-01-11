package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Az_Zarqa_LIST_jkb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zarqa__l_i_s_t_jkb);
    }

    public void New_Zarqa_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+New+Zarqa+Branch%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B2%D8%B1%D9%82%D8%A7%D8%A1+%D8%A7%D9%84%D8%AC%D8%AF%D9%8A%D8%AF%D8%A9%E2%80%AD/@32.0889242,36.1050942,17z/data=!3m1!4b1!4m5!3m4!1s0x151b70191f1dee23:0xc368dd219b36d5b4!8m2!3d32.0889197!4d36.1072829"));
        startActivity(intent);
    }

    public void Russaifeh_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Kuwait+Bank:+Russaifeh+Branch+%2F+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%D9%8A+%D8%A7%D9%84%D9%83%D9%88%D9%8A%D8%AA%D9%8A:+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B1%D8%B5%D9%8A%D9%81%D8%A9%E2%80%AD/@32.0168955,36.0433793,17z/data=!3m1!4b1!4m5!3m4!1s0x151b66877ec12b6d:0x33bf468b764bd2f8!8m2!3d32.016891!4d36.045568"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/