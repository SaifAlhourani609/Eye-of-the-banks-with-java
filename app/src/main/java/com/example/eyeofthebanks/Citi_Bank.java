package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Citi_Bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_citi_bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "CB");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_cb.class);
        startActivity(amman);
    }

    public void Al_Mafraq(View view) {
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        startActivity(intent);
    }

    public void Irbid(View view) {
        startActivity(intent);
    }

    public void Al_Karak(View view) {
        startActivity(intent);
    }

    public void Ajlun(View view) {
        startActivity(intent);
    }

    public void Jarash(View view) {
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        startActivity(intent);
    }

    public void Madaba(View view) {
        startActivity(intent);
    }

    public void Al_Tafilah(View view) {
        startActivity(intent);
    }

    public void Al_Aqaba(View view) {
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "Citibank, one of the largest banks in the world, was established in 1812. It is the banking arm of Citigroup. It operates in more than 100 countries around the world. Together with Citigroup, it is the largest bank in terms of deposits in the United States, followed by Bank of America and JPMorgan Chase.\n" +
                "\n" +
                "It was established under the name Citibank of New York, and entered the American banking system in 1863 and was renamed National City Bank five years later. It was the first American bank to expand in Argentina when it established its Buenos Aires branch in 1914.\n" +
                "\n" +
                "It is reported that the bank announced losses of more than 8 billion dollars after the announcement of Merrill Lynch's losses in the mortgage crisis.\n"
        );
        intent.putExtra("image", "CB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.citibank.com/icg/sa/emea/jordan/"));
        startActivity(intent);
    }

    public void Maan(View view) {
        startActivity(intent);
    }

}