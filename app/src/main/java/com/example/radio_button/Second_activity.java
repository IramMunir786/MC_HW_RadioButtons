package com.example.radio_button;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Second_activity extends AppCompatActivity {

    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activity);

        textView=findViewById(R.id.textViewResults1);
        Intent intent=getIntent();
        String str=intent.getStringExtra("key_value");
        textView.setText(str);
    }
}