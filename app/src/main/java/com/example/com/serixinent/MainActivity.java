package com.example.com.serixinent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void ClickMe(View view) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("stroke","Hello from firs Activity");
        startActivity(intent);
    }

    public void StartService(View view) {
        startService(
                new Intent(this, MyService.class)
        );
    }

    public void StopService(View view) {
        stopService(
                new Intent(this, MyService.class)
        );

    }
}
