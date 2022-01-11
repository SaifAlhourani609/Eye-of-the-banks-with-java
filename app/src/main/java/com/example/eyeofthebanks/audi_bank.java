package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class audi_bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audi_bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "AB");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_ab.class);
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
                "Bank Audi (English: Bank Audi), a global bank and financial services company headquartered in Beirut, Lebanon. Offers financial products and services such as retail banking, corporate banking, insurance, investment banking, mortgage loans, private banking, private equity, wealth management, credit cards, treasury and capital markets\n" +
                "\n" +
                "Bank Audi has a network of 203 branches, more than 500 ATMs, and a large number of representatives in 29 cities around the world. Bank Audi's operations are primarily concentrated in Lebanon, the Middle East and North Africa, Jordan and Turkey.\n" +
                "At the end of September 2020, Bank Audi private sector clients' deposits amounted to $26.5 billion, while shareholders' equity amounted to $3.0 billion. With more than $35.2 billion in consolidated assets.\n" +
                "Bank Audi was named the best bank in Lebanon in 2017, and is currently ranked number 1,415 in the Forbes 2000 list.\n\n" +
                "\n" +
                "History\n" +
                "Bank Audi was founded in 1830, but was considered a global bank in 1962. It is registered in the commercial registry in Beirut with file number 11347 and in the Lebanese list of banks in Lebanon with number 56.\n" +
                "The shareholder base has expanded to include more than 1,500 holders of ordinary shares and GDRs, after initially including members of the Audi family and some Kuwaiti investors.\n" +
                "In 2004, Bank Audi signed a merger agreement with Saradar Bank, making Saradar Bank one of the largest shareholders in Bank Audi Sal Audi Saradar Group. The merger did not last long, as the two banks separated after only 6 years. On February 20, 2019, Bank Audi announced a new deposit agreement under which Bank of New York Mellon was named the Post-GDR Depository Bank to replace Deutsche Bank.\n" +
                "\n" +
                "Retail and Personal Banking\n" +
                "Bank Audi personal banking is the services and products offered to individuals, such as accounts, cards, loans, services, and specific loans to military generals and public sector employees.\n" +
                "\n" +
                "Commercial Banking\n" +
                "The commercial banking services at Bank Audi are the group of services provided to companies and institutions in Lebanon, and it includes corporate banking services, commercial banking services, banking services for small and medium-sized companies, and managers’ cards for those companies.\n" +
                "\n" +
                "private banking\n" +
                "Private Bank Audi began its operations in 1976 with three main reservation centers in Switzerland, Jordan and the United Arab Emirates. Operations included providing services to high net worth clients and facilitating full access to key markets around the world and global investment products.\n" +
                "\n" +
                "major shareholders\n" +
                "The investment fund FRH owns most of the shares of Bank Audi, followed by the Audi family, then the heirs of Sheikha Suad Hamad Al-Saleh Al-Humaizi, then Sheikh Diab bin Zayed Al Nahyan, then the Al-Sabah family and others.\n" +
                "\n" +
                "In 2018, the European Bank for Reconstruction and Development acquired 2.51% of Bank Audi's total outstanding shares.\n" +
                "\n" +
                "Main subsidiaries\n" +
                "The group of companies affiliated to Bank Audi includes many companies and banks worldwide, such as:\n" +
                "Bank Audi - in Turkey\n" +
                "Bank Audi - in Egypt\n" +
                "Bank Audi - in Switzerland\n" +
                "Private Bank Audi Sal\n" +
                "Auda Capital - in the Kingdom of Saudi Arabia\n" +
                "Bank Audi - in Qatar\n" +
                "Bank Audi - in France\n" +
                "Audi Investment Bank Sal\n" +
                "Audi Holding Investment Group.\n" +
                "\n" +
                "innovative services\n" +
                "In 2011, Bank Audi announced the start of dealing with the Novo space system in selected locations. The new system allows customers to live video chat with money changers and provides a consulting room for specialized advice.\n" +
                "\n" +
                "In 2014, Bank Audi offered its customers NCR Interactive Teller Machines. These ATMs have the advantage of allowing you to speak directly with a personal teller to make transfers, deposits, cash checks and make various types of payments.\n" +
                "\n" +
                "In 2014, Bank Audi introduced Tap2Pay, the first mobile payment service with NFC technology in Lebanon and the Middle East.\n" +
                "\n" +
                "At the end of September 2020, Bank Audi's assets in Jordan amounted to 506 million Jordanian dinars, while Bank Audi Iraq's assets amounted to 275 billion Iraqi dinars. Accordingly, this acquisition will increase the value of the Capital Bank Group's assets to 3.6 billion Jordanian dinars and raise the financial value of the group's shareholders to more than 400 million Jordanian dinars.\n"
        );
        intent.putExtra("image", "AB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bankaudigroup.com/group/common/pages/bank-audi-jordan-branches"));
        startActivity(intent);
    }
}