package com.example.orderapp;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Model> modelList;
    RecyclerView recyclerView, recyclerView2;
    OrderAdapter mAdapter;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.boton);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SummaryActivity.class);
                startActivity(intent);
            }
        });

        // custom toolbar
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        // creating an arraylist

        modelList = new ArrayList<>();
        modelList.add(new Model("Té verde", getString(R.string.greentea), R.drawable.greentea ));
        modelList.add(new Model("Café Latte", getString(R.string.latte), R.drawable.late));
        modelList.add(new Model("Malteada de naranja", getString(R.string.orangesmoothie), R.drawable.orange));
        modelList.add(new Model("Malteada de vainilla", getString(R.string.orangevanilla), R.drawable.orangevanilla));
        modelList.add(new Model("Cappucino", getString(R.string.cappcuni), R.drawable.cappcunio));
        modelList.add(new Model("Thai Tea", getString(R.string.thaitea), R.drawable.thaitea));
        modelList.add(new Model("Té natural", getString(R.string.tea), R.drawable.tea));
        modelList.add(new Model("Frappé", getString(R.string.bubbletea), R.drawable.milk));
        modelList.add(new Model("Matcha Chiato", getString(R.string.match), R.drawable.match));

        // recyclerview
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(null));
        // adapter
        mAdapter = new OrderAdapter(this, modelList);
        recyclerView.setAdapter(mAdapter);







    }
}