package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class store extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_store);
        ((ImageView) findViewById(R.id.mp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(store.this, menu.class);
                startActivity(menu);
            }
        });
        ((ImageView) findViewById(R.id.sp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(store.this, settings.class);
                startActivity(settings);
            }
        });
        ((ImageView) findViewById(R.id.get)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(store.this, "Added To Basket", Toast.LENGTH_SHORT).show();
            }
        });
    }
}