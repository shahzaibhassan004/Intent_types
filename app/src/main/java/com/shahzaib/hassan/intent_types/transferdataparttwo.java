package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class transferdataparttwo extends AppCompatActivity {

    TextView number_textview,data_textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transferdataparttwo);

        number_textview = findViewById(R.id.number_textview);
        data_textview = findViewById(R.id.data_textview);

        String getdata = getIntent().getStringExtra("data_detail");
        int numberdata = getIntent().getIntExtra("number",0);
        number_textview.setText(""+numberdata);
        data_textview.setText(getdata);
}
}