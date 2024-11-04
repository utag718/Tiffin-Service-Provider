package com.example.mad_project;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class tiffin_house extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tiffin_house);
        Button subs_veg= (Button) findViewById(R.id.vaishali_veg_subs);
        Button subs_nonveg=(Button) findViewById(R.id.vaishali_nonveg_subs);
        subs_veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(tiffin_house.this, QR_CODE.class);
                startActivity(i);
            }
        });
        subs_nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(tiffin_house.this, QR_CODE1.class);
                startActivity(i);

            }
        });
        };
    }
