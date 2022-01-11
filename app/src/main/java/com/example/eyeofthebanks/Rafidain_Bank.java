package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Rafidain_Bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rafidain__bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "RG");
    }


    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_rafidaen.class);
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
                "A bank in Jordan is a branch of Al-Rafidain Bank, Baghdad, which was established in 1941, and its objectives are summarized in supporting the national economy and financing trade between Jordan and Iraq. By participating in bank pool loans in partnership with other local banks, as well as incoming and outgoing remittances from Iraq and transferring salaries to Iraqi retirees residing in Jordan, as well as employing cash surpluses through deposits for one to six months.\n" +
                "\n" +
                "The bank started with a paid-up capital in 1957 with an amount of fifty thousand Jordanian dinars, and then the capital was increased at successive periods according to the instructions of the Central Bank of Jordan until the registered and paid-up capital became twenty million Jordanian dinars in 2010, then the bank’s capital was increased to fifty million 2012 dinars.\n" +
                "\n" +
                "The main branch was established - Amman 19/11/1957 under the Companies Law of 1927. Other branches were established in 1981 in Jabal Amman and Aqaba, noting that the Mafraq branch was established in 1970.\n"
        );
        intent.putExtra("image", "RG");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.rafidainamman.com/"));
        startActivity(intent);
    }
}