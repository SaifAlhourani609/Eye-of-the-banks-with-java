package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Housing_Bank extends AppCompatActivity {
    Intent i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_housing_bank);
        i = new Intent(getApplicationContext(), sorry.class);
        i.putExtra("image", "HB");
    }

    public void AMMAN(View view) {
        Intent intent = new Intent(getBaseContext(), amman_hb.class);
        startActivity(intent);
    }

    public void Al_Mafraq(View view) {
        Intent intent = new Intent(getBaseContext(), mafraq_hb.class);
        startActivity(intent);
    }

    public void Az_Zarqa(View view) {
        Intent intent = new Intent(getBaseContext(), az_zarqa_hb.class);
        startActivity(intent);
    }

    public void Irbid(View view) {
        Intent intent = new Intent(getBaseContext(), irbid_hb.class);
        startActivity(intent);
    }

    public void Al_Karak(View view) {
        Intent intent = new Intent(getBaseContext(), al_karak_hb.class);
        startActivity(intent);
    }

    public void Ajlun(View view){
        Intent intent = new Intent(getBaseContext(), ajlun_hb.class);
        startActivity(intent);
    }

    public void Jarash(View view){
        Intent intent = new Intent(getBaseContext(), jarash_hb.class);
        startActivity(intent);
    }

    public void Madaba(View view) {
        Intent intent = new Intent(getApplicationContext(), madaba_hb.class);
        startActivity(intent);
    }

    public void Al_Tafilah(View view){
        Intent intent = new Intent(getApplicationContext(), al_tafilh_hb.class);
        startActivity(intent);
    }

    public void Al_Aqaba(View view) {
        Intent intent = new Intent(getBaseContext(), al_aqaba_hb.class);
        startActivity(intent);
    }

    public void Maan(View view){
        Intent intent = new Intent(getBaseContext(), maan_hb.class);
        startActivity(intent);
    }

    public void Al_Balqa(View view) {
        Intent intent = new Intent(getBaseContext(), al_balqa_hb.class);
        startActivity(intent);
    }

    public void about_the_bank(View view) {
        Intent intent = new Intent(getBaseContext(), about_the_bank.class);
        intent.putExtra("text", "General information\n" +
                "The Housing Bank for Trade and Finance was established in 1973 as a Jordanian limited public shareholding company. The bank began its work as a bank specialized in the field of housing finance with a capital of half a million dinars. After 24 years of its establishment, a new stage of work began in the bank’s journey when it turned into a comprehensive commercial bank in 1997. And its capital has been increased more than once during the past years, the last of which was in 2017, when it became 315 million Jordanian dinars (equivalent to 444 million dollars). The property is 1.2 billion dinars (equivalent to 1.7 billion dollars), as it was at the end of 2020.\n\n" +
                "\n" +
                "Pioneering initiatives:\n" +
                "The first bank to implement the savings account awards system (1977).\n" +
                "The first bank in Jordan and the Arab world to establish a branch for children (in 1993).\n" +
                "The first bank in Jordan and the Arab world to implement a mobile branch (2014).\n" +
                "\n" +
                "Vision: The Housing Bank for Trade and Finance is the bank of choice for customers.\n\n" +
                "\n" +
                "Mission: To provide high quality, innovative banking services to clients in the individual, institutional and corporate sectors that meet their needs, exceed their expectations, and keep pace with developments in the financial and banking markets.\n" +
                "\n" +
                "Core Values: Satisfying customers, caring for and caring for employees, rewarding outstanding performance and teamwork.\n" +
                "\n" +
                "Social Responsibility\n" +
                "Social services are not something new to the Housing Bank, as the bank was distinguished by being a socially united institution, and this came through its educational services only, but rather by its permanent commitment to serve its community in various educational, educational, environmental, and sports fields in addition to combating poverty and unemployment.\n" +
                "78 Scientific, sports and health participation in society.\n" +
                "A large number of government institutions are in the field of; Such as sponsoring conferences and seminars, festivals and sports tournaments, in addition to good care facilities for outstanding students, providing support and assistance to people with special needs and orphans, launching environmental awareness campaigns and raising awareness about diseases, in addition to the Bank’s partnership with institutions, universities, schools, hospitals, youth centers, cultural centers, orphanages and organizations various non-governmental.\n" +
                "\n" +
                "The Housing Bank initiatives in the field of social responsibility:\n" +
                "Education / Entrepreneurship and Youth.\n" +
                "healthy/human\n" +
                "Charitable and developmental contributions.\n" +
                "\n" +
                "Education / Entrepreneurship and Youth:\n" +
                "The Housing Bank focuses on the education sector due to its belief in the pivotal role of this sector in building society. The year 2016 witnessed many initiatives in which the Bank contributed in supporting excellence and excellence for young energies in the Kingdom. The Bank continued its initiative to honor the top students in high school, and presented prizes to students High school students who are recovering on the recovery beds at the King Hussein Cancer Foundation and who, despite their health difficulties, have succeeded in the Tawjihi exam.\n" +
                "The Bank also provided scholarships in public universities to a number of students of the Elia Nuqul Foundation, and annually offers a scholarship called the \"Distinguished Student Scholarship\" for outstanding students at Princess Sumaya University. Last year, the Housing Bank supported the College of Business Administration at the University of Jordan, renovating a number of college halls and providing them with modern educational tools.\n" +
                "With the aim of improving the learning environment in public schools, especially in the less fortunate areas, the Housing Bank provided financial support to establish shelters in many of these schools, most notably the King Abdullah School for Excellence in Ma'an Governorate.\n" +
                "As a contribution to supporting national efforts to reduce unemployment rates by employing education outputs, the Housing Bank participated in employment fairs, including: the career day held by Akhtaboot Employment Company and the Employment Week at Birzeit University with the aim of providing employment opportunities for young people in a way that contributes to achieving economic and social development and supporting economic and social development. National economy.\n" +
                "\n\n" +
                "\n" +
                "healthy/human:\n" +
                "The initiatives to support health and human services come among the priorities of the housing bank’s social activities, as it carried out many initiatives in this field in the past year, and contributed to many activities to provide support and assistance to institutions and bodies concerned with medical and health care, including: King Hussein Cancer Center, Palestine International Foundation Support Medicine in Palestine, a free medical day with the Greater Amman Municipality, the Jordanian Society for Medical Aid to the Palestinians, in addition to organizing periodic blood donation campaigns by bank employees in cooperation with the Jordan Blood Bank.\n" +
                "The Bank also continued its support for the King Hussein Cancer Foundation for its humanitarian role in contributing to alleviating the physical and psychological pain of the injured and provided in-kind aid to the Friends of Cancer Patients Association to alleviate the suffering of them and their families, especially in the winter season.\n" +
                "To support its role in serving the medical march in the Kingdom, the Housing Bank provided material support for the Royal Medical Services, and the Bank also provided financial support to the Greater Amman Municipality in exchange for a free medical day to enhance the role of civil institutions based on serving the Jordanian person.\n" +
                "In order to promote this activity and motivate citizens in general to turn to it, the Housing Bank organized a blood donation activity for its employees.\n" +
                "With the families in Palestine, the Bank stood in support of the activities that support them and enable them to withstand, as it had a role in supporting the medical sector there through a bronze sponsorship of the Palestine International Foundation.\n" +
                "\n" +
                "Charitable and developmental contributions:\n" +
                "In continuation to building and consolidating the mental images of the Bank in the field of social responsibility and contribution to achieving sustainable development, the Bank’s sponsorship and support extended to many humanitarian institutions and charitable societies in all governorates of the Kingdom. It also contributed to the success of campaigns aimed at developing and developing the local community and combating poverty, hunger and unemployment for many Among the development institutions, most notably: Tkiyet Um Ali, Jordan River Foundation, Al-Aman Fund for the Future of Orphans, SOS Children’s Villages Association, Um Al-Hussein Charitable Foundation, King Hussein Charitable Association and others.\n" +
                "Given the importance of the role of civil society institutions, which are parallel to official institutions in serving the country, the Housing Bank provided support to a number of leading institutions that provide value-added services to society.\n" +
                "The Bank provided financial support to the Al-Aman Fund for the Future of Orphans to enable it to play its role in serving this category of society, in addition to the Humanitarian Aid Club in a special ceremony to educate orphans students.\n" +
                "Sports have an interest in the Housing Bank, as it provided support for the football league for students of De La Salle College, and in support of the Jordanian Federation of Brazilian Jiu-Jitsu and Mixed Martial Arts through one player, and associations have an interest in the Housing Bank, where it provided support for the annual bazaar of the Al-Hussein Association.\n" +
                "People with special needs have great interest in the Housing Bank, as it provided financial support to Abu Nseir Sports Club for players with special needs.\n" +
                "Financial support was also provided to the Prince Ali Club for the Deaf and the Association for the Development of Deaf Women to enable them to implement their programs for this group of society\n" +
                "Financial support was provided to the Jordanian Hashemite Fund for Human Development for its role in providing development services throughout the Kingdom, in addition to the Association for the Care and Rehabilitation of Autistic Creators by training mothers to deal with their children with autism.\n"

        );
        intent.putExtra("image", "HB");
        startActivity(intent);
    }

    public void back(View view) {
        Intent intent = new Intent(getBaseContext(), activityb.class);
        startActivity(intent);
    }

    public void WEBSITE(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.hbtf.com/ar/pages/default.aspx"));
        startActivity(intent);
    }
}