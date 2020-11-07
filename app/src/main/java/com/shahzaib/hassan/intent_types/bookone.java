package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class bookone extends AppCompatActivity {

    PDFView bookone_pdf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bookone);

        bookone_pdf = findViewById(R.id.book_one);
        bookone_pdf.fromAsset("book Mam.pdf").load();
    }
}