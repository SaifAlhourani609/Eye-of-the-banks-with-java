package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class bank_of_jordan extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bank_of_jordan);
        i = new Intent(getApplicationContext(), sorry.class);
        i.putExtra("image", "BOJ");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_boj.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        Intent intent = new Intent(getBaseContext(), mafraq_boj.class);
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(getBaseContext(), az_zarqa_boj.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(getBaseContext(), irbid_boj.class);
        startActivity(intent);
    }

    public void Al_Karak(View view) {
        Intent intent = new Intent(getBaseContext(), al_karak_boj.class);
        startActivity(intent);
    }

    public void Ajlun(View view) {
        Intent intent = new Intent(getBaseContext(), al_ajlun_boj.class);
        startActivity(intent);
    }

    public void Jarash(View view) {
        startActivity(i);
    }

    public void Madaba(View view) {
        startActivity(i);
    }

    public void Al_Tafilah(View view) {
        startActivity(i);
    }

    public void Al_Aqaba(View view) {
        Intent intent = new Intent(getBaseContext(), al_aqaba_boj.class);
        startActivity(intent);
    }

    public void Maan(View view) {
        Intent intent = new Intent(getBaseContext(), maan_boj.class);
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        Intent intent = new Intent(getBaseContext(), al_balqa_boj.class);
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "Bank of Jordan is a Jordanian bank established in Amman in 1960. The bank offers credit cards, internet cards, and all kinds of loans and facilities. There are about 60 bank branches in Jordan, 8 branches in Palestine and more than 60 Automated Teller Machines (ATM). The bank has shares in the Amman Stock Exchange.\n" +
                "\n" +
                "Today, the Bank of Jordan has become one of the 3 largest local commercial banks with a capital of 500 million dinars, assets of 1456 million dinars, and shareholders’ rights amounting to 161 million dinars as on December 31, 2007. It also owns various distribution outlets that include a network of branches and offices consisting of 82 branches and offices. And a network of ATMs amounting to 90 machines in Jordan and Palestine, in addition to electronic distribution channels that include the speaking bank, the Internet bank, the cellular bank and the SMS service.\n" +
                "As for the Bank of Jordan group, today it includes the Bank of Jordan - Jordan in addition to its branches operating in Palestine, the Bahrain wholesale branch, the Bank of Jordan - Syria, the Excellence Company for Financial Investments and the Jordan Leasing Company.\n" +
                "\n" +
                "Closure of Palestinian prisoners' accounts\n" +
                "In February 2020, the commander of the Israeli occupation army in the West Bank issued his amended military decision considering the monthly salaries that the Palestinian government pays to prisoners a “prohibited work,” and banks should not keep accounts for prisoners, otherwise they and their employees are considered accomplices in the “crime.”\n" +
                "\n" +
                "On May 6, 2020, the Palestinian Prisoners and Ex-Prisoners Affairs Authority said that expatriate banks operating in the Palestinian territories had begun closing bank accounts for families of Palestinian martyrs and prisoners in response to Israeli pressure. Palestinian Prime Minister Muhammad Shtayyeh said that a committee was formed to study the crisis and that it was agreed with the banks to freeze their procedures. On May 10, 2020, gunmen fired in the air in front of a branch of the Bank of Jordan in the northern West Bank city of Qabatiya in protest against the bank's measures forcing prisoners to close their bank accounts.\n" +
                "On September 7, 2020, the head of the commission, Qadri Abu Bakr, indicated that some banks refuse to open new accounts for prisoners, while the Israeli occupation has frozen work in its decision.\n" +
                "\n" +
                "The bank’s solid and strong record and the qualitative achievements it achieves are the result of sound management thought, an integrated strategic approach, and an insightful vision that simulates the future in all its dimensions and keeps pace with the rapid changes in the banking industry. To improve its competitive position and banking leadership, to provide the best services and financial solutions to the public of clients and customers, and to direct the Bank’s resources and capabilities to ensure the continuation of achieving higher levels of progress year after year. In addition, the bank has implemented and led a number of bank syndication loans and signed a number of agreements with local and international bodies to make its products and services more suitable to the needs and requirements of existing customers and more attractive to attract more customers and new customers.\n\n" +
                "\n" +
                "Bank of Jordan looks towards the future and seeks, through its strategic approach, to improve its relations and partnerships with various parties in various sectors, while continuing to provide high quality services. The Bank is well aware that the best way to achieve this is through enhancing its human resources and qualifying them with the latest technological methods and means to improve the capabilities of the work team. The Bank of Jordan is also keen to enhance its role in serving the local community and support all efforts aimed at this by participating in several support and sponsorship projects that benefit economic, charitable, scientific and social activities.\n"
        );
        intent.putExtra("image", "BOJ");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://bankofjordan.com/"));
        startActivity(intent);
    }
}