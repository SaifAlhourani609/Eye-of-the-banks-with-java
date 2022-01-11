package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import com.example.eyeofthebanks.Arab_Bank.al_hashme;

public class Az_Zarqa_LIST extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zarqa__l_i_s_t);

    }

    public void Az_Zarqa_branch(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%B9%D8%B1%D8%A8%D9%8A+%D8%A7%D9%84%D9%88%D8%B3%D8%B7+%D8%A7%D9%84%D8%AA%D8%AD%D8%A7%D8%B1%D9%8A%E2%80%AD/@32.063187,36.091936,20z/data=!4m5!3m4!1s0x0:0x28292d1cf79ed033!8m2!3d32.0631688!4d36.0917009?hl=en-US"));
        startActivity(intent);
    }

    public void New_Zarqa_branch(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.085873,36.091596&z=19&t=m&hl=en-US&gl=US&mapclient=apiv3&cid=10298917105234004026"));
        startActivity(intent);
    }
}