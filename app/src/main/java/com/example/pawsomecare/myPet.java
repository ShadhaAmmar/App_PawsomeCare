package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class myPet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_pet);
        ((ImageView) findViewById(R.id.mp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(myPet.this, menu.class);
                startActivity(menu);
            }
        });
        ((ImageView) findViewById(R.id.sp)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent settings = new Intent(myPet.this, settings.class);
                startActivity(settings);
            }
        });

    }
}