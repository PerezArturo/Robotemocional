package com.potter.robotemocional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class Facial extends AppCompatActivity {

    private TextView toolBar_Title;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facial);
        toolBar_Title = findViewById(R.id.toolbar_title);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolBar_Title.setText("Facial");
        toolBar_Title.setTextSize(24);
        toolBar_Title.setTextColor(getResources().getColor(R.color.black));
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);
    }
}
