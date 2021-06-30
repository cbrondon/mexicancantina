package com.example.orderapp;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash_screen);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        Animation animation1 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_arriba);
        Animation animation2 = AnimationUtils.loadAnimation(this,R.anim.desplazamiento_abajo);

        TextView tv = findViewById(R.id.textView);
        ImageView iv = findViewById(R.id.imageView);
        TextView tv2 = findViewById(R.id.textView2);

        tv.setAnimation(animation2);
        iv.setAnimation(animation1);
        tv2.setAnimation(animation2);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashScreen.this, Selector.class);
                startActivity(intent);
                finish();
            }
        }, 8000);

    }
}