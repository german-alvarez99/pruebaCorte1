package com.example.pruebacorte1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ClipData;
import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;

import com.example.pruebacorte1.R;

public class MainActivity2 extends AppCompatActivity {

    EditText txt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txt=findViewById(R.id.txt);
        Intent i = getIntent();
        txt.setText(i.getStringExtra("codigo"));
    }
}