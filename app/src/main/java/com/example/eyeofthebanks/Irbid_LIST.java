package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.eyeofthebanks.Arab_Bank.jadara_university_irbid;

public class Irbid_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid__l_i_s_t);
    }


    public void ju(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+bank+ATM/@32.424774,35.948681,17z/data=!4m5!3m4!1s0x0:0x5085d48ef38a868d!8m2!3d32.4225329!4d35.9490744?hl=en-US"));
        startActivity(intent);
    }

    public void Arabella_Mall_atm(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Arab+Bank+ATM/@32.538271,35.862523,20z/data=!4m5!3m4!1s0x0:0x13f853cf0afd8573!8m2!3d32.5384401!4d35.8628797?hl=en-US"));
        startActivity(intent);
    }

    public void Irbid_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.544274,35.858543&z=21&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=8344690741627509660"));
        startActivity(intent);
    }

    public void Edoun_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.533362,35.852799&z=20&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=2478779513657921855"));
        startActivity(intent);
    }
}