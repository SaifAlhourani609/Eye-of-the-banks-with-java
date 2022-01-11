package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activitySGDBJ extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_s_g_d_b_j);
    }
    public void AMMAN(View view) {
        Intent amman= new Intent(this,AMMAN_LIST_sgbj.class);
        startActivity( amman);
    }

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST_sgbj.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST_sgbj.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST_sgbj.class);
        startActivity(Irbid);
    }

    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST_sgbj.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST_sgbj.class);
        startActivity( Ajlun);
    }

    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST_sgbj.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST_sgbj.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST_sgbj.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        Intent Al_Tafilah= new Intent(this,Al_Tafilah_LIST_sgbj.class);
        startActivity(Al_Tafilah);
    }

    public void Al_Aqaba(View view) { Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST_sgbj.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        Intent Maan= new Intent(this,Maan_LIST_sgbj.class);
        startActivity(Maan);
    }

    public void about_the_bank_ib(View view) {
        Intent intent= new Intent(getBaseContext(),sgbj.class);
        intent.putExtra("text","General information\n" +"" +
                        "Our main occupations\n" +

                        "In line with the global banking model, the activity of Societe Generale Bank - Jordan is divided into three main axes: retail banking, private funds management and corporate banking services. Our banking services include a wide range of diverse and traditional services specially designed to suit the widest range of our clients' needs and requests."
                       +"US forces distinguish requirements to meet the needs of a driver from the requirements to meet the needs of our driver from the needs of society.\n" +
                        "Societe Generale Bank - Jordan's products range from personal and professional loans, such as car loans, home loans, etc. Agent grew out of investing in a full range of growth solutions and a wide assortment to grow her own businesses.\n" +
                        "\n" +
                        "Professional and close services\n" +
                        "Societe Generale Bank - Jordan always seeks to strengthen its presence in the markets where it is present while filtering and always seeing new growth opportunities available. In order to achieve this goal, he is exploring strengths. It depends on the workspace you are working on, as well as on its proximity to its clients. This is achieved through its branch network and is reinforced across multiple platforms, ESGBJ, Government Services, Financial Services, as well as the direct scope of Commercial Services, etc."

                     +"Societe Generale Bank - Jordan has provided advisory and brokerage services to high net worth individuals and institutional investors. Our expertise and invaluable support from Societe Generale's global financial platform places us at the forefront of the capital markets.\n" +
                "Tailor-made consulting and mediation services\n" +
                "Societe Generale Bank-Jordan's professional advisors are ready to meet the needs of high net worth individuals and institutional investors, offering this segment of our clients tailored wealth management services.\n" +
                "\n" +
                "The Private Banking teams are dedicated to providing the best for client portfolios and ensuring that the best advice and most effective solutions are provided in a wide range of markets i.e. structured products, financial derivatives, forex trading, fixed income securities, etc...\n" +
                "\n" +
                "Treasury and Investment Department\n" +
                "\n" +
                "The investment decisions you decide today will affect your life in the future, negatively or positively. In order to be able to determine the best means and methods necessary to achieve your financial and investment goals in a positive way, you should seek help from investment experts.\n" +
                "\n" +
                "Choosing Societe Generale Bank - Jordan will help you achieve your desired goals, as the bank seeks, through the Treasury and Investment Department, to provide investment solutions that help you in this through the following tools:\n" +
                "\n" +
                "\n" +
                "Investing in capital instruments\n" +
                "Investing in long, medium and short term instruments\n" +
                "- foreign exchange trading\n" +
                "Investing through deposits with the bank\n" +
                "- currency swaps\n" +
                " \n" +
                "\n" +
                "The Treasury and Investment Department helps you get the best returns on your investments, by communicating the economic market information in a timely manner to our interested clients, whether they are individuals or companies, so that we give them the opportunity to make their investment decisions in an effective and correct manner."   );
        startActivity(intent);}

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.sgbj.com.jo/sgbj/en/Home"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
    }}