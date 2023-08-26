package com.example.pawsomecare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.example.pawsomecare.ui.login.LoginActivity;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ((Button) findViewById(R.id.log)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(SignUp.this, "Log In", Toast.LENGTH_SHORT).show();
                Intent login = new Intent(SignUp.this, LoginActivity.class);
                startActivity(login);
            }
        });
        ((Button) findViewById(R.id.sign)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(SignUp.this, home.class);
                startActivity(home);
            }
        });
    }
}