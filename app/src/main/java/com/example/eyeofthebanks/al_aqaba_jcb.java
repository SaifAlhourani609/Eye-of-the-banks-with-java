package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class al_aqaba_jcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_al_aqaba_jcb);
    }

    public void aqaba__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D9%86%D9%8A%E2%80%AD/@29.5311561,35.0013662,16z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2KrYrNin2LHZiiDYp9mE2KfYsdiv2YbZiiDYp9mE2LnZgtio2Yc!3m5!1s0x15007030b64bb671:0xf485c7e6c026cefb!8m2!3d29.5329901!4d35.0044906!15sCjXYp9mE2KjZhtmDINin2YTYqtis2KfYsdmKINin2YTYp9ix2K_ZhtmKINin2YTYudmC2KjZhyIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }
}