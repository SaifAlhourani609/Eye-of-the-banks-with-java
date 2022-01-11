package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class National_Bank_of_Kuwait extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__bank_of__kuwait);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "NBK");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_nbk.class);
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

    public void Maan(View view) {
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "The National Bank of Kuwait opened its first branch in Jordan in Amman in 2004, in an effort to keep pace with and invest the close ties between Kuwait and Jordan and provide services locally to the clients of Al-Watani Group. The bank expanded its client base to include major local companies and institutions, high net worth individuals and resident Jordanians. Abroad.\n" +
                "\n" +
                "NBK provides its customers with a wide range of corporate banking services and products, in addition to commercial finance, private banking and individual banking services. The Bank includes an experienced team of Customer Relationship Managers who have great capabilities in developing and providing banking solutions tailored to the needs and requirements of customers.\n" +
                "\n" +
                "It works closely with its counterparts in the network of NBK branches and subsidiaries to provide support to its customers in their cross-border transactions and to meet their other global investment needs.\n"
        );
        intent.putExtra("image", "NBK");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.nbk.com/jordan/"));
        startActivity(intent);
    }
}