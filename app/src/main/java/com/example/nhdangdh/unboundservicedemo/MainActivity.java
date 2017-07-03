package com.example.nhdangdh.unboundservicedemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void startNewService(View view){
        Intent myIntent = new Intent(MainActivity.this, MyService.class);
        this.startService(myIntent);
    }

    public void stopNewService(View view){
        Intent myIntent = new Intent(MainActivity.this, MyService.class);
        this.stopService(myIntent);
    }
}
