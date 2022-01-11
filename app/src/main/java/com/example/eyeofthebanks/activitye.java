package com.example.eyeofthebanks;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class activitye extends AppCompatActivity {


    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activitye);
        textView=findViewById(R.id.tv);
        Intent i= getIntent();
        String name=i.getStringExtra("text");
        textView.setText(name);
          }

}