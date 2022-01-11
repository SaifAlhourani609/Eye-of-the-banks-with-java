package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AB extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a_b);
        textView=findViewById(R.id.tv1);
        Intent ii= getIntent();
        String name=ii.getStringExtra("text");
        textView.setText(name);
        ;    }

}
