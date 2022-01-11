package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class jkb extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jkb);
        textView=findViewById(R.id.tv2);
        Intent a= getIntent();
        String name=a.getStringExtra("text");
        textView.setText(name);
        ;    }

}