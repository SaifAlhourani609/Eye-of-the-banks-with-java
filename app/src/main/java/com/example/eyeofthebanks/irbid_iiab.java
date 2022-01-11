package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_iiab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_iiab);
    }

    public void irbid__iiab(View view) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Islamic+International+Arab+Bank/@32.5373141,35.8584778,16z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2LnYsdio2Yog2KfZhNin2LPZhNin2YXZiiDYp9mE2K_ZiNmE2Yog2KfYsdio2K8!3m5!1s0x151c768d37ceb1e5:0xfe036ce97e539ec2!8m2!3d32.538442!4d35.8621065!15sCj7Yp9mE2KjZhtmDINin2YTYudix2KjZiiDYp9mE2KfYs9mE2KfZhdmKINin2YTYr9mI2YTZiiDYp9ix2KjYryIDiAEBkgEEYmFuaw?hl=en-US"));
            startActivity(intent);
    }
}