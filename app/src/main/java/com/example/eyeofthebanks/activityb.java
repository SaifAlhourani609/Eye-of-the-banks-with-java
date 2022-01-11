package com.example.eyeofthebanks;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ListView;
import android.widget.SearchView;

import androidx.appcompat.app.AppCompatActivity;

public class activityb extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityb);

    }

    // لمياء
    public void CentralBankofJordan1(View view) {
        Intent i = new Intent(this,activityc.class);
        startActivity(i);
    }

    public void arabbank1(View view) {
        Intent intent = new Intent(this,activitycc.class);
        startActivity(intent);
    }

    public void ABCJ(View view) {
        Intent A = new Intent(this,activityABC.class);
        startActivity(A);
    }

    public void Bank_of_Jordan(View view) {
        Intent BOJ = new Intent(this,bank_of_jordan.class);
        startActivity(BOJ);
    }

    public void Cairo_Amman_Bank(View view) {
        Intent CAB = new Intent(this,activityCAB.class);
        startActivity(CAB);
    }

    public void Arab_Jordan_Investment_Bank_AJIB(View view) {
        Intent AJIB = new Intent(this,activityAJIB.class);
        startActivity(AJIB);
    }

    public void Invest_Bank(View view) {
        Intent IB = new Intent(this,activityIB.class);
        startActivity(IB);
    }

    public void Capital_Bank(View view) {
        Intent CB = new Intent(this,capital.class);
        startActivity(CB);
    }

    public void Jordan_Commercial_Bank(View view) {
        Intent JBC = new Intent(this,Jordan_Commercial_Bank.class);
        startActivity(JBC);
    }


    public void Jordan_Kuwait_Bank(View view) {
        Intent JKB = new Intent(this,activityJKB.class);
        startActivity(JKB);
    }

    public void Housing_Bank(View view) {
        Intent HB = new Intent(this,Housing_Bank.class);
        startActivity(HB);
    }

    public void Societe_Generale_De_Banque_Jordan(View view) {
        Intent SGDBJ = new Intent(this,activitySGDBJ.class);
        startActivity(SGDBJ);
    }

    public void Bank_al_Etihad(View view) {
        Intent BaE = new Intent(this,activityBaE.class);
        startActivity(BaE);
    }
    // لمياء
    public void Standard_Chartered(View view) {
        Intent SC = new Intent(this, Standard_Chartered.class);
        startActivity(SC);
    }

    public void Citi_Bank(View view) {
        Intent CB = new Intent(this, Citi_Bank.class);
        startActivity(CB);
    }

    public void National_Bank_of_Kuwait(View view) {
        Intent NBOK = new Intent(this, National_Bank_of_Kuwait.class);
        startActivity(NBOK);
    }

    public void Audi_Bank(View view) {
        Intent AB = new Intent(this, audi_bank.class);
        startActivity(AB);
    }

    public void Islamic_International_Arab_Bank(View view) {
        Intent IIAB = new Intent(this, Islamic_International_Arab_Bank.class);
        startActivity(IIAB);
    }

    public void Safwa_Islamic_Bank(View view) {
        Intent SIB = new Intent(this, Safwa_Islamic_Bank.class);
        startActivity(SIB);
    }

    public void Egyptian_Arab_Land_Bank(View view) {
        Intent EALB = new Intent(this, Egyptian_Arab_Land_Bank.class);
        startActivity(EALB);
    }

    public void Rafidain_Bank(View view) {
        Intent RF = new Intent(this, Rafidain_Bank.class);
        startActivity(RF);
    }

    public void BLOM_Bank(View view) {
        Intent BLOMB = new Intent(this, blom_Bank.class);
        startActivity(BLOMB);
    }

    public void National_Bank_of_Abu_Dhabi(View view) {
        Intent NBOAD = new Intent(this, National_Bank_of_Abu_Dhabi.class);
        startActivity(NBOAD);
    }

    public void Jordan_Islamic_Bank(View view) {
        Intent JIB = new Intent(this, jordan_islamic_bank.class);
        startActivity(JIB);
    }

    public void Al_Rajhi_Bank(View view) {
        Intent ARB = new Intent(this, Al_Rajhi_Bank.class);
        startActivity(ARB);
    }

    public void Ahli_Bank(View view) {
        Intent capital = new Intent(this, ahli_bank.class);
        startActivity(capital);
    }

    public void Bank_Of_Jordan(View view) {
        Intent capital = new Intent(this, bank_of_jordan.class);
        startActivity(capital);
    }


}