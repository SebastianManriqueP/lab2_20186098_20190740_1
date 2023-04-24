package com.example.lab2_20186098_20190740;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageButton;
import android.widget.ImageView;

public class detalleEvento extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_evento);


        ImageButton imagenBtn = findViewById(R.id.imageViewBtn);
        imagenBtn.setOnClickListener(view -> {
            onBackPressed();
        });
    }



}