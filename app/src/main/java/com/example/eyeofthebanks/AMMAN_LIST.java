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
import com.example.eyeofthebanks.Arab_Bank.Arab_Bank_Amman;
import com.example.eyeofthebanks.Arab_Bank.Arab_Bank_Amman2;
import com.example.eyeofthebanks.Arab_Bank.Consolidated_Consultants_Engineering;
import com.example.eyeofthebanks.Arab_Bank.Princess_Raya_Amman;
import com.example.eyeofthebanks.Arab_Bank.meccamall;
import com.example.eyeofthebanks.Arab_Bank.the_all_arab_bank;
import com.example.eyeofthebanks.layout.Sahat_Al_Malek_Faisal_amman;

public class AMMAN_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_m_m_a_n__l_i_s_t);
    }



    public void main_arab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.9642139,35.8980365,17.49z/data=!4m5!3m4!1s0x151ca068d413196f:0xcc353012b301e1d3!8m2!3d31.9654278!4d35.8984956"));
        startActivity(intent);
    }

    public void sahab(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.852681,36.006447,18z/data=!4m5!3m4!1s0x0:0xaed535100358bbeb!8m2!3d31.8524023!4d36.0074437?hl=en-US"));
        startActivity(intent);
    }

    public void kherbat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+-+ATM/@31.870778,35.930824,18z/data=!4m5!3m4!1s0x0:0xcdf0c06282de7c17!8m2!3d31.8708627!4d35.929922?hl=en-US"));
        startActivity(intent);
    }

    public void baker(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+ATM/@31.895117,35.917598,19z/data=!4m5!3m4!1s0x0:0x65a864b56548907!8m2!3d31.8953372!4d35.9173009?hl=en-US"));
        startActivity(intent);
    }

    public void wehdat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.930908,35.934578,19z/data=!4m5!3m4!1s0x0:0xb205bbb7cc067e38!8m2!3d31.9309992!4d35.9342193?hl=en-US"));
        startActivity(intent);
    }

    public void bonayat(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Atm+Arab+Bank+%D8%B5%D8%B1%D8%A7%D9%81+%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D8%A8%D9%86%D9%8A%D8%A7%D8%AA%E2%80%AD/@31.883466,35.896428,20z/data=!4m5!3m4!1s0x0:0xc5f89f270a388bf1!8m2!3d31.8834361!4d35.8959338?hl=en-US"));
        startActivity(intent);
    }

    public void uop(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+-+ATM/@31.894213,35.871274,18z/data=!4m5!3m4!1s0x0:0x5477f733d47a98cf!8m2!3d31.8940713!4d35.8713116?hl=en-US"));
        startActivity(intent);
    }

    public void marka(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+-+ATM/@31.980913,35.985633,20z/data=!4m5!3m4!1s0x0:0xf5b5d2638b3b57e!8m2!3d31.9808368!4d35.9857405?hl=en-US"));
        startActivity(intent);
    }

    public void russeifa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.005674,36.007881,19z/data=!4m5!3m4!1s0x0:0xe949ec310c05dec0!8m2!3d32.0058777!4d36.007787?hl=en-US"));
        startActivity(intent);

    }

    public void yajoze(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.028856,36.042189,20z/data=!4m5!3m4!1s0x0:0x4f28d5760348122d!8m2!3d32.0288867!4d36.0423248?hl=en-US"));
        startActivity(intent);
    }

    public void aspu(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.028856,36.042189,20z/data=!4m5!3m4!1s0x0:0x4f28d5760348122d!8m2!3d32.0288867!4d36.0423248?hl=en-US"));
        startActivity(intent);
    }

    public void yajoze_st(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.0289004,35.8639601,19.64z/data=!4m5!3m4!1s0x0:0xde09fc54e7773eff!8m2!3d32.0290027!4d35.8640219?hl=en-US"));
        startActivity(intent);
    }

    public void u_st(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+-+ATM/@32.021411,35.861232,21z/data=!4m5!3m4!1s0x0:0x9692c29987e599f5!8m2!3d32.021435!4d35.861151?hl=en-US"));
        startActivity(intent);
    }

    public void rashid(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.005091,35.880164&z=20&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=12340375696893395431"));
        startActivity(intent);
    }

    public void madina(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.997428,35.871706,21z/data=!4m5!3m4!1s0x0:0x4cd993b8dae8396c!8m2!3d31.99744!4d35.87159?hl=en-US"));
        startActivity(intent);
    }

    public void uthaina(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.972912,35.873458,20z/data=!4m5!3m4!1s0x0:0x4a6406e2d6fcaf15!8m2!3d31.9729545!4d35.8732707?hl=en-US"));
        startActivity(intent);
    }

    public void zahran(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.961364,35.879289,20z/data=!4m5!3m4!1s0x0:0x215f3529f99ea1cc!8m2!3d31.9615768!4d35.879148?hl=en-US"));
        startActivity(intent);
    }

    public void tabarbour(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+ATM/@31.992224,35.936538,19z/data=!4m5!3m4!1s0x0:0xce1ffe00d3e8342e!8m2!3d31.992354!4d35.9363487?hl=en-US"));
        startActivity(intent);
    }

    public void hashimi(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.968428,35.960763,19z/data=!4m5!3m4!1s0x0:0x94fd1b4992ab1877!8m2!3d31.9686!4d35.96023?hl=en-US"));
        startActivity(intent);
    }

    public void Quwaysimah(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.917929,35.951178,17z/data=!4m5!3m4!1s0x0:0x4d2cce32ef7cbf4e!8m2!3d31.9183419!4d35.9484188?hl=en-US"));
        startActivity(intent);
    }

    public void Rainbow(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=31.949852,35.925073&z=20&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=11106840372955182966"));
        startActivity(intent);
    }

    public void Yasmin(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.914653,35.888744,19z/data=!4m5!3m4!1s0x0:0x10716150f80dbf67!8m2!3d31.914736!4d35.8878822?hl=en-US"));
        startActivity(intent);
    }

    public void Airport(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=31.919354,35.860023&z=20&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=9742258771843771299"));
        startActivity(intent);
    }

    public void taj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.940902,35.888179,19z/data=!4m5!3m4!1s0x0:0x776333254fb78fae!8m2!3d31.9408934!4d35.8883053?hl=en-US"));
        startActivity(intent);
    }

    public void der(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+ATM/@31.943137,35.866747,19z/data=!4m5!3m4!1s0x0:0xf446946f7fafeb66!8m2!3d31.9428983!4d35.8660128?hl=en-US"));
        startActivity(intent);
    }

    public void abdoun(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+and+ATM/@31.94847,35.892803,20z/data=!4m5!3m4!1s0x0:0xb6130070281e353f!8m2!3d31.948388!4d35.8932768?hl=en-US"));
        startActivity(intent);
    }

    public void SmartBuy(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@31.952226,35.85667,19z/data=!4m5!3m4!1s0x0:0x8a1e821da7bf0578!8m2!3d31.952279!4d35.8551867?hl=en-US"));
        startActivity(intent);
    }

    public void Abdallah_Ghosheh_St(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=31.9712,35.855215&z=19&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=10013976236528118633"));
        startActivity(intent);
    }

    public void Khilda_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+Khalda/@31.996791,35.847803,18z/data=!4m5!3m4!1s0x0:0x5053635ad833cfb!8m2!3d31.9970406!4d35.8468719?hl=en-US"));
        startActivity(intent);
    }

    public void Sweileh_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank/@32.021927,35.841564,19z/data=!4m5!3m4!1s0x0:0xd5539e6d7f660b1e!8m2!3d32.0221333!4d35.8422386?hl=en-US"));
        startActivity(intent);
    }
}