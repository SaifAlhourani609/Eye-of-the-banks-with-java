package com.example.eyeofthebanks;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class amman_ealb extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_amman_ealb);
    }

    public void main_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egyptian+Arab+Land+Bank+%26+ATM/@31.970995,35.9057393,17z/data=!4m12!1m6!3m5!1s0x151ca00cc4662b81:0x834d4086ef9fc742!2sEgyptian+Arab+Land+Bank+%26+ATM!8m2!3d31.970995!4d35.907928!3m4!1s0x151ca00cc4662b81:0x834d4086ef9fc742!8m2!3d31.970995!4d35.907928"));
        startActivity(intent);
    }

    public void medical_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egyptian+Arab+Land+Bank+EALB/@31.9788442,35.8283853,19.86z/data=!4m18!1m12!4m11!1m4!2m2!1d35.8279764!2d32.0576272!4e1!1m4!2m2!1d35.828567!2d31.978786!4e1!3e0!3m4!1s0x151ca18478d5b787:0xf98ef7255a73aa87!8m2!3d31.9787104!4d35.8285619"));
        startActivity(intent);
    }

    public void jabal_alHussein_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egyptian+Arab+Land+Bank+EALB/@31.9560192,35.8595866,20.83z/data=!4m18!1m12!4m11!1m4!2m2!1d35.8281175!2d32.0575943!4e1!1m4!2m2!1d35.859673!2d31.956171!4e1!3e0!3m4!1s0x151ca103f2c92f39:0x48eb0c45bdd5795b!8m2!3d31.9560993!4d35.8597016"));
        startActivity(intent);
    }

    public void shumaysani_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egyptian+Arab+Land+Bank+%26+ATM/@31.9707975,35.9078703,19.22z/data=!4m18!1m12!4m11!1m4!2m2!1d35.8280892!2d32.0573954!4e1!1m4!2m2!1d35.907947!2d31.970972!4e1!3e0!3m4!1s0x151ca00cc4662b81:0x834d4086ef9fc742!8m2!3d31.970995!4d35.907928"));
        startActivity(intent);
    }

    public void mecca_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Mecca+Mall/@31.9775961,35.8432693,21z/data=!4m18!1m12!4m11!1m4!2m2!1d35.8279705!2d32.0574971!4e1!1m4!2m2!1d35.843258!2d31.977631!4e1!3e0!3m4!1s0x151ca19bc3e1d1ed:0xc7b138ad3619f9b8!8m2!3d31.9775067!4d35.84328"));
        startActivity(intent);
    }

    public void city_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/City+Mall/@32.0216381,35.7805709,13z/data=!4m19!1m13!4m12!1m4!2m2!1d35.8171296!2d32.068897!4e1!1m6!1m2!1s0x151ca185283dfb89:0x611dda32fcd10faa!2z2LPZitiq2Yog2YXZiNmE4oCt!2m2!1d35.8376748!2d31.9804732!3m4!1s0x151ca185283dfb89:0x611dda32fcd10faa!8m2!3d31.9804732!4d35.8376748"));
        startActivity(intent);
    }

    public void downtown_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egyptian+Arab+Land+Bank+EALB+-+ATM/@31.9495705,35.9388856,16.67z/data=!4m9!1m2!2m1!1sEALB+ATM!3m5!1s0x151b5fa2d920d555:0xbd657b46e3b94fc7!8m2!3d31.9490888!4d35.9395375!15sCghFQUxCIEFUTSIDiAEB"));
        startActivity(intent);
    }

    public void marka_EALB(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/maps/place/Egyptian+Arab+Land+Bank+EALB/@31.9784511,35.9825256,15z/data=!4m9!1m2!2m1!1z2KfZhNio2YbZgyDYp9mE2LnZgtin2LHZiiDYp9mE2YXYtdix2Yog2YXYp9ix2YPYpyA!3m5!1s0x151b60bda4c2559f:0x9a82b323d0ed80ac!8m2!3d31.9785763!4d35.9823704!15sCjHYp9mE2KjZhtmDINin2YTYudmC2KfYsdmKINin2YTZhdi12LHZiiDZhdin2LHZg9inkgEEYmFuaw"));
        startActivity(intent);
    }
}