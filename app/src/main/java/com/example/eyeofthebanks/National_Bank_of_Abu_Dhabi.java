package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class National_Bank_of_Abu_Dhabi extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_national__bank_of__abu__dhabi);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "NBD");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_nbd.class);
        startActivity(intent);
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
                "The Islamic International Arab Bank is a Jordanian bank that conducts its banking business in accordance with the provisions of Islamic Sharia in response to the growing demand for Islamic banking services and products in Jordan and in the Arab and Islamic markets. 327) on 3/30/1997 AD.\n" +
                "\n" +
                "Proceeding from the verse that distinguishes between lawful and unlawful (and God has permitted selling and forbidden usury), and believing in the lofty message of Islam in the economy based on justice and partnership, and with efficient commercial, investment and financial banking, backed by distinguished banking expertise, the Islamic International Arab Bank began practicing its banking business in accordance with the provisions of Sharia. On the twelfth of Shawwal 1418 AH corresponding to the ninth of February 1998 AD, the Islamic International Arab Bank is one of the most prominent Islamic banking institutions in Jordan and the region. The Islamic International Arab Bank was established as a public joint stock company under the Companies Law of 1989 and registered in the Public Shareholding Companies Register under No. (327) on 3/30/1997.\n" +
                "\n" +
                "The vital role of the Shari'a Supervisory Board of the Islamic International Arab Bank has emerged to work on the basis of the Shari'a rule that states the following: \"He who strives and is correct will have two rewards, and whoever strives and errs has one reward.\" The Sharia Supervisory Board is responsible for accompanying the bank in its tasks and cooperating in achieving its objectives, starting with issuing fatwas that provide the bank with Sharia solutions in its practices and practical activities, in a way that gives it the status of legitimacy and secures it from falling into the forbidden or approaching it, and it approves all financing and investment contracts.\n"
        );
        intent.putExtra("image", "NBD");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bankfab.com/ar-jo"));
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        startActivity(intent);
    }
}