package com.example.eyeofthebanks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class sorry extends AppCompatActivity {

    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sorry);
        Intent ii = getIntent();
        imageView = findViewById(R.id.iv1);
        String image = ii.getStringExtra("image");
        switch (image) {
            case "SC":
                imageView.setImageResource(R.drawable.sc_logo);
                break;
            case "EALB":
                imageView.setImageResource(R.drawable.ealb_logo);
                break;
            case "CB":
                imageView.setImageResource(R.drawable.citi_logo);
                break;
            case "RG":
                imageView.setImageResource(R.drawable.rg_logo);
                break;
            case "NBK":
                imageView.setImageResource(R.drawable.nbk_logo);
                break;
            case "NBD":
                imageView.setImageResource(R.drawable.nbod_logo);
                break;
            case "BLOM":
                imageView.setImageResource(R.drawable.blom_logo);
                break;
            case "AB":
                imageView.setImageResource(R.drawable.audi_logo);
                break;
            case "IIAB":
                imageView.setImageResource(R.drawable.iiab_logo);
                break;
            case "SIB":
                imageView.setImageResource(R.drawable.sib_logo);
                break;
            case "JIB":
                imageView.setImageResource(R.drawable.jib_logo);
                break;
            case "RB":
                imageView.setImageResource(R.drawable.rb_logo);
                break;
            case "CAPITAL":
                imageView.setImageResource(R.drawable.capital_logo);
                break;
            case "AHLI":
                imageView.setImageResource(R.drawable.ahli_logo);
                break;
            case "BOJ":
                imageView.setImageResource(R.drawable.boj_logo);
                break;
            case "JCB":
                imageView.setImageResource(R.drawable.jcb_logo);
                break;
            case "HB":
                imageView.setImageResource(R.drawable.hb_logo);
                break;
            case "ABC":
                imageView.setImageResource(R.drawable.logoabc);
                break;
            case "ArabBank":
                imageView.setImageResource(R.drawable.arab4);
                break;
        }
    }
}