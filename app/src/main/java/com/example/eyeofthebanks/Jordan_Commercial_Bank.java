package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Jordan_Commercial_Bank extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jordan_commercial_bank);
        i = new Intent(getApplicationContext(), sorry.class);
        i.putExtra("image", "JCB");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_jcb.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        Intent intent = new Intent(getBaseContext(), mafraq_jcb.class);
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(getBaseContext(), az_zarqa_jcb.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(getBaseContext(), irbid_jcb.class);
        startActivity(intent);
    }

    public void Al_Karak(View view) {
        startActivity(i);
    }

    public void Ajlun(View view) {
        startActivity(i);
    }

    public void Jarash(View view) {
        startActivity(i);
    }

    public void Madaba(View view) {
       Intent intent = new Intent(getApplicationContext(), madaba_jcb.class);
        startActivity(intent);
    }

    public void Al_Tafilah(View view) {
        startActivity(i);
    }

    public void Al_Aqaba(View view) {
        Intent intent = new Intent(getBaseContext(), al_aqaba_jcb.class);
        startActivity(intent);
    }

    public void Maan(View view) {
        startActivity(i);
    }

    public void Al_Balqa(View view) {
        Intent intent = new Intent(getBaseContext(), al_balqa_jcb.class);
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "Jordan Commercial Bank was established in 1977 under the name Jordan Gulf Bank. During 2004, the bank was restructured administratively and financially and its name was changed to become the Jordan Commercial Bank in a new look and radical development. A large branch network has been established, which currently amounts to 35 branches in the Hashemite Kingdom of Jordan. The paid-up capital is 120 million dinars, and the equity is 149,540,601 dinars.\n" +
                "\n" +
                "The Bank provides comprehensive and integrated banking services in the fields of banking, with its commercial and investment aspects, for the corporate, retail and investor sectors, where advice and investment solutions are provided to them with high professionalism and competitive prices, with the support of these services with advanced technologies and effective distribution networks, in addition to the commitment of the Bank to make the best possible effort to achieve appropriate returns. to its partners from those who deal with it and to preserve the rights of its shareholders and employees.\n" +
                "\n" +
                "Since its inception in 2004, Jordan Commercial Bank has been keen to exercise its social role effectively, as it contributes to many social responsibility initiatives and provides financial and in-kind support to many activities in various fields. The Bank also sponsors many conferences, seminars and economic, cultural, social and sports events, in addition to cooperating with many educational and social institutions.\n" +
                "\n" +
                "Vision:\n" +
                "We look forward to developing the Jordan Commercial Bank to be a distinguished bank in its services, making it one of the most prominent banks in meeting the needs of customers for advanced banking products and services according to the latest, best and safest internationally recognized standards.\n" +
                "\n" +
                "the message:\n" +
                "Providing comprehensive and integrated banking services in the corporate, retail and investor sectors with high quality and competitive prices to meet the various financial needs of customers while supporting these services with appropriate banking solutions, advanced technologies and effective distribution networks, committed to achieving returns for our partners dealing with the bank as well as shareholders and employees.\n" +
                "\n" +
                "Value:\n" +
                "Our employees are our best resource.\n" +
                "Our top priority is to satisfy our customers and expand their base.\n" +
                "Maximum transparency is the basis of our credibility.\n" +
                "Ethics and honesty are our approach.\n" +
                "We are committed to continuous development.\n" +
                "Community service is our great duty.\n" +
                "\n" +
                "Institutional Governance:\n" +
                "Proceeding from the keenness of the Jordan Commercial Bank to maintain the integrity of its conditions, as well as out of respect for the integrity of the Jordanian banking system as a whole, which is one of its members, and in compliance with international standards for sound banking practices, the bank’s management realizes that this requires adherence to the best standards in institutional control that require that the bank be managed in an institutional manner and In compliance with the laws and legislation issued by the supervisory authorities, as well as the application of policies, instructions and procedures issued by the Board of Directors and the Executive Management, and in order to comply with the disclosures of the Central Bank of Jordan, you will find the following the most important items related to corporate governance:\n" +
                "The Corporate Governance Guide and the Guide to the Governance and Information Management and the accompanying Technology.\n" +
                "Invitation to the General Assembly Meeting 2018\n" +
                "Capital increase announcement\n" +
                "\n" +
                "Minutes of general assembly meetings\n" +
                "Minutes of the ordinary general assembly meeting on 4-30-2018\n" +
                "Minutes of the ordinary general assembly meeting on 4-30-2017\n" +
                "Minutes of the extraordinary general assembly meeting held on 4-10-2016\n" +
                "Minutes of the ordinary general assembly meeting held on 4-10-2016\n" +
                "\n" +
                "Announcing the Bank’s Capital Increase and the Distribution of Free Shares to Shareholders\n" +
                "Quarterly financial statements 31-3-2018\n" +
                "Names of the chairman and members of the Board of Directors’ committees and Board meetings as on 12/31/2017\n" +
                "An introduction to the members of the board of directors\n" +
                "Annual reports\n");
        intent.putExtra("image", "JCB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jcbank.com.jo/ar"));
        startActivity(intent);
    }
}