package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class imagecirculeractivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_play,btn_stop,btn_pause;
    MediaPlayer mediaPlayer;
    int pausecurrentpostion;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_imagecirculeractivity);
        btn_pause = findViewById(R.id.btn_pause);
        btn_play = findViewById(R.id.btn_play);
        btn_stop = findViewById(R.id.btn_stop);
        imageView = findViewById(R.id.image_view_circuler);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent intent = new Intent(imagecirculeractivity.this,genderradiobutton.class);
            startActivity(intent);
            }
        });

        btn_play.setOnClickListener(this);
        btn_pause.setOnClickListener(this);
        btn_stop.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.btn_play:
                if (mediaPlayer==null){
                mediaPlayer = MediaPlayer.create(getApplicationContext(),R.raw.music);
                mediaPlayer.start();
                }
                else if (!mediaPlayer.isPlaying()){
                    mediaPlayer.seekTo(pausecurrentpostion);
                    mediaPlayer.start();
                }
                break;
            case  R.id.btn_pause:
                if (mediaPlayer!=null){
                    mediaPlayer.pause();
                    pausecurrentpostion = mediaPlayer.getCurrentPosition();

                }
                break;
            case R.id.btn_stop:
                if (mediaPlayer!=null){
                mediaPlayer.stop();
                mediaPlayer=null;
                }
                break;
        }
    }

}