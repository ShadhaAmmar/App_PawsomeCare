package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        ((ImageView) findViewById(R.id.homeic)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(menu.this, home.class);
                startActivity(home);
            }
        });
        ((ImageView) findViewById(R.id.mypet)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mypeti = new Intent(menu.this, mypeti.class);
                startActivity(mypeti);
            }
        });
        ((ImageView) findViewById(R.id.myvet)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myveti = new Intent(menu.this, myveti.class);
                startActivity(myveti);
            }
        });
        ((ImageView) findViewById(R.id.QCM)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent qcm = new Intent(menu.this, qcmi.class);
                startActivity(qcm);
            }
        });
        ((ImageView) findViewById(R.id.music)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mus = new Intent(menu.this, musici.class);
                startActivity(mus);
            }
        });
        ((ImageView) findViewById(R.id.trainpet)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent train = new Intent(menu.this, traini.class);
                startActivity(train);
            }
        });
        ((ImageView) findViewById(R.id.food)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent food = new Intent(menu.this, foodi.class);
                startActivity(food);
            }
        });

    }
}