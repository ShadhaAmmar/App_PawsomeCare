package com.example.pawsomecare;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.pawsomecare.databinding.ActivityProfilBinding;

public class profil extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityProfilBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);
        ((Button) findViewById(R.id.submit)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(profil.this, "Submitted", Toast.LENGTH_SHORT).show();
                Intent home = new Intent(profil.this, home.class);
                startActivity(home);
            }
        });

    }

}