package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class jordan_islamic_bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan_islamic_bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "JIB");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_jib.class);
        startActivity(amman);
    }

    public void Al_Mafraq(View view) {
        Intent amman = new Intent(this, mafraq_jib.class);
        startActivity(amman);
    }

    public void Az_Zarqa(View view) {
        Intent amman = new Intent(this, az_zarqa_jib.class);
        startActivity(amman);
    }

    public void Irbid(View view) {
        Intent amman = new Intent(this, irbid_jib.class);
        startActivity(amman);
    }

    public void Al_Karak(View view) {
        Intent amman = new Intent(this, al_karak_jib.class);
        startActivity(amman);
    }

    public void Ajlun(View view) {
        Intent amman = new Intent(this, ajlun_jib.class);
        startActivity(amman);
    }

    public void Jarash(View view) {
        Intent amman = new Intent(this, jarash_jib.class);
        startActivity(amman);
    }

    public void Madaba(View view) {
        Intent amman = new Intent(this, madaba_jib.class);
        startActivity(amman);
    }

    public void Al_Tafilah(View view) {
        Intent amman = new Intent(this, al_tafilah_jib.class);
        startActivity(amman);
    }

    public void Al_Balqa(View view) {
        Intent amman = new Intent(this, al_balqa_jib.class);
        startActivity(amman);
    }

    public void Al_Aqaba(View view) {
        Intent amman = new Intent(this, al_aqaba_jib.class);
        startActivity(amman);
    }

    public void Maan(View view) {
        Intent amman = new Intent(this, maan_jib.class);
        startActivity(amman);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "Jordan Islamic Bank was established in 1978, as it is considered the first Islamic bank to be established in Jordan by Dr. Sami Hassan Hammoud. In 2000, the private bank law under which the bank was operating was replaced by a new law that contained a chapter on Islamic banks and their supervisory issues.\n" +
                "\n" +
                "The bank currently owns a network of 75 branches, 28 banking offices, and a service office in the border warehouses (Bunded), in addition to working as a financial intermediary in the Amman Stock Exchange through the Sanabel Al Khair Company for Financial Investments owned by the bank. The bank has 2,000 employees. The Bank's 200 ATMs are also connected to the 850 ATMs of other Jordanian banks, through the Jordanian National Payments Network and the Global Visa Network spread around the world.\n" +
                "\n" +
                "The total balances of savings vessels with the bank out of the total customer deposits with banks operating in Jordan is about 10.3%, and the total financing and investment balances with the bank out of the total direct credit facilities for banks operating in Jordan amounted to about 10.9%. Inside Jordan, it reached 7.3%, as on December 31, 2008.\n" +
                "\n" +
                "The Bank also carries out banking, investment and financing business and services in accordance with the provisions of Islamic Sharia. The Bank owns a distinguished group of businesses through which it provides comprehensive services and products ranging from Murabaha, Musharaka, Mudaraba, Ijarah Muntahia Bittamleek and installment sale, as well as investing in real estate through the purchase of occupied land and real estate developed for the purposes of selling later. Or rent to customers.\n" +
                "\n" +
                "The bank has enjoyed a successful record of performance since its inception, and has distributed dividends to shareholders during the last ten years, equivalent to 186% of the capital, of which 129% are free shares and 57% are cash dividends.\n"
        );
        intent.putExtra("image", "JIB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jordanislamicbank.com/"));
        startActivity(intent);
    }
}