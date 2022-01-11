package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.daimajia.androidanimations.library.Techniques;
import com.daimajia.androidanimations.library.YoYo;
import com.example.eyeofthebanks.Central_Bank_of_Jordan.Central_Bank_of_Jordan;


public class activityc extends AppCompatActivity {

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityc);
        button=findViewById(R.id.b);
      /*  YoYo.with(Techniques.RollIn)
                .duration(500)
                .repeat(20)
                .delay(1500)
                .playOn(findViewById(R.id.activityc));*/
         }



    public void thefirstmap(View view) {
        Intent x=new Intent(this, Central_Bank_of_Jordan.class);
        startActivity(x);
    }


    public void Central_Bank_of_Jordan(View view) {
        Intent intent= new Intent(getBaseContext(),activityd.class);
        intent.putExtra("text","General information\n" +
               "\n"+
                "The Central Bank of Jordan " +
                "\n"+
                "(Arabic: البنك المركزي الاردني) " +
                ":is the central bank of Jordan whose main duties include the release and distribution of " +
                "the Jordanian currency and the maintenance of a national reserve of gold and foreign currencies." +
                " The bank also maintains and insures the safety of the banking environment in Jordan."+
                "\n"+

                 "\n"+
                "Foundation\n" +
                 "Jordan set out preparations to establish the Central Bank of Jordan (CBJ)" +
                 " in the late 1950s. The Law of the CBJ was enacted in 1959. Thereafter, " +
                 "its operational procedures were commenced on the first day of October 1964. The CBJ succeeded the Jordan " +
                 "Currency Board which had been established in 1950. The capital of the CBJ, which is totally owned by the " +
                 "government, was increased gradually, from one million to 18 million Jordanian Dinars. The CBJ enjoys the status" +
                " of an independent and autonomous corporate body, although its capital is owned entirely by the government."
               + "\n"+"Objectives and functions\n" +
                "The law establishing the CBJ stipulates that \"the objectives of the Central Bank shall be to maintain monetary stability in the Kingdom, to ensure the convertibility of the Jordanian Dinar, and to promote the sustained growth of the Kingdom's economy in accordance with the general economic policy of the government.\"\n" +
                "\n" +
                "To achieve these objectives, the CBJ's functions include:\n" +
                "\n" +
                "Issuing and regulating bank notes and coins\n" +
                "The CBJ is the sole issuer of the Jordanian currency. The CBJ ensures the availability of bank notes and coins to meet the needs of the national economy, and maintains an adequate inventory of these bank notes and coins. The CBJ also re-issues the Jordanian currency and replaces damaged, soiled, and mutilated bank notes. In addition, the CBJ issues commemorative coins.\n" +
                "\n" +
                "Maintaining and managing the Kingdom's reserves of gold and foreign exchange\n" +
                "The CBJ is responsible for determining the suitable investment opportunities as well as setting ratios and components of reserves to ensure their safety, liquidity, and profitability, as these reserves constitute a cornerstone in the stability of the Jordanian Dinar exchange rate. To fulfil this task, the CBJ adopts a flexible investment policy that is compatible with the ongoing developments in foreign exchange and international financial markets.\n" +
                "\n" +
                "Acting as a banker and fiscal agent to the government and public institutions\n" +
                "The CBJ acts as a banker and fiscal agent to the government and public institutions, as it maintains their revenue and expenditure accounts, makes transfers, opens letters of credit, manages and implements loan and trade agreements, and extends credit to the treasury. In addition, the CBJ issues and manages public debt securities on behalf of the government and public institutions in Jordan. Likewise, the CBJ administers, on behalf of the government, Jordan’s subscriptions in international and regional financial institutions, and manages and implements payment agreements between the government and other countries.\n" +
                "\n" +
                "Acting as a banker to banks and specialized credit institutions\n" +
                "The CBJ maintains banks’ deposits, extends credit to them through advances and rediscounts, and furnishes banks with credit risk information, custody, and electronic clearing services. Besides, the CBJ, sells to and buys from banks, both treasury bills and foreign exchange necessary to cover their external payment needs. Furthermore, the CBJ issues licenses authorizing banks to operate and branch in Jordan.\n" +
                "\n" +
                "Maintaining the safety of the banking system\n" +
                "The CBJ supervises the banking system to ensure its soundness, and protects depositors and shareholders. In doing so, the CBJ focuses on increasing the paid up capital, improving the capital adequacy ratio, and expanding the scope of the application of international auditing and accounting standards related to solvency, assets, profitability, liquidity and management. Moreover, the CBJ stresses the importance of continuous education and training of banks’ employees so that they keep up to date with developments in the financial market. Furthermore, the CBJ performs on-site and off-site surveillance of licensed banks.\n" +
                "\n" +
                "Advising the government on the formulation and implementation of fiscal and economic policies\n" +
                "The CBJ proposes, upon its initiative or upon government request, specific suggestions and recommendations related to the prevailing economic, financial and monetary conditions. Besides, it participates in the formulation of economic policies, particularly, in relation to economic development plans. Furthermore, the CBJ has a distinctive role in the regular consultations between Jordanian authorities and international financial organizations, in particular, those related to economic and structural adjustment programs adopted since 1989.\n" +
                "\n" +
                "Managing monetary problems and participating in containing local economic problems\n" +
                "The CBJ, pursuant to its legal powers, adopts procedures and measures to deal with economic problems to avoid their adverse effects on the Jordanian economy.\n" +
                "\n" +
                "Regulating credit\n" +
                "The CBJ regulates the quantity, quality, and cost of credit to meet the requirements of economic development and monetary stability. Monetary policy tools available to the CBJ to regulate credit include open market operations, the reserve requirement ratio and the discount rate.\n" +
                "\n" +
                "Other roles\n" +
                "In addition to the above-mentioned functions, the CBJ has effectively participated in the establishment of a number of financial institutions and corporations, such as Amman Stock Exchange, Jordan Mortgage Refinance Company, Jordan Loan Guarantee Corporation[1], Deposit Insurance Corporation, all of which have played an evident role in supporting economic development efforts in Jordan."




        );
        startActivity(intent);


    }

    public void back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);

    }

    public void WEBSITE(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cbj.gov.jo/"));
            startActivity(intent);
        }


}