package com.example.bravo_3aleeeek;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video);

        VideoView videoView=findViewById(R.id.video_bravoo);
        String videopath="android.resource://"+getPackageName()+"/"+R.raw.video;
        Uri uri=Uri.parse(videopath);
        videoView.setVideoURI(uri);

        MediaController m= new MediaController(this);
        videoView.setMediaController(m);
        m.setAnchorView(videoView);
        videoView.start();
    }
}