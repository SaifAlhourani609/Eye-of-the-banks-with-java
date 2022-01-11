package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_ahli extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_ahli);
    }

    public void arabella__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank+ATM+-+JO173/@32.5381358,35.8622257,20.33z/data=!4m5!3m4!1s0x151c768d4bc4588f:0x406cfc97669186ea!8m2!3d32.5381963!4d35.8619877"));
        startActivity(intent);
    }

    public void hashimi__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.5567643,35.8523233,21z/data=!4m5!3m4!1s0x151c769f20bfdff5:0x31c57021cd699318!8m2!3d32.5567735!4d35.8524543"));
        startActivity(intent);
    }

    public void ramtha__ahli(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Jordan+Ahli+Bank/@32.5605563,36.0111668,19.17z/data=!4m5!3m4!1s0x151b8d0b58bd9665:0x302975df251505e!8m2!3d32.560578!4d36.0107984"));
        startActivity(intent);
    }
}