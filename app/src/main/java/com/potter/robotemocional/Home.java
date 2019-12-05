package com.potter.robotemocional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView toolBar_Title;
    private Button calentamientoBtn, baileBtn, facialBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        toolBar_Title = findViewById(R.id.toolbar_title);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolBar_Title.setText("Elegir actividad");
        toolBar_Title.setTextSize(24);
        toolBar_Title.setTextColor(getResources().getColor(R.color.black));
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

        calentamientoBtn = findViewById(R.id.calentamientoBtn);
        calentamientoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calen =new Intent(getApplicationContext(),Calentamiento.class);
                startActivity(calen);
            }
        });
        baileBtn = findViewById(R.id.baileBtn);
        baileBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent baile =new Intent(getApplicationContext(),Baile.class);
                startActivity(baile);
            }
        });

        facialBtn = findViewById(R.id.facialBtn);
        facialBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent facial =new Intent(getApplicationContext(),Facial.class);
                startActivity(facial);
            }
        });
    }
}
