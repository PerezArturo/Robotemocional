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

public class Baile extends AppCompatActivity {

    private TextView toolBar_Title;
    GridLayout mainGrid;
    private CardView b1,b2,b3,b4,b5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_baile);
        toolBar_Title = findViewById(R.id.toolbar_title);
        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("");
        toolBar_Title.setText("Baile");
        toolBar_Title.setTextSize(24);
        toolBar_Title.setTextColor(getResources().getColor(R.color.black));
        toolbar.setBackgroundColor(getResources().getColor(R.color.white));
        setSupportActionBar(toolbar);

        b1 = findViewById(R.id.b1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.b2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        b3 = findViewById(R.id.b3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        b4 = findViewById(R.id.b4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PostCal("a");
                Uri uri = Uri.parse("http://10.0.0.4:5000/a");
                Intent intent =new Intent(Intent.ACTION_VIEW,uri);
                startActivity(intent);
            }
        });

        b5 = findViewById(R.id.b5);
        b5.setOnClickListener(new View.OnClickListener() {
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
        return String.valueOf(Log.d("baile", calent));
    }
}
