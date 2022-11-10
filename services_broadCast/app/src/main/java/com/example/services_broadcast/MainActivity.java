package com.example.services_broadcast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    MyReciever myReciever = new MyReciever;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
     @Override 
    protected void onStart() {
           super.onStart();
           IntentFilter newfilter = new IntentFilter(Intent.ACTION_BATTERY_LOW);
           registerReceiver(myReciever, newfilter);
         }

    @Override
    protected void onStop(){
        super.onStop();
        unregisterReceiver(myReciever);
        }
    }
