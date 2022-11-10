package com.example.demo_services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void startService(View v){
        startService(new Intent(this, my_service.class));

    }
    public void stopService(View v){
        stopService(new Intent(this, my_service.class));
    }
}