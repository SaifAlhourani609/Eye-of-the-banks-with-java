package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activityAJIB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_j_i_b);
    }
    public void AMMAN(View view) {
        Intent amman= new Intent(this,AMMAN_LIST_ajib.class);
        startActivity( amman);
    }

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST_ajib.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST_ajib.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST_ajib.class);
        startActivity( Irbid);
    }

    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST_ajib.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST_iajib.class);
        startActivity(Ajlun);
    }

    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST_ajib.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST_ajib.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST_ajib.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        Intent Al_Tafilah= new Intent(this,Al_Tafilah_LIST_ajib.class);
        startActivity(Al_Tafilah);
    }

    public void Al_Aqaba(View view) {
        Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST_ajib.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        Intent  Maan= new Intent(this, Maan_LIST_ajib.class);
        startActivity( Maan);
    }

    public void about_the_bank_ajib(View view) {
        Intent intent= new Intent(getBaseContext(),ajib.class);
        intent.putExtra("text","General information\n" +"About the Arab Jordan Investment Bank AJIB\n" +
                "Over the course of four decades, the Arab Jordan Investment Bank (AJIB) embarked on a journey of excellence and leadership, which paved the way for it to become one of the leading investment and commercial institutions in Jordan. Stemming from its commitment to customer satisfaction, Arab Jordan Investment Bank provides a comprehensive package of innovative services and products that meet the needs of all customers, whether at the level of individuals or small and medium enterprises, up to the largest companies.\n" +
                "\n" +
                "The Arab Jordan Investment Bank is constantly working on developing, modernizing and developing its human resources, as well as providing the latest technologies, best international practices and work mechanisms, in response to the growing needs of its customers in Jordan and the region.\n" +
                "\n" +
                "Today, the Arab Jordan Investment Bank plays a vital role in the investment banking scene in the region, due to its extensive experience in the field of investment banking services, in addition to the list of innovative banking products and solutions it provides.\n" +
                "\n" +
                "The Arab Jordan Investment Bank is committed to providing a wide and integrated range of banking and investment services, including mergers, asset acquisitions, and financial market activities, whether primary or secondary markets, in addition to investment services in trading and research related to stocks and markets, as well as granting loans and financing projects. .\n" +
                "\n" +
                "In addition to the above, the Department of Retail and Sales Services is making efforts to provide a wide range of products and services in the field of personal and housing loans, credit cards, and many other distinguished services.\n" +
                "\n" +
                "The Arab Jordan Investment Bank receives its valued customers, in its comprehensive network of branches, which are spread in all major regions at the level of the Hashemite Kingdom of Jordan. In parallel, the Bank provides more than 1,000 ATMs, which are part of the local Automated Teller Machine Network (JONET).\n" +
                "\n" +
                "As part of the bank’s expansion strategy, it opened its branch in Limassol - Cyprus, in 1989. In 2006, the bank established the Arab Jordan Investment Bank (Qatar) LLC, to be the first bank in the Qatar Financial Center to provide its advanced banking and investment services in Qatar and other countries. Other GCC.\n" +
                "\n" +
                "The Arab Jordan Investment Bank provides clients with financial intermediation services at the Amman Stock Exchange, through its subsidiary company \"The United Arab Jordan Investment and Financial Brokerage Company\", and more information about it can be obtained by visiting the company's website www.uajci.com.\n" +
                "\n" +
                "Since 2010, Jordan International Bank (JIB) has been an ally of the Arab Jordan Investment Bank, working from its headquarters in London, United Kingdom, to provide a wide range of banking and investment services to companies and institutions both in the United Kingdom and abroad, for more information About Jordan International Bank Please visit the bank's website: www.jordanbank.co.uk."
        );




        startActivity(intent);}

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.ajib.com/ar"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
    }


}