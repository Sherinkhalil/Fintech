package com.example.lab4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void open_dialer(View view){
        Intent intent = new Intent(Intent.ACTION_CALL_BUTTON);
        try {
            startActivity(intent);

        }catch (ActivityNotFoundException e) {


        }       }

        public void open_web(View view){
          Uri uri = Uri.parse("http://www.google.com");
          Intent intent2 = new Intent(Intent.ACTION_VIEW, uri);
          try{
              startActivity(intent2);

          }catch (ActivityNotFoundException e){

          }
    }


    public void open_map(View view) {
        Uri location = Uri.parse("geo:0,0?q=1600+Amphitheatre+Parkway,+Mountain+View,+California");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        mapIntent.setPackage("com.google.android.apps.maps");
        try {
            startActivity(mapIntent);

        } catch (ActivityNotFoundException e) {

        }
    }
    public void shareText(View view){
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "message here");
            try {
                startActivity(Intent.createChooser(shareIntent, "Share via"));
            }catch (ActivityNotFoundException e){

     }
    }

    }
