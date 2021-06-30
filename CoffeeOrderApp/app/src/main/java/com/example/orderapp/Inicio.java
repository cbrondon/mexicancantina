package com.example.orderapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.NumberPicker;

public class Inicio extends AppCompatActivity {

    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        // custom toolbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        btn = findViewById(R.id.btnInicio);
        NumberPicker nb = findViewById(R.id.spin);

        nb.setMaxValue(20);
        nb.setMinValue(1);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Inicio.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}