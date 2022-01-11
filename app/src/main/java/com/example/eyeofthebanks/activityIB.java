package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activityIB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_i_b);
    }

    public void AMMAN(View view) {
        Intent amman= new Intent(this,AMMAN_LIST_ib.class);
        startActivity( amman);
    }

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST_ib.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST_ib.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST_ib.class);
        startActivity( Irbid);
    }

    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST_ib.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST_ib.class);
        startActivity(Ajlun);
    }

    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST_ib.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST_ib.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST_ib.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        Intent Al_Tafilah= new Intent(this,Al_Tafilah_LIST_ib.class);
        startActivity(Al_Tafilah);
    }

    public void Al_Aqaba(View view) {
        Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST_ib.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        Intent  Maan= new Intent(this, Maan_LIST_ib.class);
        startActivity( Maan);
    }

    public void about_the_bank_ib(View view) {
        Intent intent= new Intent(getBaseContext(),ib.class);
        intent.putExtra("text","General information\n" +"Company NameInvestment Bank (INVB)\n" +
                "Company PurposeThe investment bank isq70Z a public bank, listed on the Amman Stock Exchange since October 2003. It operates within the banking sector. It has branches operating in Jordan and Palestine. The Investment Bank is based in Amman, Jordan and was established in August 1982.\n" +
                "Company Establishment Date: November 28, 1982\n" +
                "Beginning of the first quarter of the fiscal year\n" +
                "auditor\n" +
                "PricewaterhouseCooper - Jordan"
                );




        startActivity(intent);}

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.investbank.jo"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
}}