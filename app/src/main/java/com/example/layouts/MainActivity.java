package com.example.layouts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnLineal;
    Button btnRelative;
    Button btnFrame;
    Button btnTable;
    Button btnAbsolute;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initComponents();

        Intent intentLineal = new Intent(this, Lineal.class);
        Intent intentRelative = new Intent(this, Relative.class);
        Intent intentFrame = new Intent(this, Frame.class);
        Intent intentTable = new Intent(this, Table.class);
        Intent intentAbsolute = new Intent(this, Absolute.class);

        btnLineal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentLineal);
            }
        });

        btnRelative.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentRelative);
            }
        });

        btnFrame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentFrame);
            }
        });

        btnTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentTable);
            }
        });

        btnAbsolute.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentAbsolute);
            }
        });

    }

    public void initComponents(){
        btnLineal = findViewById(R.id.btnLineal);
        btnRelative = findViewById(R.id.btnRelative);
        btnFrame = findViewById(R.id.btnFrame);
        btnTable = findViewById(R.id.btnTable);
        btnAbsolute = findViewById(R.id.btnAbsolute);
    }
}