package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class qcmi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_qcmi);
        ((ImageView) findViewById(R.id.t)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(qcmi.this, "QCM", Toast.LENGTH_SHORT).show();
                Intent logout = new Intent(qcmi.this, QCM.class);
                startActivity(logout);
            }
        });
    }
}