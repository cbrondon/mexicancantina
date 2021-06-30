package com.example.orderapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class Selector extends AppCompatActivity {
    Button btn1, btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selector);
        ActionBar actionBar = getSupportActionBar();

        actionBar.hide();
        btn1 = findViewById(R.id.btnCA);
        btn2 = findViewById(R.id.btnPL);


        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Selector.this, Inicio.class);
                startActivity(intent);
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Selector.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }
}