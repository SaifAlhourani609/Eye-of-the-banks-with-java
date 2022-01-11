package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activityBaE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ba_e);
    }

 public void AMMAN(View view) {
    Intent amman= new Intent(this,AMMAN_LIST_BAE.class);
    startActivity( amman);
}

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST_BAE.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST_BAE.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST_BAE.class);
        startActivity(Irbid);
    }


    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST_BAE.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST_BAE.class);
        startActivity(Ajlun);
    }


    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST_BAE.class);
        startActivity(Jarash);
    }


    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST_BAE.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST_BAE.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        Intent Al_Tafilah= new Intent(this,Al_Tafilah_LIST_BAE.class);
        startActivity(Al_Tafilah);
    }

    public void Al_Aqaba(View view) { Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST_BAE.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        Intent Maan= new Intent(this,Maan_LIST_BAE.class);
        startActivity(Maan);
    }

    public void about_the_bank_BAE(View view) {
        Intent intent= new Intent(getBaseContext(),BAE.class);
        intent.putExtra("text","General information\n" +"who are we\n" +
                        "We are Union Bank, a financial institution that is proud to be Jordanian. Our family values are our strength and inspiration, each of our customers is part of our family and we work hard together to help them.\n" +
                        "\n" +
                        "Enabling our clients to realize their dreams and aspirations is the most important thing to us! We work with individuals, entrepreneurs, companies and influential women to draw inspiration from them and provide banking and financial services based on understanding their needs. Our goal will always be to help our clients shape their future."
                  +"\n"+
                "Our social responsibility\n" +
                        "Our customers and our community are our family, and we always look to help those around us thrive. We support the next generation of leaders and entrepreneurs, we encourage the arts and culture that gives Jordan its own, and we invest in skills and education to help those around us become what they aspire to be.\n" +
                        "Working with young people\n" +
                        "Our goal is to empower young people and help them make the best decisions for their future. We believe that everyone has the right to show their best self without being limited by their surrounding circumstances or family income.\n" +
                        "\n" +
                        "Encouraging entrepreneurs in Jordan\n" +
                        "We support the next generation of talent who can shape the reality around us, and help them give their best. That is why we care about supporting businesses and projects, from start-ups to successful entrepreneurs.\n" +
                        "\n" +
                        "Supporting arts and culture\n" +
                        "Innovative ideas and their creative expression is the basis of our progress. Because we understand the importance of art and culture in Jordan and the preservation of traditional crafts, we do everything we can to support new talent and local projects."
                   );
        startActivity(intent);}

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bankaletihad.com/en"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
    }}