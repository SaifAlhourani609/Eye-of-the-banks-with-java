package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class activityd extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activityd);
        textView=findViewById(R.id.tv);
        Intent i= getIntent();
        String name=i.getStringExtra("text");
        textView.setText(name);
        ;    }

}