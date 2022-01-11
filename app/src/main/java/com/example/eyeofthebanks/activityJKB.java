package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class activityJKB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_j_k_b);
    }
    //------------------------------------------------------------------------------------ محافظات المملكة الأردنية الهاشمية
    public void AMMAN(View view) {
        Intent amman= new Intent(this,AMMAN_LIST_jkb.class);
        startActivity( amman);
    }

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST_jkb.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST_jkb.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST_jkb.class);
        startActivity(Irbid);
    }

    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST_jkb.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST_jkb.class);
        startActivity( Ajlun);
    }

    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST_jkb.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST_jkb.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST_jkb.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        Intent Al_Tafilah= new Intent(this,Al_Tafilah_LIST_jkb.class);
        startActivity(Al_Tafilah);
    }

    public void Al_Aqaba(View view) { Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST_jkb.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        Intent Maan= new Intent(this,Maan_LIST_jkb.class);
        startActivity(Maan);
    }
    public void about_the_bank_jkb(View view) {
        Intent intent= new Intent(getBaseContext(),jkb.class);
        intent.putExtra("text","General information\n" +
                "1976 - Founding of the Bank\n" +
                "\n" +
                "The Jordan Kuwait Bank was established on October 25, 1976 as a public shareholding company with an authorized capital of 5 million Jordanian dinars. It was the best witness to the interest of Arab investors in investing in Jordan and the success in establishing and developing joint economic projects.\n" +
                "\n" +
                "\n" +
                "1977 - Starting work\n" +
                "\n" +
                "Jordan Kuwait Bank commenced banking business at the end of August 1977 in its first branch in Jabal Amman.\n" +
                "\n" +
                "\n" +
                "1983 - Implementation of the automated system in the bank\n" +
                "\n" +
                "Starting the application of a number of automated programs for the work of deposits and records of shareholders.\n" +
                "\n" +
                "\n" +
                "1985 - Automated Bank\n" +
                "\n" +
                "The Bank introduced the Automated Teller Machine (ATM) in November 1985, where it was called the Auto Bank.\n" +
                "\n" +
                "\n" +
                "1991 - Connecting all bank branches\n" +
                "\n" +
                "In June 1991, all the branches of the Jordan Kuwait Bank were connected to the central computer, and all withdrawals and deposits between the bank's branches and the administration took place directly through the private communications network and through the central computer.\n" +
                "\n" +
                "\n" +
                "1995 - The opening of the first branch outside the Kingdom\n" +
                "\n" +
                "The first branch of the Jordan Kuwait Bank was opened outside the Kingdom of Jordan in the city of Nablus in Palestine on 1/10/1995.\n" +
                "\n" +
                "\n" +
                "1997 - a new stage in the bank's career\n" +
                "\n" +
                "On 15/7/1997, the bank entered a new phase in its developmental path and its future aspirations expanded. On that day, the general assembly of the bank's shareholders elected the sixth board of directors. What distinguishes the new board is the return of Kuwaiti and Gulf investors to their positions in it, as they covered their share of the capital increase shares and raised the percentage of their contribution in the bank’s capital to about 50% and thus became an active member in the new board of directors.\n" +
                "\n" +
                "The new board constituted a major turning point in the bank's history, as Kuwaiti and Gulf investors reaffirmed their confidence in the future of the Jordanian economy in general and the Jordan Kuwait Bank in particular. In addition, the confidence of local investors in the bank and its future has also been enhanced, and the Social Security Corporation has entered as a major shareholder in the capital by about 20%.\n" +
                "\n" +
                "\n" +
                "1997 - Election of the new board of directors\n" +
                "\n" +
                "The election of the new board of directors and the election of His Excellency Mr. Abdul Karim Kabariti as Chairman of the Board on 15/7/1997 gave a clear indication of the new board’s tendency to bring about a comprehensive change in the bank’s strategy, mission and image, because the State of Mr. Abdul Karim Kabariti is not only the former Prime Minister of Jordan , but also the owner of a dynamic personality who responds to the challenge and interacts strongly with the tasks entrusted to him and leaves his clear fingerprints on every issue he deals with. During a period not exceeding six months from assuming the presidency of the bank, he made many tangible achievements, for example, the value of the bank’s share in the financial market increased, the confidence of shareholders and customers in the bank was enhanced, and many of its large individual clients, industrial, commercial and service institutions joined its client base, and it received the follow-up and attention of institutions. Local and global finance. After that, the distinguished financial results and achievements and the recording of strong performance indicators followed, which moved the bank to an advanced position in the list of Jordanian banks within the first positions in many indicators of efficiency and operation.\n" +
                "\n" +
                "\n" +
                "2000 - The first bank in Jordan to launch the Internet Banking Service (Net Banker)\n" +
                "\n" +
                "Jordan Kuwait Bank was the first bank in Jordan to provide the Internet Banking service (Netbanker) to customers, so that they can inquire about their account balances, make transfers between them or a third party, pay bills, request checkbooks and account statements from wherever the customer is.\n" +
                "\n" +
                "\n" +
                "2001 - Automated Branch and International Banking Unit\n" +
                "\n" +
                "In 2001, the bank opened the Cyber \u200B\u200BBranch in the Sweifieh area. It also opened a branch in Cyprus under the name of the International Banking Unit (IBU) and a representative office in Algeria.\n" +
                "\n" +
                "\n" +
                "2002 - Expansion and modernization of the administration building\n" +
                "\n" +
                "The Bank completed a project to expand and modernize the General Administration Building by elevating the building, changing the external facade, and establishing a drive-thru ATM site.\n" +
                "\n" +
                "\n" +
                "2002 - United Financial Investments Company\n" +
                "\n" +
                "In 2002, the United Company for Financial Investments became a subsidiary of Jordan Kuwait Bank, where the bank owns a controlling stake (more than 50 percent) in the company. United Financial Investments Company is one of the best brokerage and financial services companies operating in the Amman Stock Exchange.\n" +
                "\n" +
                "\n" +
                "2003 - Our New Logo\n" +
                "\n" +
                "In mid-2003, the Bank adopted a new logo to reflect its bright image, which is characterized by strength, vitality and modernity. The new logo embodies the set of lofty values \u200B\u200Bthat the bank has adopted throughout its rich history of achievements over the past years, as well as foreseeing the broad prospects for the bank's growth and prosperity.\n" +
                "\n" +
                "\n" +
                "2006 - Regional Administration\n" +
                "\n" +
                "At the end of the last quarter of 2006, Jordan Kuwait Bank opened a branch and a regional administration in Ramallah, Palestine.\n" +
                "\n" +
                "\n" +
                "2008 - organizational change to the bank's ownership structure\n" +
                "\n" +
                "During the month of June of 2008, an organizational change occurred in the bank's ownership structure, whereby the Kuwait Projects Company (KIPCO) transferred the United Gulf Bank (Bahrain) stake in the capital of the Jordan Kuwait Bank to Burgan Bank (Kuwait) to be the regional banking arm of the group. This change is considered an important step on the road to strengthening and strengthening the relationship between Jordan Kuwait Bank and the group's banks, which will reflect positively on the bank's performance and the development of its operations.\n" +
                "\n" +
                "\n" +
                "2010 - Automated teller machines for blind people\n" +
                "\n" +
                "In an initiative that is the first of its kind at the level of the banking sector in the Kingdom, and in coordination with the Supreme Council for the Affairs of Persons with Disabilities, the bank has provided ATMs dedicated to the use of blind and visually impaired persons and with technology that depends on the senses of hearing and touch and in a way that enables this category of citizens to deal with their accounts freely And without help from others.");
        startActivity(intent);}


    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.jkb.com/ar/content/jkb-%D8%A3%D9%88%D9%86-%D9%84%D8%A7%D9%8A%D9%86-0"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
    }}