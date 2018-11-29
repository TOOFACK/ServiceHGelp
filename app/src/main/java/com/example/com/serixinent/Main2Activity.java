package com.example.com.serixinent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        TextView text = findViewById(R.id.text);
        String textfrom1Activity = getIntent().getStringExtra("stroke");
        text.setText(textfrom1Activity);
    }
}
