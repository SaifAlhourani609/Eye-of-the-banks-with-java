package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class irbid_capital extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_irbid_capital);
    }

    public void irbid__capital(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps?ll=32.544857,35.858155&z=19&t=m&hl=en&gl=JO&mapclient=embed&cid=3481998564274075840"));
        startActivity(intent);
    }

    public void irbid2_capital(View view)  {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Capital+Bank+of+Jordan+Irbid+Branch/@32.5452501,35.8568058,19z/data=!4m5!3m4!1s0x0:0x8c97a12b46e402b1!8m2!3d32.5455384!4d35.8563347?hl=en"));
        startActivity(intent);
    }
}