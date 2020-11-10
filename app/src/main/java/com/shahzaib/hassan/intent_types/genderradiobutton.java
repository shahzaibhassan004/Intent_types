package com.shahzaib.hassan.intent_types;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class genderradiobutton extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener{

    RadioGroup radioGroup;
    Button btn_submit,btn_transfer;
    String gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genderradiobutton);
        radioGroup = findViewById(R.id.btn_group);
        btn_submit = findViewById(R.id.btn_submit);
        radioGroup.setOnCheckedChangeListener(this);
        btn_transfer = findViewById(R.id.btn_transferdata);
        btn_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(genderradiobutton.this,transferdatabyintent.class);
                startActivity(intent);
            }
        });
        btn_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(genderradiobutton.this,gender, Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
            switch (checkedId){
                case R.id.btn_female:
                {
                    gender ="Female";
                }
                    break;
                case R.id.btn_male:
                {
                    gender = "Male";
                }
                    break;
                case R.id.btn_other:
                {
                    gender = "Other";
                }
                    break;
            }
    }
}