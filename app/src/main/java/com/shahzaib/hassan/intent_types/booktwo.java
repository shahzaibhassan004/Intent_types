package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class booktwo extends AppCompatActivity {

    PDFView booktwo_pdf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booktwo);

        booktwo_pdf = findViewById(R.id.book_two);
        booktwo_pdf.fromAsset("Pir e Kamil.pdf").load();
    }
}