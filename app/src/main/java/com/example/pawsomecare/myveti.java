package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class myveti extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myveti);
        ((ImageView) findViewById(R.id.t)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(myveti.this, "MY VET", Toast.LENGTH_SHORT).show();
                Intent logout = new Intent(myveti.this, myVet.class);
                startActivity(logout);
            }
        });
    }
}