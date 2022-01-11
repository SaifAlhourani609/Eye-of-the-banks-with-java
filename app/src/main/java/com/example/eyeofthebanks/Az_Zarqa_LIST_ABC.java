package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Az_Zarqa_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zarqa__l_i_s_t__a_b_c);
    }

    public void Zarqa_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+ABC/@32.0638223,36.0862536,21z/data=!4m5!3m4!1s0x151b6563ca7a98b1:0x49d7935cb218f77f!8m2!3d32.0638016!4d36.0864119"));
        startActivity(intent);
    }
}