package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class blom_Bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blom_bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "BLOM");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_blom.class);
        startActivity(amman);
    }

    public void Al_Mafraq(View view) {
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent amman = new Intent(this, az_zarqa_blom.class);
        startActivity(amman);
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
                "“BLOM BANK” (Banque du Liban et D’Outre Mer, BLOM BANK) is a Lebanese bank established in 1951 and has been regularly selected as the best bank in Lebanon by the consensus of important international and regional references, including Euromoney and The Banker. Its activities are based on a comprehensive banking model, and its services include: commercial, private, investment, Islamic, retail and corporate banking, asset management services, brokerage and insurance.\n" +
                "\n" +
                "The BLOM BANK's career began in the fifties of the last century, specifically in 1951 in Beirut. Its establishment coincided with a renaissance in the Lebanese banking sector. By the year 1953, the bank began expanding its activities abroad and opened a branch in Jeddah, Kingdom of Saudi Arabia. With the outbreak of the Lebanese war, the expansion of BLOM BANK abroad was enhanced, thus meeting the banking needs of the Lebanese communities. Today, BLOM BANK is present in 12 countries around the world. At the leadership level, Dr. Noaman Al-Azhari assumed the role of General Manager of the Bank starting in 1962 and served as Chairman of the Board of Directors and General Manager since 1971. In 2008, Dr. Noaman Azhari is the Chairman of the BLOM BANK Group, while his son, Mr. Saad Azhari, has been named Chairman and General Manager of BLOM BANK, and he also occupies the position of Vice President of the Association of Banks in Beirut.\n" +
                "The name of the bank was changed to BLOM Bank in the year 2000. It bought the Lebanese branch from H Bank. AC. with me. bad. Middle East after the approval of the Banque du Liban.\n" +
                "As of 2016, it was considered \"the second largest bank in Lebanon in terms of market capitalization\".\n" +
                "BLOM BANK supports Beirut Marathon.\n" +
                "\n" +
                "Processes\n" +
                "BLOM BANK and its subsidiaries provide commercial banking, retail banking, investment banking, Islamic banking and insurance services in Lebanon, Europe, the Middle East and North Africa. With regard to commercial banking, BLOM BANK provides its clients with several services, including deposits, housing loans, consumer loans, credit cards, money transfers, foreign exchange services, and other services related to branches. In terms of corporate banking, the Bank provides loans and other credit facilities, trade finance, deposit and current accounts for companies and institutions. The Department of Funds, Funds and Capital Markets provides fund and investment services and tailored services to investors and other companies. As for the asset management and private banking division, it mainly provides investment services, investment and brokerage services. In the field of insurance business, the company offers various insurance products such as life insurance, health insurance, motor insurance, marine insurance, property insurance, and liability insurance.\n" +
                "\n" +
                "Bank and affiliate network\n" +
                "BLOM BANK is currently present in 12 countries including Lebanon, Jordan, UAE, France, England, Switzerland, Romania, Cyprus, Egypt, Qatar, Iraq and Saudi Arabia. The bank provides its services through a network of financial and banking units operating under the umbrella of BLOM BANK or its affiliated institutions.\n" +
                "Affiliated banks and institutions: BLOM Bank France, BLOM Bank Switzerland, BLOM Bank Egypt, BLOM Egypt Securities, BLOM Bank Qatar, BLOM Investment Saudi Company, BLOM Business Bank, BLOM Development Bank (Islamic Bank), BLOM Asset Management Co. Ml.\n" +
                "Affiliated insurance institutions: Arope Insurance, Arope Egypt Insurance, Arope Egypt Life Insurance, and Lebanon and Overseas Securities Company - Jordan.\n" +
                "\n" +
                "Corporate Social Responsibility\n" +
                "With regard to corporate social responsibility, BLOM BANK signed on December 26, 2014 the UN Global Compact, which commits it to respect ten principles and to take the necessary measures to support UN goals and to submit a progress report (COP). As a subsequent step to the signing of the United Nations Global Compact, in April 2015 the Board of Directors approved the establishment of a “Corporate Social Responsibility Committee” to act as an advisory and advisory body with the primary objective of assisting the Board in fulfilling its responsibilities in relation to the Bank’s social responsibility policies and programs and the Bank’s performance in terms of responsibility as well. Social.\n" +
                "\n" +
                "Also as part of the corporate social responsibility, BLOM BANK offers various programs and projects that complement the policies adopted by it. On the environmental level, BLOM BANK has adopted various policies aimed at reducing the bank's impact on the environment, including the policy of paper recycling and reducing its consumption, the policy of waste recycling, a sustainable supply policy, and a policy of reducing energy consumption.\n" +
                "On the social level, the Bank launched the Bloom Youth Program as a comprehensive platform that helps the Lebanese youth generation in developing their plan for education, facilitating the process of choosing their professions and ensuring their future; He thus empowered the youth.\n" +
                "\n" +
                "On the economic level, the BLOM MasterCard “Giving Card” was launched in cooperation with the Lebanese Mine Action Center (LMAC), a unit in the Lebanese Army, whose goal is to help remove mines and cluster bombs.\n" +
                "\n" +
                "At the level of corporate governance, BLOM BANK is the first bank in the Arab world to sign the “Investors for Governance and Integrity (IGI) Declaration, thus committed to implementing the general rules and recommendations for assessing governance and integrity as well as encouraging ethical behavior.\n"

        );
        intent.putExtra("image", "BLOM");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.blom.com.jo/arabic-retailjordan/home"));
        startActivity(intent);
    }
}