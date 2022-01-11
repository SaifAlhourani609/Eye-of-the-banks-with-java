package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_jcb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_jcb);
    }

    public void irbid__jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A%E2%80%AD/@32.5504597,35.8608062,18.47z/data=!4m5!3m4!1s0x151c7685203e987b:0x20ec5cf78145a2e5!8m2!3d32.5500418!4d35.8618584?authuser=0&hl=en"));
        startActivity(intent);
    }

    public void al_husoun_jcb(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A7%D9%84%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%AA%D8%AC%D8%A7%D8%B1%D9%8A+%D8%A7%D9%84%D8%A7%D8%B1%D8%AF%D9%86%D9%8A+.%E2%80%AD/@32.5321638,35.8665699,19.89z/data=!4m5!3m4!1s0x151c76f4057b6b87:0xb788d513d0f7b9ee!8m2!3d32.5319971!4d35.8667098"));
        startActivity(intent);
    }
}