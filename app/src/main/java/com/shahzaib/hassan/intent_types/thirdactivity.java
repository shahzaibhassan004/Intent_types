package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class thirdactivity extends AppCompatActivity {

    TextView marqueetext;
    Button move_next;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirdactivity);
        marqueetext = findViewById(R.id.marqueetext);
        marqueetext.setSelected(true);
        move_next =findViewById(R.id.movenext);
        move_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(thirdactivity.this,addtwonumber.class);
                startActivity(intent);
            }
        });

    }
}