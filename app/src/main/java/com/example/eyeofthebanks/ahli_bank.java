package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class ahli_bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahli_bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "AHLI");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_ahli.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        Intent intent = new Intent(getBaseContext(), mafraq_ahli.class);
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(getBaseContext(), az_zarqa_ahli.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(getBaseContext(), irbid_ahli.class);
        startActivity(intent);
    }

    public void Al_Karak(View view) {
        Intent intent = new Intent(getBaseContext(), al_karak_ahli.class);
        startActivity(intent);
    }

    public void Ajlun(View view) {
        startActivity(intent);
    }

    public void Jarash(View view) {
        Intent intent = new Intent(getBaseContext(), jarash_ahli.class);
        startActivity(intent);
    }

    public void Madaba(View view) {
        Intent intent = new Intent(getBaseContext(), madaba_ahli.class);
        startActivity(intent);
    }

    public void Al_Tafilah(View view) {
        Intent intent = new Intent(getBaseContext(), al_tafilh_ahli.class);
        startActivity(intent);
    }

    public void Al_Aqaba(View view) {
        Intent intent = new Intent(getBaseContext(), al_aqaba_ahli.class);
        startActivity(intent);
    }

    public void Maan(View view) {
        Intent intent = new Intent(getBaseContext(), maan_ahli.class);
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        Intent intent = new Intent(getBaseContext(), al_balqa_ahli.class);
        startActivity(intent);
    }


    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "Jordan Ahli Bank is a Jordanian bank established in Amman in 1955, and the National Bank is the first Jordanian bank established. The initial capital at incorporation was: 350,000 dinars. Today, the bank has a regional presence in Lebanon, Palestine, Cyprus, and a 19% stake in JIB (London).\n" +
                "\n" +
                "The Jordan National Bank has played a leading role in the field of serving individuals and the national economy as a whole. It is not just a financial institution that aims for profit, but rather an institution that aims to raise the savings awareness of the Jordanian citizen. The Jordan National Bank is considered one of the first financial institutions in Jordan. Fifty years ago, the Jordan National Bank is still serving individuals and companies, and it promotes the national economy with a group of other banks, as the savings culture is still weak.\n" +
                "\n" +
                "Objectives\n" +
                "For shareholders: the highest growing returns.\n" +
                "For employees and management: a stable and productive career, and rewarding rewards.\n" +
                "For customers: wide range of new banking products, excellent service and reasonable prices.\n" +
                "For the community: an effective contribution to economic, social and cultural development.\n" +
                "For regulators: merit, honesty, conformity to Basel 2\n\n" +
                "\n" +
                "Vision\n" +
                "Phase One: One of the largest and most profitable financial groups in Jordan. 'More than just a bank'\n" +
                "The second stage: a recognized leading financial institution in the Middle East. \"More than just a Jordanian institution\"\n" +
                "The third stage: a major banking player at the global level. 'More than just a Middle Eastern institution'.\n" +
                "\n" +
                "The bank is distinguished by owning many specialized banking sectors that serve different segments and categories through innovative, efficient and value-added services, solutions and products, whether banking or non-banking (responsible and with a development dimension), which meet various needs, and is characterized by the method of providing service and speed in providing it to ensure satisfaction his clients.\n" +
                "\n" +
                "Just as the Bank is keen to achieve the satisfaction of its customers, it is also keen to achieve the satisfaction of its human energies, attaching great importance to it by focusing on the female staff because of its belief in the necessity of empowering women. In this context, the Bank has developed several programs to build and enhance the capabilities of its employees, as well as programs to build the capacities of national cadres of various groups, including those with special needs.\n" +
                "\n" +
                "Over the years, the Bank has adopted all new concepts and management behaviors that lead to making positive differences in various aspects of work, integrating environmental considerations at the core of its business, and developing its operational processes in line with the sustainable environmental development goals.\n" +
                "\n" +
                "The bank continues its expansion beyond sixty, raising the slogan “Sixty years and you are my family” in order to strengthen its extended presence in Palestine and Cyprus in addition to Jordan, and to build on its branch network, which today includes 63 branches, and 111 ATMs in Jordan and Palestine.\n");
        intent.putExtra("image", "AHLI");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://ahli.com/ar/"));
        startActivity(intent);
    }
}