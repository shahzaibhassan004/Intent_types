package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class addtwonumber extends AppCompatActivity {

    TextView display;
    EditText num_1,num_2;
    Button btn_sum,btn_hide,btn_show,btn_pdf,btn_circuler_image;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addtwonumber);
        display = findViewById(R.id.display);
        btn_show = findViewById(R.id.btn_show);
        btn_hide = findViewById(R.id.btn_hide);
        imageView = findViewById(R.id.custom_Image_view);
        num_1 = findViewById(R.id.numberone);
        num_2 = findViewById(R.id.numbertwo);
        btn_pdf = findViewById(R.id.btn_pdfactivity);
        btn_sum = findViewById(R.id.btn_sum);
        btn_circuler_image = findViewById(R.id.btn_circuler_image);
        btn_circuler_image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                circulerimage();
            }
        });
        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addnumber();
            }
        });
        btn_show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showimage();
            }
        });
        btn_hide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hideimage();
            }
        });
        btn_pdf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pdfmover();
            }
        });
    }
    public void circulerimage()
    {
        Intent intent = new Intent(addtwonumber.this,circulerimageview.class);
        startActivity(intent);
    }
    public void pdfmover()
    {
        Intent intent = new Intent(addtwonumber.this,pdfviewer.class);
        startActivity(intent);
    }

    public void addnumber()
    {
        double a = Double.parseDouble(num_1.getText().toString());
        double b = Double.parseDouble(num_2.getText().toString());
        double sum = a+b;
        display.setText(Double.toString(sum));
    }
    public void showimage()
    {
        imageView.setVisibility(View.VISIBLE);
    }
    public void hideimage()
    {
        imageView.setVisibility(View.GONE );
    }
}