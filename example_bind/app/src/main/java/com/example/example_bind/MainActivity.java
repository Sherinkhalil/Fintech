package com.example.example_bind;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ComponentName;
import android.content.Intent;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyService_bind myService_bind;
        boolean mBound = false;

    }
    public class LocalBinder extends Binder {
            MyService_bind getService() {
                // Return this instance of LocalService so clients can call public methods
                return MyService_bind.this;
            }
        }

    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }
}