package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class capital extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_capital);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "CAPITAL");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_capital.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(getBaseContext(), az_zarqa_capital.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(getBaseContext(), irbid_capital.class);
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
        Intent intent = new Intent(getBaseContext(), al_aqaba_capital.class);
        startActivity(intent);
    }

    public void Maan(View view) {
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "The Capital Bank Group is one of the largest banking institutions operating in the Jordanian and regional markets, with assets amounting to 4 billion Jordanian dinars, while the total rights of its shareholders are approximately 400 million Jordanian dinars.\n" +
                "\n" +
                "The Capital Bank Group includes both Capital Bank, which was established in 1995, and since that time its business has grown to become today one of the leading Jordanian banks specialized in providing integrated packages of investment and commercial banking solutions and services designed to meet the requirements of both corporate and individual clients.\n" +
                "\n" +
                "Capital Bank offers its corporate clients a wide range of services, including corporate finance, trade finance, asset management, brokerage in financial markets, and research through its wholly owned subsidiary, Capital Investments, as the bank's investment arm.\n" +
                "\n" +
                "In addition to corporate services, the Bank provides its banking services directed at serving its distinguished customers, including various personal facilities from bank accounts, credit cards, personal loans, car loans, and housing loans, which are characterized by flexibility in terms and competitive interest rates.\n" +
                "\n" +
                "Capital Bank was established under the name “Export and Finance Bank” with a capital equivalent to 20 million Jordanian dinars (28 million US dollars), which has been increased during the bank’s years of operation to reach 200 million Jordanian dinars, equivalent to 282 million US dollars, representing The bank's capital with its new identity, which bears the name \"Capital Bank\". Capital Bank has achieved several successes in the banking sector\n" +
                "\n" +
                "In 2005, Capital Bank (Jordan) purchased the majority of the shares of the National Bank of Iraq (61.85%), which enabled the bank to develop its products and services, enhance its foothold, enhance financial inclusion at the level of Iraq, support export activities and provide all services to Jordanian companies operating in Iraq. In line with the expansion plans of the group, at the end of 2021, the National Bank of Iraq will open a branch in the Kingdom of Saudi Arabia to stimulate trade between the two countries.\n" +
                "\n" +
                " Capital Investments wholly owned by Capital Bank, which was established in 2006, provides specialized investment banking services to its clients through its offices in Jordan and the UAE / Dubai International Financial Center (DIFC), in addition to unique services in the Iraqi market through the National Bank of Iraq.\n" +
                "\n" +
                "Towards the end of 2020, and in translation of its expansion plans, Capital Bank Group acquired the operations of the Lebanese Bank Audi in Jordan and Iraq.\n");
        intent.putExtra("image", "CAPITAL");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.capitalbank.jo/"));
        startActivity(intent);
    }
}