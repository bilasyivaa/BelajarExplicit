package com.si5a.belajarexplicit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        TextView tvNama;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        getSupportActionBar().setTitle("Layout B");
        tvNama = findViewById(R.id.tv_nama);


        Intent terima = getIntent();
        String yNama = terima.getStringExtra("xNama");
        tvNama.setText(yNama);
    }
}