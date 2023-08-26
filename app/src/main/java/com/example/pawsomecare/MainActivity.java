package com.example.pawsomecare;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

import com.example.pawsomecare.ui.login.LoginActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Starting", Toast.LENGTH_SHORT).show();
                Intent login = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(login);
            }
        });

        VideoView videoView=findViewById(R.id.video_view);
        String videoPath="android.resource://"+ getPackageName() +"/"+R.raw.pawsome;
        Uri uri= Uri.parse(videoPath);
        videoView.setVideoURI(uri);

        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);
        videoView.start();

    }

}
