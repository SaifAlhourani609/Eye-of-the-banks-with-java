package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.eyeofthebanks.Arab_Bank.Al_Hashimi_Al_Mafraq;
import com.example.eyeofthebanks.Arab_Bank.Prince_Mohammad_Al_Mafraq;

public class Al_Mafraq_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mafraq__l_i_s_t);

    }

    public void mafraq(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D9%85%D9%81%D8%B1%D9%82%E2%80%AD/@32.343487,36.210451,20z/data=!4m5!3m4!1s0x0:0xfbde77fff75145f6!8m2!3d32.3434269!4d36.2101905?hl=en-US"));
        startActivity(intent);
    }

}