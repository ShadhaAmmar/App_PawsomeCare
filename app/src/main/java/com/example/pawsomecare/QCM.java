package com.example.pawsomecare;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class QCM extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qcm);
        ((ImageView) findViewById(R.id.mp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(QCM.this, menu.class);
                startActivity(menu);
            }
        });
        ((ImageView) findViewById(R.id.sp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(QCM.this, settings.class);
                startActivity(settings);
            }
        });
        Button myButton = findViewById(R.id.chien);
        myButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://animoscope.com/analyser-symptome-animal/?gclid=Cj0KCQjwwtWgBhDhARIsAEMcxeCd_CRdMEgmgFKBqWcowzHSFahQUftpiAiak_7KYd1GKH57OS0nZlEaAvvrEALw_wcB";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });
        Button myButton2 = findViewById(R.id.chat);
        myButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://animoscope.com/analyser-symptome-animal/chat/?gclid=Cj0KCQjwwtWgBhDhARIsAEMcxeEe8cH83Qw5YhZrU5GKd5b5mCHIZ13l6y9OxKvD6zKU-M2C-FrScZgaAg5jEALw_wcB";
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse(url));
                startActivity(intent);
            }
        });


    }
}