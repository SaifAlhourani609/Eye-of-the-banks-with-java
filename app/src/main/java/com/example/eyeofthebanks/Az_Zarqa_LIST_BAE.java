package com.example.eyeofthebanks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class Az_Zarqa_LIST_BAE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_az__zarqa__l_i_s_t__b_a_e);
    }

    public void Saadeh(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@32.027174,35.8998609,11z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSAg2KfZhNiy2LHZgtin2KE!3m5!1s0x151b65623548170f:0x1a773d71ecb5ed76!8m2!3d32.0636171!4d36.0874198!15sCizYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5ICDYp9mE2LLYsdmC2KfYoSIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    public void Zarqa(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/%D8%A8%D9%86%D9%83+%D8%A7%D9%84%D8%A7%D8%AA%D8%AD%D8%A7%D8%AF%E2%80%AD/@32.027174,35.8998609,11z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSAg2KfZhNiy2LHZgtin2KE!3m5!1s0x151b6f8909efc1d3:0x362a4bb002d4c4e6!8m2!3d32.0637826!4d36.086606!15sCizYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5ICDYp9mE2LLYsdmC2KfYoSIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    public void free(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad+-+Zarqa,+Free+Zone+Branch/@32.027174,35.8998609,11z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSAg2KfZhNiy2LHZgtin2KE!3m5!1s0x151b7364dddc1e35:0xf71fb4e1191442eb!8m2!3d32.0899988!4d36.213798!15sCizYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5ICDYp9mE2LLYsdmC2KfYoSIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }

    public void New(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+al+Etihad/@32.027174,35.8998609,11z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSAg2KfZhNiy2LHZgtin2KE!3m5!1s0x151b6555cb3a8471:0x7a0689f9ef94d12d!8m2!3d32.0857298!4d36.0863448!15sCizYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5ICDYp9mE2LLYsdmC2KfYoSIDiAEBWi0iK9io2YbZgyDYp9mE2KPYqtit2KfYryDZgdix2Lkg2KfZhNiy2LHZgtin2KGSAQRiYW5rmgEjQ2haRFNVaE5NRzluUzBWSlEwRm5TVVJUYldScWNFcEJFQUU"));
        startActivity(intent);
    }

    public void Army(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Bank+of+Jordan/@32.027174,35.8998609,11z/data=!4m9!1m2!2m1!1z2KjZhtmDINin2YTYo9iq2K3Yp9ivINmB2LHYuSAg2KfZhNiy2LHZgtin2KE!3m5!1s0x151b73aba2d8245f:0x1a35c9ec3ceabe5c!8m2!3d32.0896744!4d36.2152887!15sCizYqNmG2YMg2KfZhNij2KrYrdin2K8g2YHYsdi5ICDYp9mE2LLYsdmC2KfYoSIDiAEBkgEEYmFuaw"));
        startActivity(intent);
    }
}
/* Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(""));
        startActivity(intent);*/