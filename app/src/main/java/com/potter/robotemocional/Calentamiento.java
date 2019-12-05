package com.potter.robotemocional;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.GridLayout;
import android.widget.TextView;

public class Calentamiento extends AppCompatActivity {

    private TextView toolBar_Title;
    GridLayout mainGrid;
    private CardView s1,s2,s3,s4,s5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calentamiento);
        toolBar_Title = findViewById(R.id.toolbar_title);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolBar_Title.setText("Calentamiento");
        toolBar_Title.setTextSize(24);
        toolBar_Title.setTextColor(getResources().getColor(R.color.black));
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        s1 = findViewById(R.id.s1);
        s1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        s2 = findViewById(R.id.s2);
        s2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        s3 = findViewById(R.id.s3);
        s3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        s4 = findViewById(R.id.s4);
        s4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        s5 = findViewById(R.id.s5);
        s5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });


    }

    public String PostCal(String calent){
        return String.valueOf(Log.d("calentamiento", calent));
    }
}
