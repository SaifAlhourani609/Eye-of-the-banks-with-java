package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activityABC extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_b_c);
        i = new Intent(getApplicationContext(), sorry.class);
        i.putExtra("image", "ABC");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, AMMAN_LIST_ABC.class);
        startActivity(amman);
    }

    public void Al_Mafraq(View view) {
        startActivity(i);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa = new Intent(this, Az_Zarqa_LIST_ABC.class);
        startActivity(Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid = new Intent(this, Irbid_LIST_ABC.class);
        startActivity(Irbid);
    }

    public void Al_Karak(View view) {
        startActivity(i);
    }

    public void Ajlun(View view) {
        startActivity(i);
    }

    public void Jarash(View view) {
        Intent Jarash = new Intent(this, Jarash_LIST_ABC.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa = new Intent(this, Al_Balqa_LIST_ABC.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba = new Intent(this, Madaba_LIST_ABC.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        startActivity(i);
    }

    public void Al_Aqaba(View view) {
        Intent Al_Aqaba = new Intent(this, Al_Aqaba_LIST_ABC.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        startActivity(i);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), abc.class);
        intent.putExtra("text", "General information\n" +
                "Bank ABC in Jordan (Arab Banking Corporation - Jordan) was incorporated in 1990 as a Jordanian public shareholding company. It is a member of the Bank ABC Group, MENA’s leading international bank, with Head Offices in the Kingdom of Bahrain and network spreads across five continents, covering countries in the Middle East, North Africa, Europe, the Americas and Asia.\n" +
                "\n" +
                "Bank ABC in Jordan performs all banking operations at its Head Office in Amman and branches and automatic teller machines (ATMs) located across the Kingdom.\n" +
                "\n" +
                "The Bank offers a comprehensive range of services that include banking, commercial, treasury, finance, and loans, as well as corresponding bank services and international banking operations. It also offers investment services and brokerage in securities (locally, regionally, and internationally) on behalf of its clients as well as financial consultancy through its affiliate company ABC Investments. The Bank focuses on technological innovation to offer its clients the latest digital banking services. "
        );
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bank-abc.com/world/Jordan/ar/Pages/default.aspx"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent intent = new Intent(getApplicationContext(), activityb.class);
        startActivity(intent);
    }
}