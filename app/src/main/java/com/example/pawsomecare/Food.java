package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Food extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food);
        ((ImageView) findViewById(R.id.mp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(Food.this, menu.class);
                startActivity(menu);
            }
        });
        ((ImageView) findViewById(R.id.sp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(Food.this, settings.class);
                startActivity(settings);
            }
        });
        ((ImageView) findViewById(R.id.f1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent can = new Intent(Food.this, caneat.class);
                startActivity(can);
            }
        });
        ((ImageView) findViewById(R.id.f2)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cant = new Intent(Food.this, canteat.class);
                startActivity(cant);
            }
        });
        ((ImageView) findViewById(R.id.f3)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shop = new Intent(Food.this, store.class);
                startActivity(shop);
            }
        });
    }
}