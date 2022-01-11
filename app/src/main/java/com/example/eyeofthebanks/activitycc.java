package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.eyeofthebanks.Arab_Bank.AMMAN4;
import com.example.eyeofthebanks.Arab_Bank.ATM_Amman;
import com.example.eyeofthebanks.Arab_Bank.Amman_ATM2;
import com.example.eyeofthebanks.Arab_Bank.Amman_ATM3;
import com.example.eyeofthebanks.Arab_Bank.Arab_Bank;
import com.example.eyeofthebanks.Arab_Bank.Arab_Bank_Amman;
import com.example.eyeofthebanks.Arab_Bank.Arab_Bank_Amman2;
import com.example.eyeofthebanks.Arab_Bank.Madaba;
import com.example.eyeofthebanks.Arab_Bank.Princess_Raya_Amman;
import com.example.eyeofthebanks.Arab_Bank.al_hashme;
import com.example.eyeofthebanks.Arab_Bank.meccamall;
import com.example.eyeofthebanks.Arab_Bank.the_all_arab_bank;


public class activitycc extends AppCompatActivity {

    Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitycc);
        i = new Intent(getApplicationContext(), sorry.class);
        i.putExtra("image", "ArabBank");
    }


   //------------------------------------------------------------------------------------ محافظات المملكة الأردنية الهاشمية

    public void AMMAN(View view) {
        Intent amman= new Intent(this,AMMAN_LIST.class);
        startActivity( amman);
    }

    public void Al_Mafraq(View view) {
        Intent Al_Mafraq= new Intent(this,Al_Mafraq_LIST.class);
        startActivity( Al_Mafraq);
    }

    public void Az_Zarqa(View view) {
        Intent Az_Zarqa= new Intent(this,Az_Zarqa_LIST.class);
        startActivity( Az_Zarqa);
    }

    public void Irbid(View view) {
        Intent Irbid= new Intent(this,Irbid_LIST.class);
        startActivity( Irbid);
    }

    public void Al_Karak(View view) {
        Intent Al_Karak= new Intent(this,Al_Karak_LIST.class);
        startActivity(Al_Karak);
    }

    public void Ajlun(View view) {
        Intent Ajlun= new Intent(this,Ajlun_LIST.class);
        startActivity(Ajlun);
    }

    public void Jarash(View view) {
        Intent Jarash= new Intent(this,Jarash_LIST.class);
        startActivity(Jarash);
    }

    public void Al_Balqa(View view) {
        Intent Al_Balqa= new Intent(this,Al_Balqa_LIST.class);
        startActivity(Al_Balqa);
    }

    public void Madaba(View view) {
        Intent Madaba= new Intent(this,Madaba_LIST.class);
        startActivity(Madaba);
    }

    public void Al_Tafilah(View view) {
        startActivity(i);
    }

    public void Al_Aqaba(View view) {
        Intent Al_Aqaba= new Intent(this,Al_Aqaba_LIST.class);
        startActivity(Al_Aqaba);
    }

    public void Maan(View view) {
        Intent  Maan= new Intent(this, Maan_LIST.class);
        startActivity( Maan);
    }
    public void about_the_bank_ib(View view) {
        Intent intent= new Intent(getBaseContext(),AB.class);
        intent.putExtra("text","General information\n" +"Arab Bank is one of the largest financial institutions in the Middle East, founded in 1930 in Jerusalem, Mandatory Palestine, as the first private sector financial institution in the Arab world. Headquartered today in Amman, Jordan, it serves clients in more than 600 branches spanning five continents. Arab Bank is a publicly held shareholding company listed on the Amman Stock Exchange.\n" +
                "\n" +
                "The bank is a major economic engine in Jordan and throughout the Middle East and North Africa region, providing banking services and capital, and facilitating development and trade throughout the region. According to its website, the bank is the highest-ranked by market capitalization, and represents approximately 25% of the Amman Stock Exchange.[5]\n" +
                "\n" +
                "U.S. appellate courts have ruled in the bank's favor in several lawsuits filed in the 2000s alleging its involvement in facilitating the funding of terrorist organizations.[6]"
       +"History\n" +
                        "Establishment (1940–1970s)\n" +
                        "In the 1940s and 1950s, the bank grew to 43 branches and had JOD 5.5 million capital. During the 1960s, the bank focused on investments and became a catalyst for Arab economic developments when most other financial institutions avoided the risk.\n" +
                        "\n" +
                        "During the nationalization wave of the 1960s, Arab Bank lost a total of 25 branches.[7] Following the Six-Day War in 1967, the bank closed its West Bank and Gaza branches. Although it closed branches in the Middle East, the bank continued to expand in other parts of the world. In 1961, the bank opened its first international location, becoming the first Arab financial institution to establish a presence in Switzerland.[7] By 1964 Arab Bank Switzerland had locations in both Zürich and Geneva.\n" +
                        "\n" +
                        "In 1974, after his father's death, Abd Al-Majeed Shoman was named Chairman and General Manager of Arab Bank.[8] Under his leadership, the bank expanded its scope of products and services into new areas of business.[8] Though it previously emphasized trade and small-scale construction finance, the bank undertook a leading role in large-scale project finance, both directly and through participation in syndicated loans.[8] By the 1990s, the bank added investment banking to its services. In the mid-1990s, the bank was given permission by the Central Bank of Jordan and the Israeli Central Bank to reopen in the West Bank/Gaza under the supervision of both the CBJ and the Palestinian Monetary Authority.[9]\n" +
                        "\n" +
                        "Expansion (2000–2010)\n" +
                        "In May 2000, Abd Al Majeed's son Abdel Hamid became CEO. Under his leadership, Arab Bank reopened operations in Syria in 2005, and took steps to commence its activities in Iraq, circumstances permitting.[10] In January 2007, Arab Bank established Europe Arab Bank (EAB), a London-based, fully owned subsidiary.[11] It also acquired 50% of MNG Bank in Turkey (now known as Turkland Bank) and 50% of Al Nisr Al Arabi Insurance company in Jordan, thus introducing bancassurance to its product variety. Also, the group established Arab Bank-Syria.[12] In 2008, Arab Bank partnered with Vasco, now OneSpan, to work on the bank's authentication technology.[13]\n" +
                        "\n" +
                        "Over the next few years, the bank opened branches in Frankfurt, London, Australia, New York and Singapore. Following the Oslo Peace Accords between Israel and Palestine, at the invitation of Israel, Arab Bank opened branches in several Palestinian towns with broad governmental support.[8]\n" +
                        "\n" +
                        "2011–present\n" +
                        "Today, Arab Bank provides consumer banking services, as well as corporate and institutional banking services to individuals, corporations, government agencies and other international financial institutions.\n" +
                        "\n" +
                        "After years of being ranked A− from Fitch, A− from Standard & Poor, and A3 from Moody’s, the bank's rankings were dropped twice in 2011. Moody's first downgraded its Local Currency Deposit Rating to Baa1,[14] and then downgraded the bank's Financial Strength Rating to a C− from a C. In both instances, Moody's noted the decision was based on an analysis of political instability in the region.[14] In April 2012, Moody's announced a possible downgrade of the Bank's current Financial Strength Rating as well as its local currency long- and short-term deposit ratings.[15] In November 2011, Standard & Poor's lowered its long-term counterparty credit ratings to 'BB' from 'BB+', noting the ratings are constrained by the local currency ratings on the sovereign. As of 25 January 2012, Fitch still had Arab Bank ranked at an A-.[16]\n" +
                        "\n" +
                        "As of 2018 the bank reported net income after tax of $820.5 million as compared to $533 million in 2017 with net income before tax reaching $1.1 billion. The Group’s equity grew to reach $8.7 billion while the return on equity increased to reach 9.5%. The Group’s net operating income grew by 8% driven by growth in net interest and commission income. Credit facilities increased by 3% to reach $25.8 billon while customer deposits increased to reach $34.3 billion.[17]\n" +
                        "\n" +
                        "As the only Jordanian organization ranked among the top 10 organizations in the Arab world, Arab Bank has shown great progress in its ESG performance throughout the years. During 2014, the Bank was ranked at the fifth level and was able to move up to the fourth level during 2015, with a total weight of 2.78%.[18]\n" +
                        "\n" +
                        "Compliance\n" +
                        "In 2006, the bank participated at the International Anti-Money Laundering/Combating Financing Terrorism Conference hosted by the Union of Arab Banks and supported by the United States Department of the Treasury.[19] The conference sought to unite the public and private sector in strengthening defenses against terrorist financing and money laundering in the MENA region.[20]\n" +
                        "\n" +
                        "Since 2006, the bank has held a regulatory compliance summit with speakers from across the international banking community to discuss and learn more about the compliance environment.[21] In 2008, at the request of the Association of Banks, Arab Bank hosted a compliance workshop attended by compliance professionals from banks throughout the country including the Central Bank of Jordan.[22]"
        );




        startActivity(intent);}

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.arabbank.jo/"));
        startActivity(intent);
    }

    public void Back(View view) {
        Intent i = new Intent(this,activityb.class);
        startActivity(i);
    }}