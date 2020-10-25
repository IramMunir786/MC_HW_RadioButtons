package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RadioGroup radioGroup1,radioGroup2;
    RadioButton radioButton1,radioButton2;
    CheckBox checkBox1,checkBox2,checkBox3,checkBox4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup1 = findViewById(R.id.radioGroup1);
        radioGroup2 = findViewById(R.id.radioGroup2);


    }

    public void ShowSelection(View view) {

        int checked1 = radioGroup1.getCheckedRadioButtonId();
        radioButton1 = findViewById(checked1);

        int checked2 = radioGroup2.getCheckedRadioButtonId();
        radioButton2 = findViewById(checked2);

        checkBox1= findViewById(R.id.checkbox_1);
        checkBox2= findViewById(R.id.checkbox_2);
        checkBox3= findViewById(R.id.checkbox_3);
        checkBox4= findViewById(R.id.checkbox_4);


        String text1=radioButton1.getText().toString();
        String text2=radioButton2.getText().toString();

        String result=text1+","+text2;

        if (checkBox1.isChecked()){
            result=result+","+checkBox1.getText().toString();
        }
        if (checkBox2.isChecked()){
            result=result+","+checkBox2.getText().toString();
        }
        if (checkBox3.isChecked()){
            result=result+","+checkBox3.getText().toString();
        }
        if (checkBox4.isChecked()){
            result=result+" and "+checkBox4.getText().toString();
        }

        result=result+" are selected";

        Intent intent=new Intent(getApplicationContext(),Second_activity.class);
        intent.putExtra("key_value",result);
        startActivity(intent);


    }

}