package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Safwa_Islamic_Bank extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_safwa__islamic__bank);
        intent = new Intent(getBaseContext(), sorry.class);
        intent.putExtra("image", "SIB");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_sib.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(getBaseContext(), az_zarqa_sib.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(getBaseContext(), irbid_sib.class);
        startActivity(intent);
    }

    public void Al_Karak(View view) {
        startActivity(intent);
    }

    public void Ajlun(View view) {
        startActivity(intent);
    }

    public void Jarash(View view) {
        Intent intent = new Intent(getBaseContext(), jarash_sib.class);
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        Intent intent = new Intent(getBaseContext(), al_balqa_sib.class);
        startActivity(intent);
    }

    public void Madaba(View view)  {
        startActivity(intent);
    }

    public void Al_Tafilah(View view)  {
        startActivity(intent);
    }

    public void Al_Aqaba(View view) {
        Intent intent = new Intent(getBaseContext(), al_aqaba_sib.class);
        startActivity(intent);
    }

    public void Maan(View view)  {
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "Safwa Islamic Bank, established in 1975, is the largest Islamic bank in the United Arab Emirates, a public joint stock company, and is listed on the Dubai Financial Market. The bank leads the development of the global Islamic finance sector, and is the first full-service Islamic bank and the third largest Islamic bank in the world.\n" +
                "\n" +
                "The bank currently operates a network of 90 branches in the United Arab Emirates, has a presence in seven markets around the world, and is expanding its presence in order to promote the growth and development of the sector. The Bank serves nearly 1.7 million customers, and provides its growing customer base with a growing range of Sharia-compliant products and services. As well as being the first and largest Islamic bank in the UAE, DIB has a strong global presence as a major player in promoting Shariah-compliant financial services across various markets around the world. He founded Dubai Islamic Bank Pakistan Limited, a wholly owned subsidiary of Dubai Islamic Bank and the first Islamic bank in Pakistan to offer Platinum Banking and Priority Banking Services, in addition to an extensive and diversified portfolio of alternative distribution channels. The launch of Banin Dubai Sharia Bank in Indonesia in early 2017, the bank's first entry into the Far East, and the bank owns about 40% of the shares of the Indonesian bank. In May 2017, the Central Bank of Kenya granted Dubai Islamic Bank a license to establish a branch in Kenya, under the name Dubai Islamic Bank Kenya Limited.\n" +
                "\n" +
                "The Bank's main objective is to make Islamic finance an established standard, rather than an alternative to conventional finance for businesses and customers around the world. He has received many prestigious awards, which are solid evidence of his contributions in various fields, including retail, corporate and investment banking services, as well as his advisory services and contributions in the field of social responsibility. Evidence of its leading position in the Islamic finance sector, Dubai Islamic Bank has won the title of Best Islamic Bank on many prestigious occasions. In 2017, the bank won the first edition of the Global Islamic Business Award in the region, which was presented during the 23rd edition of the Business Excellence Awards.\n"
        );
        intent.putExtra("image", "SIB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.safwabank.com/ar/"));
        startActivity(intent);
    }
}