package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class canteat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_canteat);
        ((ImageView) findViewById(R.id.mp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(canteat.this, menu.class);
                startActivity(menu);
            }
        });
        ((ImageView) findViewById(R.id.sp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(canteat.this, settings.class);
                startActivity(settings);
            }
        });
    }
}