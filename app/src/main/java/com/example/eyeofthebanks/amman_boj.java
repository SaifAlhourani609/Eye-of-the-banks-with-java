package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_boj extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_boj);
    }

    public void main_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan+Shmeisani+%7C+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86+%D8%A7%D9%84%D8%B4%D9%85%D9%8A%D8%B3%D8%A7%D9%86%D9%8A%E2%80%AD/@31.9681965,35.8953085,19.42z/data=!4m5!3m4!1s0x151ca1536dfd84b9:0x7a70de805da3a804!8m2!3d31.9683732!4d35.895906"));
        startActivity(intent);
    }

    public void jabal_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9670485,35.9183881,19.89z/data=!4m12!1m6!3m5!1s0x151b5ff4ceec211f:0x5fd3434ebdee810e!2sBank+of+Jordan!8m2!3d31.9670248!4d35.9188676!3m4!1s0x151b5ff4ceec211f:0x5fd3434ebdee810e!8m2!3d31.9670248!4d35.9188676"));
        startActivity(intent);
    }

    public void downtown_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9479801,35.9341994,19.25z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYp9ix2K_ZhiDZiNiz2Lcg2KfZhNio2YTYrw!3m5!1s0x151b5f98e6ed5f7b:0x9daf1c3aea13f988!8m2!3d31.948038!4d35.93474!15sCiXYqNmG2YMg2KfZhNin2LHYr9mGINmI2LPYtyDYp9mE2KjZhNivIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void marka_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9785857,35.9817253,18.61z/data=!4m5!3m4!1s0x151b60bdaee297cb:0x13ffab074ba251de!8m2!3d31.9783169!4d35.9827673"));
        startActivity(intent);
    }

    public void seir_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9484057,35.8179238,19.86z/data=!4m5!3m4!1s0x151ca3fa96e0c2a5:0x1ab22abb35901c9f!8m2!3d31.948398!4d35.817956"));
        startActivity(intent);
    }

    public void sweileh_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D8%B3%D8%AA%D8%AF%D9%8A%D9%88+%D8%A7%D8%A8%D9%88+%D8%B4%D9%86%D8%A8+%D9%85%D9%82%D8%A7%D8%A8%D9%84+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86+%D8%B5%D9%88%D9%8A%D9%84%D8%AD.%E2%80%AD/@32.0233961,35.8407592,19z/data=!3m1!4b1!4m5!3m4!1s0x151c9f450367a931:0x7e49d6394be6cbdb!8m2!3d32.0233961!4d35.8413064"));
        startActivity(intent);
    }

    public void st_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9508481,35.9208948,18.36z/data=!4m5!3m4!1s0x151b5f8470f6cc55:0xfffe60706ab0643a!8m2!3d31.9509694!4d35.9224734"));
        startActivity(intent);
    }

    public void rd_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan+-+ATM/@31.954887,35.913843,19.78z/data=!4m5!3m4!1s0x151ca07896ae9297:0x9c3dfc52be1f1988!8m2!3d31.954773!4d35.914215"));
        startActivity(intent);
    }

    public void quwaysimah_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.903014,35.9399432,15z/data=!4m9!1m2!2m1!1z2KfZhNmC2YjZitiz2YXZhyDYqNmG2YMg2KfZhNin2LHYr9mGIA!3m5!1s0x151b5f2e0fc890a5:0xdc499f751f5ad3a!8m2!3d31.903014!4d35.948698!15sCiTYp9mE2YLZiNmK2LPZhdmHINio2YbZgyDYp9mE2KfYsdiv2YYiA4gBAZIBBGJhbms"));
        startActivity(intent);
    }

    public void nuzha_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9708478,35.927886,19.06z/data=!4m5!3m4!1s0x151b5fefaeb9e05d:0x2336de8d65b76dd7!8m2!3d31.97125!4d35.928442"));
        startActivity(intent);
    }

    public void gardens_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9872406,35.8779756,20.5z/data=!4m5!3m4!1s0x151ca03170dac7d1:0x81e95c3b6a56bab0!8m2!3d31.986971!4d35.877876"));
        startActivity(intent);
    }

    public void bayader_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9541217,35.8387823,18.69z/data=!4m5!3m4!1s0x151ca1686575e759:0x6fd9531f34e2996a!8m2!3d31.9545305!4d35.8399535"));
        startActivity(intent);
    }

    public void lwebdeh_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9590544,35.9178902,19.81z/data=!4m5!3m4!1s0x151b5f88f8d0b7d9:0xd2c59a56b13180b7!8m2!3d31.959071!4d35.918078"));
        startActivity(intent);
    }

    public void tareq_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A3%D8%B1%D8%AF%D9%86%E2%80%AD/@31.9910345,35.9394754,19.86z/data=!4m5!3m4!1s0x151b6157372cef87:0x669f73ea71abf9e6!8m2!3d31.9911309!4d35.9394243"));
        startActivity(intent);
    }

    public void city_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9801696,35.8370918,19.03z/data=!4m5!3m4!1s0x151ca184e70f794f:0xfe938b1714387b8c!8m2!3d31.980237!4d35.837413"));
        startActivity(intent);
    }

    public void marj_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.8927269,35.8423195,19.53z/data=!4m5!3m4!1s0x151ca689e7e83e3f:0x6f3efa60009f01b9!8m2!3d31.892785!4d35.843073"));
        startActivity(intent);
    }

    public void swaifyeh_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.8927269,35.8423195,19.53z/data=!4m5!3m4!1s0x151ca689e7e83e3f:0x6f3efa60009f01b9!8m2!3d31.892785!4d35.843073"));
        startActivity(intent);
    }

    public void jubeiha_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@32.0203872,35.8624766,17.08z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYp9ix2K_ZhiDYp9mE2KzYqNmK2YfZhw!3m5!1s0x151c9f73e6fee8db:0x890a102aab0b7fa7!8m2!3d32.0192081!4d35.8649028!15sCiLYqNmG2YMg2KfZhNin2LHYr9mGINin2YTYrNio2YrZh9mHIgOIAQGSAQ9pbnZlc3RtZW50X2Jhbms"));
        startActivity(intent);
    }

    public void wehdat_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.930456,35.9317143,18.78z/data=!4m5!3m4!1s0x151b5f6dc72e2911:0xaa39d5beb732fb4d!8m2!3d31.9305908!4d35.9324628"));
        startActivity(intent);
    }

    public void mecca_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+Of+Jordan/@31.9762186,35.8581818,19.81z/data=!4m5!3m4!1s0x151ca1a52a977257:0x4ba2a5874a4f18bf!8m2!3d31.9763656!4d35.8580329"));
        startActivity(intent);
    }

    public void khilda_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9910849,35.8489778,18.78z/data=!4m5!3m4!1s0x151ca1ea8e38bbc1:0xd0358db73e7ea277!8m2!3d31.9912458!4d35.8488956"));
        startActivity(intent);
    }

    public void alanda_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9029475,35.9480342,19.56z/data=!4m5!3m4!1s0x151b5f2e0fc890a5:0xdc499f751f5ad3a!8m2!3d31.903014!4d35.948698"));
        startActivity(intent);
    }

    public void madina_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9876901,35.8672965,19z/data=!4m5!3m4!1s0x151ca1cbf6807003:0xc7fa1e4822ddcf24!8m2!3d31.98817!4d35.867177"));
        startActivity(intent);
    }

    public void yarmouk_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%E2%80%AD/@31.952509,35.9616974,21z/data=!4m5!3m4!1s0x151b5e4a7f126a19:0xb903bb4d227167cf!8m2!3d31.952535!4d35.961717"));
        startActivity(intent);
    }

    public void nseir_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Bank+%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%E2%80%AD/@32.0526488,35.8790207,20.78z/data=!4m5!3m4!1s0x151c9e5b99fb6f9b:0x671bf32ff1cc3f65!8m2!3d32.0527169!4d35.8791322"));
        startActivity(intent);
    }

    public void yasmin_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@31.9173232,35.891239,19.78z/data=!4m5!3m4!1s0x151ca0cadcff1629:0x9c0704ae1add8703!8m2!3d31.917267!4d35.891207"));
        startActivity(intent);
    }

    public void uthaina_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%E2%80%AD/@31.9665371,35.8774607,21z/data=!4m5!3m4!1s0x151ca0515e1d9059:0x47df132e4cb94a37!8m2!3d31.9664678!4d35.8773485"));
        startActivity(intent);
    }

    public void dabouq_boj(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan+-+ATM/@31.9982976,35.8214855,21z/data=!4m16!1m10!4m9!1m4!2m2!1d35.9043105!2d31.9416302!4e1!1m3!2m2!1d35.8222022!2d31.9979836!3m4!1s0x151ca218a7a11e63:0x88b5f5b9bb342e6d!8m2!3d31.998232!4d35.821701"));
        startActivity(intent);
    }
}