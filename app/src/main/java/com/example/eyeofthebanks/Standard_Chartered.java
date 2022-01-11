package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Standard_Chartered extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standard_chartered);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "SC");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_sc.class);
        startActivity(amman);
    }

    public void Al_Mafraq(View view) {
        startActivity(intent);
    }

    public void Al_Zarqa(View view) {
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
                "Standard Chartered in Jordan, It is a British multinational banking and financial services company, established in 1969,It is headquartered in London,It has several branches in Asia, the Middle East, and Africa. Among these branches is a bank located in Jordan, and the bank is served in about 60 international markets.\n" +
                "\n" +
                "The bank in Jordan is considered one of the well-known banks that provides its services to a large number of clients, in proportion to their needs, especially for investors and foreigners living in Jordan, where the bank provides its services to individuals and multinational companies.\n" +
                "\n" +
                "The bank provides its services through a number of branches in Jordan, but these branches are not scattered in many areas."
        );
        intent.putExtra("image", "SC");
        startActivity(intent);

    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sc.com/jo/"));
        startActivity(intent);
    }
}