package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class CAB extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_c_a_b2);
        textView=findViewById(R.id.tv1);
        Intent ii= getIntent();
        String name=ii.getStringExtra("text");
        textView.setText(name);
        ;    }

}
