package com.example.services_broadcast;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyReciever extends Service {
    public MyReciever() {
    }

    public void onRecieve(Context context, Intent intent){
        String intentAction = intent.getAction();
        if(intentAction == Intent.ACTION_BATTERY_LOW){
            Toast.makeText(context, "Battery Low", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}