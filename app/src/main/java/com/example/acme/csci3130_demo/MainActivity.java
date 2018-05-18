package com.example.acme.csci3130_demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void copyText(View v){
        EditText entry = findViewById(R.id.editText);
        TextView textView = findViewById(R.id.textView);
        String curEntry = entry.getText().toString();
        textView.setText(curEntry);
    }
}
