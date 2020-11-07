package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pdfviewer extends AppCompatActivity {

    Button btn_bookone,btn_booktwo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdfviewer);

        btn_bookone = findViewById(R.id.btn_bookone);
        btn_booktwo = findViewById(R.id.btn_booktwo);

        btn_bookone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pdfviewer.this,bookone.class);
                startActivity(intent);

            }
        });

        btn_booktwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(pdfviewer.this,booktwo.class);
                startActivity(intent);

            }
        });
    }
}