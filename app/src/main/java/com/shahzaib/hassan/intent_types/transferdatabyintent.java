package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class transferdatabyintent extends AppCompatActivity {

    TextView textView;
    Button btn_add,btn_transfer;
    EditText editText;
    Integer index_value;
    String data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferdatabyintent);
        textView = findViewById(R.id.text_view_number);
        editText = findViewById(R.id.edit_text_detail);
        btn_add = findViewById(R.id.btn_add);
        btn_transfer = findViewById(R.id.btn_Transfer_data);
        index_value=0;
        btn_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               data = editText.getText().toString();
                Intent intent = new Intent(transferdatabyintent.this,transferdataparttwo.class);
                intent.putExtra("number",index_value);
                intent.putExtra("data_detail",data);
                startActivity(intent);
                index_value=0;

            }
        });
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                index_value++;
                textView.setText(""+index_value);
            }
        });
    }
}