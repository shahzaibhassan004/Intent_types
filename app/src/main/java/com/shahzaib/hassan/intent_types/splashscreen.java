package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class splashscreen extends AppCompatActivity {
    ImageView imageView;
    Animation topanim,buttomanim;
    TextView textView;
    private static int splash_screen =5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splashscreen);
        imageView = findViewById(R.id.image_view);
        textView = findViewById(R.id.appname);
        topanim = AnimationUtils.loadAnimation(this,(R.anim.top_animation));
        buttomanim = AnimationUtils.loadAnimation(this,(R.anim.buttom_animation));
        imageView.setAnimation(topanim);
        textView.setAnimation(buttomanim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(splashscreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },splash_screen);

    }
}