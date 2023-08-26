package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        ((ImageView) findViewById(R.id.homeic)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(settings.this, home.class);
                startActivity(home);
            }
        });
        ((ImageView) findViewById(R.id.imageView4)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(settings.this, "you've been logged out", Toast.LENGTH_SHORT).show();
                Intent logout = new Intent(settings.this, MainActivity.class);
                startActivity(logout);
            }
        });
        ((ImageView) findViewById(R.id.t)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logout = new Intent(settings.this, profil.class);
                startActivity(logout);
            }
        });
    }
}