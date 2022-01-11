package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_balqa_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_balqa_ahli);
    }

    public void bau_ahli(View view)  {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.0261157,35.7170463,19.47z/data=!4m5!3m4!1s0x151cbd1773114735:0x880eef4b4e7510b6!8m2!3d32.0263177!4d35.7168629"));
        startActivity(intent);
    }

    public void salt_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.0389126,35.7243555,21z/data=!4m5!3m4!1s0x151cbdee9337a51f:0x254cd61b084d55de!8m2!3d32.0389479!4d35.7245041"));
        startActivity(intent);
    }

    public void gate_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D9%87%D9%84%D9%8A%E2%80%AD/@32.0594111,35.7463173,20.78z/data=!4m5!3m4!1s0x151c9819297b5ed7:0xf0e056404f94f5f1!8m2!3d32.0594347!4d35.746511"));
        startActivity(intent);
    }

    public void alla_ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.1848817,35.6215416,21z/data=!4m5!3m4!1s0x151c93bcc243fec3:0xb6151283ab78cdaa!8m2!3d32.1849375!4d35.6216875"));
        startActivity(intent);
    }
}