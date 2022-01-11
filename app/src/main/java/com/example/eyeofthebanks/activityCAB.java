package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activityCAB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_a_b);
    }
    public void AMMAN(View view) {
        Intent amman= new Intent(this,AMMAN_LIST_cab.class);
        startActivity( amman);
    }

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST_cab.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST_cab.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST_cab.class);
        startActivity(Irbid);
    }

    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST_cab.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST_cab.class);
        startActivity( Ajlun);
    }

    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST_cab.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST_cab.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST_cab.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        Intent Al_Tafilah= new Intent(this,Al_Tafilah_LIST_cab.class);
        startActivity(Al_Tafilah);
    }

    public void Al_Aqaba(View view) { Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST_cab.class);
        startActivity(Al_Aqaba);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cab.jo/ar"));
        startActivity(intent);
    }

    public void Maan(View view) {
        Intent Maan= new Intent(this,Maan_LIST_cab.class);
        startActivity(Maan);
    }

    public void about_the_bank_CAB(View view) {
        Intent intent= new Intent(getBaseContext(),CAB.class);
        intent.putExtra("text","General information\n" +"Since its establishment as a Jordanian public shareholding company on the eleventh of June 1960, Cairo Amman Bank has been keen to employ its strong capital base and long-standing experience spanning more than 60 years, to play a pioneering and distinguished role in serving the national economy by providing a comprehensive and distinguished set of services and solutions Successful banking that meets all the diverse needs of its customers. Its pioneering services have also added a new dimension to many projects in society, by financing development projects in addition to providing the financing needs of small, medium and even micro projects that supply the Jordanian economy, in addition to meeting the immediate needs of its customers by providing personal loans through salary transfer and investment services. And credit cards and bank transfers through a distinct and integrated network of banking branches in Jordan, Palestine and Bahrain, Cairo Amman Bank offers its customers a variety of innovative banking services that suit all customer segments and meet all their banking, financial and investment needs. The bank also offers a range of electronic banking services through its website www.cab.jo, which provide customers with the ability to conduct banking transactions wherever they are. These distinguished services reflect the new corporate identity of the bank, which embodies the spirit of modernity and the values \u200B\u200Bof openness and communication to serve all its clients and achieve maximum benefits away from traditional borders. From this point of view, the bank worked hard to cover all regions of the Kingdom.\n" +
                "\n" +
                "Proceeding from the bank’s keenness to facilitate customer service, Cairo Amman Bank puts at the hands of its customers a wide-spread ATM network in various regions of Jordan and Palestine, and is proud of being the first bank in the world to use iris scan technology as a means for the customer to access his bank account and dispense with ATM cards and number Traffic (Password Number), so that the system identifies the customer and enables him to access his account, either through the service barrier at the branches or through the ATM and conduct his banking transactions, with the aim of facilitating the customers and providing them with adequate protection and safety because of his belief in the pioneering use of modern technology in The banking sector.\n" +
                "\n" +
                "With banking, investment and financial efficiency, and distinguished expertise, we are moving forward to supplement the national economy and provide pioneering banking services that raise the level of the individual in Jordan."
        );




        startActivity(intent);}


    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
    }
}