package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class thirdactivity extends AppCompatActivity {

    TextView marqueetext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        marqueetext = findViewById(R.id.marqueetext);
        marqueetext.setSelected(true);
    }
}