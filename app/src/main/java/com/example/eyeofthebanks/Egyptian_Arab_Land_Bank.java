package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Egyptian_Arab_Land_Bank extends AppCompatActivity {
    Intent intent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_egyptian__arab__land__bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "EALB");
    }


    public void AMMAN(View view) {
        Intent intent = new Intent(this, amman_ealb.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        Intent intent = new Intent(this, al_mafraq_ealb.class);
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(this, az_zarqa_ealb.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(this, irbid_ealb.class);
        startActivity(intent);
    }

    public void Al_Karak(View view) {startActivity(intent); }

    public void Ajlun(View view) {startActivity(intent); }

    public void Jarash(View view) {startActivity(intent); }

    public void Al_Balqa(View view) {startActivity(intent); }

    public void Madaba(View view) {startActivity(intent); }

    public void Al_Tafilah(View view) {startActivity(intent); }

    public void Al_Aqaba(View view) {
        Intent intent = new Intent(this, al_aqaba_ealb.class);
        startActivity(intent);
    }

    public void Maan(View view) {startActivity(intent); }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "The Egyptian Arab Land Bank is an Egyptian bank, one of the oldest banks in Egypt. It was founded in 1880 under the name of the Egyptian Land Bank and co-founded by Moussa Kattawi, Raphael Soares and Robert Rollo. The bank’s capital when it was established was 40 million French francs, which amounted to 8 million EGP 1942, and in 1999 its name was changed and it became the Egyptian Arab Land Bank now.\n" +
                "\n" +
                "The bank has branches that reach in total to 50 branches distributed between Egypt, Jordan and Palestine in addition to a network of correspondents all over the world, and the bank's portfolio amounts to about 14 billion Egyptian pounds (2.6 billion US dollars).\n" +
                "\n" +
                "The bank provides its services through a number of branches in Jordan."
        );
        intent.putExtra("image", "EALB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.aqaribank.jo/"));
        startActivity(intent);
    }
}