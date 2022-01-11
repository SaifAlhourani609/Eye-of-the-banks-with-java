package com.example.eyeofthebanks;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        TextView textView = findViewById(R.id.url);
        String text = "You must read some of the policies related to the application before starting or even using";
        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View widget) {
                Toast.makeText(MainActivity.this, "All the information that was used in the application is correct information, one by one, so you can rest assured, dear user", Toast.LENGTH_LONG).show();
            }

            @Override
            public void updateDrawState(@NonNull TextPaint ds) {
                super.updateDrawState(ds);
                ds.setColor(Color.BLUE);
                ds.setHinting(22);
            }
        };
        ss.setSpan(clickableSpan1, 22, 35, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        textView.setText(ss);
        textView.setMovementMethod(LinkMovementMethod.getInstance());

      /*  ImageView lefticon =findViewById(R.id.left_icon);
        ImageView righticon =findViewById(R.id.right_icon);
        TextView titel =findViewById(R.id.toolbar);*/

        Button button = findViewById(R.id.b1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), activityb.class);
                startActivity(intent);
            }
        });
       /* YoYo.with(Techniques.StandUp)
                .duration(50)
                .repeat(1)
                .delay(500)
                .playOn(findViewById(R.id.tv));*/
       /* lefticon.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Toast.makeText(MainActivity.this,"Eye of Banks application welcomes you",Toast.LENGTH_LONG).show();
        }
    });
       righticon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Eye of Banks application welcomes you",Toast.LENGTH_LONG).show();
            }
        });
   */
    }



    public void iaa(View view) {
        Intent intent = new Intent(getBaseContext(), activitye.class);
        intent.putExtra("text", "Program name\n" +
                "\n" +
                "Eye of the Banks" + "\n" +
                "The reason for its name is due to the Al-Ain dictionary of Al-Khalil bin Ahmed Al-Farahidi, which is the first complete Arabic dictionary that reaches us.\n" +
                " Thus, the Banks Eye application is a complete application as it contains all the banks of the Hashemite Kingdom of Jordan and its branches in addition to the ATMs of each bank." + "\n" +
                "\n" +
                "About The Program" + "\n" +
                "\n" +
                "It is an electronic application that aims to collect all the Kingdom's banks and their branches and ATMs for each bank in one application and to locate each bank (with all its branches and ATMs) independently (with a special click) and to give information about each bank."
                + "\n" +
                "In addition to knowing the opening and closing times for each bank" + "\n" +
                "\n" +
                "App Idea" + "\n" +
                "Because there is no idea to collect all banks in this way." + "\n" +
                "\n" +
                "Features" + "\n" +
                "1.It contains all commercial and foreign banks" + "\n" +
                "2.The site is given directly" + "\n" +
                "3.Ease of use." + "\n" +
                "4.Clarity by design" + "\n" +
                "clarification....." + "\n"
                + "\n" + "Work was done directly on the lines of longitude and latitude, very accurately, and an appropriate dimension of the map was taken from the ground so that all dimensions and geographical locations were clarified."

                + "\n" +
                "The program contains many and many clicks, but all of them are very accurate"

        );
        startActivity(intent);
    }

    public void sendemail(View view) {
        /**
         * Send Email Using Implicit
         * @param v
         */
        Intent i = new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mailto:"));
        String[] to = {" ghaidabassam21@gmail.com"};
        i.putExtra(Intent.EXTRA_EMAIL, to);
        i.putExtra(Intent.EXTRA_SUBJECT, "Eye of the Banks");
        i.putExtra(Intent.EXTRA_TEXT, "Dear users, please send all comments or suggestions related to the application\n" +
                "Thank you...........");
        i.setType("message/rfc822");
        Intent choose = Intent.createChooser(i, "send Email");
        startActivity(choose);
    }

}