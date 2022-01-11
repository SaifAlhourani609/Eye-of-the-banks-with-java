package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Ajlun_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ajlun__l_i_s_t);

    }

    public void Ajlun_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.331851,35.7517&z=20&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=1417948634604601846"));
        startActivity(intent);
    }
}