package com.nehvin.s04e51videos;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;
import android.net.Uri;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.demovideo);
//        videoView.setVideoURI(Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.demovideo));
//
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(videoView);
        videoView.setMediaController(mediaController);

        videoView.start();
    }
}
