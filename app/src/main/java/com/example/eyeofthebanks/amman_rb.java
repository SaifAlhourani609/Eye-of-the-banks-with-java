package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_rb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_rb);
    }

    public void main_RB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Al+Rajhi+Bank/@31.9706996,35.895647,14.82z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2LHYp9is2K3ZiiDYudmF2KfZhg!3m5!1s0x151ca014e9a9e8a7:0x2f502f44a79eddd4!8m2!3d31.975072!4d35.897015!15sCiLYp9mE2KjZhtmDINin2YTYsdin2KzYrdmKINi52YXYp9mGIgOIAQGSAQRiYW5r"));
        startActivity(intent);
    }

    public void ghosha_rb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/AlRajhi+Bank/@31.9705116,35.8530139,17z/data=!4m13!1m7!3m6!1s0x151ca1098259cbf3:0x4ef556136e77b013!2sAbdallah+Ghosheh+St.,+Amman!3b1!8m2!3d31.9674944!4d35.8552991!3m4!1s0x151ca109923fb59b:0x3da990f7047288!8m2!3d31.9701532!4d35.8547884"));
        startActivity(intent);
    }

    public void quds_rb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D9%85%D8%B5%D8%B1%D9%81+%D8%A7%D9%84%D8%B1%D8%A7%D8%AC%D8%AD%D9%8A+Al+Rajhi+Bank%E2%80%AD/@31.9039434,35.9340528,16.52z/data=!4m8!1m2!2m1!1z2LTYp9ix2Lkg2KfZhNmC2K_YsyAo2YXZgtin2KjZhCDYp9mE2KXYsNin2LnYqSDZiNin2YTYqtmE2YHYstmK2YjZhik!3m4!1s0x151b5f4bcc960b3f:0xe1d07e69c7047754!8m2!3d31.906311!4d35.934182"));
        startActivity(intent);
    }

    public void jubeiha_rb(View view)  {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Al+Rajhi+Bank/@32.0263106,35.8550674,17z/data=!3m1!4b1!4m5!3m4!1s0x151c9f13328f3f75:0x328a2682050f6ee3!8m2!3d32.0263061!4d35.8572561"));
        startActivity(intent);
    }

    public void mecca_rb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Mecca+Mall/@31.9752097,35.8478613,15.44z/data=!4m9!1m2!2m1!1z2YXZg9mHINmF2YjZhA!3m5!1s0x151ca19bc3e1d1ed:0xc7b138ad3619f9b8!8m2!3d31.9775067!4d35.84328!15sCg3ZhdmD2Ycg2YXZiNmEWg8iDdmF2YPZhyDZhdmI2YSSAQ9zaG9wcGluZ19jZW50ZXI"));
        startActivity(intent);
    }
}