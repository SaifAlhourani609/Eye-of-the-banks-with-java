package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Al_Rajhi_Bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al__rajhi__bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "RB");
    }

    public void AMMAN(View view) {
        Intent amman = new Intent(this, amman_rb.class);
        startActivity(amman);
    }

    public void Al_Mafraq(View view) {
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent amman = new Intent(this, az_zarqa_rb.class);
        startActivity(amman);
    }

    public void Irbid(View view) {
        Intent amman = new Intent(this, irbid_rb.class);
        startActivity(amman);
    }

    public void Al_Karak(View view){
        startActivity(intent);
    }

    public void Ajlun(View view){
        startActivity(intent);
    }

    public void Jarash(View view) {
        startActivity(intent);
    }

    public void Madaba(View view) {
        startActivity(intent);
    }

    public void Al_Tafilah(View view){
        startActivity(intent);
    }

    public void Al_Balqa(View view){
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
                "It is a Saudi bank established in 1957. Al Rajhi Bank is one of the major banking joint stock companies, with a capital of 25,000,000,000 Saudi riyals. The bank is governed in its banking and investment dealings by the provisions and controls of Islamic Sharia. It was founded by the brothers Saleh, Abdullah, Suleiman and Muhammad bin Abdulaziz Al-Rajhi.\n" +
                "The bank has the largest branch network in the Kingdom, with 500 branches.\n" +
                "\n" +
                "Al-Rajhi Bank, one of the largest Islamic banks in the world, started its activities in 1957. Al Rajhi Bank has more than 50 years of experience in banking and commercial activities. And the first branch of a bank for men was opened in the Al-Dirah district of Riyadh in 1957, while the first branch for women was opened in 1979 in the Shmeisi district. The year 1978 witnessed the merging of the various institutions bearing the Al Rajhi name under one umbrella in the Al Rajhi Banking and Trade Company, and in 1988 the bank was transformed into a Saudi public joint stock company. Since the bank is based mainly on the principles of Islamic banking.\n" +
                "\n" +
                "Malaysia\n" +
                "After the huge growth locally, Al Rajhi Bank expanded outside the Saudi market and entered the Malaysian market in 2006, after being granted a full banking license to operate as the first foreign bank in Malaysia by Bank Negara Malaysia. Malaysia is the first step in the bank's orientation towards entering the banking market in Southeast Asia, where basic banking products have been introduced to the Asian market and provide a whole new experience of Islamic banking. Al Rajhi Bank currently has 19 branches in Malaysia with plans to increase the number of these branches in the future.\n" +
                "\n" +
                "Kuwait\n" +
                "Al Rajhi Bank obtained approval to open its first branch in Kuwait on August 1, 2010, to be the first Saudi bank in Kuwait.\n" +
                "\n" +
                "Jordan\n" +
                "Al-Rajhi Bank has completed all official approvals to practice banking activity in the Hashemite Kingdom of Jordan, and started its business in the first quarter of 2011. It now owns eight branches, 5 of which are in the Jordanian capital Amman, 2 in Irbid and one in Zarqa: 1- The main branch and administration in Abdul Hamid Sharaf Street Shmeisani area. 2- Abdullah Ghosheh Street Branch. 3- Al-Quds Street branch (opposite the radio and TV) 4- Zarqa city branch 5- Irbid city branch opposite the Central Bank 6- Jubaiha branch - Amman 7- Mecca Mall branch - Amman. 8- Irbid City Center Branch.\n");
        intent.putExtra("image", "RB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.alrajhibank.com.jo/ar"));
        startActivity(intent);
    }
}