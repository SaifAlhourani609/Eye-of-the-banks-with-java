package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class AMMAN_LIST_ABC extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_m_m_a_n__l_i_s_t__a_b_c);
    }


    public void ABC_AMMAN(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/BANK+ABC+-+%D8%A7%D9%84%D9%85%D8%A4%D8%B3%D8%B3%D8%A9+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A%D8%A9+%D8%A7%D9%84%D9%85%D8%B5%D8%B1%D9%81%D9%8A%D8%A9%E2%80%AD/@31.9608957,35.8617739,14z/data=!4m9!1m2!2m1!1zQUJDINin2YTZgdix2Lkg2KfZhNix2KbZitiz2Yo!3m5!1s0x151ca06eac74806d:0xe76781e9d4abf17e!8m2!3d31.9677253!4d35.8991069!15sCh1BQkMg2KfZhNmB2LHYuSDYp9mE2LHYptmK2LPZiiIDiAEBWh8iHWFiYyDYp9mE2YHYsdi5INin2YTYsdim2YrYs9mKkgEPaW52ZXN0bWVudF9iYW5r?hl=en"));
        startActivity(intent);
    }


    public void BANK_ABC(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.9660398,35.8961003,16.13z/data=!4m9!1m2!2m1!1zQUJDINin2YTZgdix2Lkg2KfZhNix2KbZitiz2Yo!3m5!1s0x151ca06eac7a5613:0x7c8fa1d5648f4776!8m2!3d31.9686651!4d35.9045901!15sCh1BQkMg2KfZhNmB2LHYuSDYp9mE2LHYptmK2LPZiiIDiAEBkgEEYmFuaw?hl=en"));
        startActivity(intent);
    }

    public void Al_Rajaa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank+Atm/@31.9771667,35.8662829,14z/data=!4m10!1m3!2m2!1z2LTYp9ix2Lkg2YjYtdmB2Yog2KfZhNiq2YQg4oCTINmF2KzZhdi5INio2YfYrNiqINis2KfYsdiv2YbYsiDYqNmG2YM!6e2!3m5!1s0x151ca01634d0eb59:0xb4e7ca04af48b737!8m2!3d31.9818615!4d35.8945777!15sCkTYtNin2LHYuSDZiNi12YHZiiDYp9mE2KrZhCDigJMg2YXYrNmF2Lkg2KjZh9is2Kog2KzYp9ix2K_ZhtiyINio2YbZg5IBA2F0bQ?hl=en"));
        startActivity(intent);
    }

    public void Al_Rajaa2(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.9773986,35.8137517,12z/data=!4m9!1m2!2m1!1zCSDYtNin2LHYuSDYp9io2YYg2K7ZhNiv2YjZhiDigJMg2YXYrNmF2Lkg2KfZhNix2KzYp9ihINin2YTYt9io2Yog2KjZhtmDINin2YTZhdik2LPYs9ip!3m5!1s0x151ca0882a7a90ed:0xbd8a089453b99ed!8m2!3d31.9523098!4d35.9017968!15sClXYtNin2LHYuSDYp9io2YYg2K7ZhNiv2YjZhiDigJMg2YXYrNmF2Lkg2KfZhNix2KzYp9ihINin2YTYt9io2Yog2KjZhtmDINin2YTZhdik2LPYs9ipIgOIAQGSAQRiYW5r?hl=en"));
        startActivity(intent);
    }

    public void City_Mall(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);
    }

    public void Al_Rawnaq_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank+%D9%81%D8%B1%D8%B9+%D8%A7%D9%84%D8%B1%D9%88%D9%86%D9%82%E2%80%AD/@31.9529955,35.8518543,17z/data=!3m1!4b1!4m5!3m4!1s0x151ca1140a83efe9:0xca2152cac9e4f35e!8m2!3d31.952991!4d35.854043"));
        startActivity(intent);
    }

    public void Wehdat_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@32.1378487,34.8067129,9z/data=!4m9!1m2!2m1!1sABC+bank!3m5!1s0x151b5f6d774fe4eb:0x6a12fc4bd8025f11!8m2!3d31.931131!4d35.934573!15sCghBQkMgYmFuayIDiAEBkgEEYmFuaw"));
        startActivity(intent);

    }

    public void Khalda_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.8577466,35.7085983,11z/data=!4m9!1m2!2m1!1zCSDZgdix2Lkg2K7ZhNiv2Kcg2LTYp9ix2Lkg2LnYp9mF2LEg2KjZhiDZhdin2YTZgyDYqNmG2YMgQUJD!3m5!1s0x151ca1eab05b53b5:0xc191b9b3c5479048!8m2!3d31.9898126!4d35.8490844!15sCjrZgdix2Lkg2K7ZhNiv2Kcg2LTYp9ix2Lkg2LnYp9mF2LEg2KjZhiDZhdin2YTZgyDYqNmG2YMgQUJDIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void Sweifieh_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank+-+ATM/@31.9472653,35.8711685,13.53z/data=!4m9!1m2!2m1!1s+Ali+Nasouh+Al+Taher+Street+Bank+ABC!3m5!1s0x151ca103df968a03:0x7e363d43adf5d1!8m2!3d31.958425!4d35.867636!15sCiNBbGkgTmFzb3VoIEFsIFRhaGVyIFN0cmVldCBCYW5rIEFCQyIDiAEB"));
        startActivity(intent);
    }

    public void Queen_Rania(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@32.007557,35.855588,14z/data=!4m9!1m2!2m1!1z2LTYp9ix2Lkg2KfZhNmF2YTZg9ipINix2KfZhtmK2Kcg2KfZhNi52KjYryDYp9mE2YTZhyDigJMg2YXYrNmF2Lkg2K7ZhNmK2YHYqSDYqNmG2YMgQUJD!3m5!1s0x151c9f7720a198dd:0x5fe15deccb9eeb0d!8m2!3d32.01549!4d35.867261!15sClfYtNin2LHYuSDYp9mE2YXZhNmD2Kkg2LHYp9mG2YrYpyDYp9mE2LnYqNivINin2YTZhNmHIOKAkyDZhdis2YXYuSDYrtmE2YrZgdipINio2YbZgyBBQkMiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void Abdoun_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.949984,35.8659685,14z/data=!4m9!1m2!2m1!1zCSDZgdix2Lkg2LnYqNiv2YjZhiDYtNin2LHYuSDYp9mE2YbZitix2YjYsiDYqNmG2YMgQUJD!3m5!1s0x151ca0f06ea4ca8b:0xa478062a5e981c05!8m2!3d31.949984!4d35.883478!15sCjTZgdix2Lkg2LnYqNiv2YjZhiDYtNin2LHYuSDYp9mE2YbZitix2YjYsiDYqNmG2YMgQUJDIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void Bahjat_Gardens_Complex(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.980237,35.8199035,14z/data=!4m9!1m2!2m1!1zCSDZgdix2Lkg2LnYqNiv2YjZhiDYtNin2LHYuSDYp9mE2YbZitix2YjYsiDYqNmG2YMgQUJD!3m5!1s0x151ca032eedc4945:0x4dd59397766fb34d!8m2!3d31.98958!4d35.87339!15sCjTZgdix2Lkg2LnYqNiv2YjZhiDYtNin2LHYuSDYp9mE2YbZitix2YjYsiDYqNmG2YMgQUJDIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void Tabarbour_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.9785684,35.8647479,13z/data=!4m9!1m2!2m1!1zCSDYtNin2LHYuSDYt9in2LHZgiAtINi32KjYsdio2YjYsSDYqNmG2YMgQUJD!3m5!1s0x151b6068faff6d55:0xb74d7824a32df14d!8m2!3d31.9940207!4d35.9455497!15sCivYtNin2LHYuSDYt9in2LHZgiAtINi32KjYsdio2YjYsSDYqNmG2YMgQUJDIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void Marj_Al_Hamam_Branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/ABC+Bank/@31.8890877,35.8471273,17z/data=!4m9!1m2!2m1!1sMarj+Al+Hamam+Branch+Bank+ABC!3m5!1s0x151ca6603162c499:0xe1b5d0fbed906a0c!8m2!3d31.889982!4d35.84743!15sCh1NYXJqIEFsIEhhbWFtIEJyYW5jaCBCYW5rIEFCQyIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    /* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/
}