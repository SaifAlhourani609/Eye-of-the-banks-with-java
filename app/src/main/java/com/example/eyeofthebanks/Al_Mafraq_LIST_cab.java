package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Al_Mafraq_LIST_cab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__mafraq__l_i_s_t_cab);
    }
    public void Mafraq(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D9%82%D8%A7%D9%87%D8%B1%D8%A9+%D8%B9%D9%85%D8%A7%D9%86%E2%80%AD/@32.341139,36.211194,18z/data=!4m5!3m4!1s0x151b99b703258e63:0x13f45e862a1c17f5!8m2!3d32.3410383!4d36.2113476?hl=en-US"));
        startActivity(intent);
    }



    public void Bayt(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Cairo+Amman+Bank+-+Al-Albayt+University/@32.332139,36.242611,17z/data=!4m5!3m4!1s0x151b986a972902ab:0x1fc464827b587f04!8m2!3d32.3323709!4d36.2422656?hl=en-US"));
        startActivity(intent);
    }
}