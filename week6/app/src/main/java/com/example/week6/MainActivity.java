package com.example.week6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {


        FloatingActionButton FAB;
        View myLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myLayout= findViewById(R.id.mylayout);
        FAB = findViewById(R.id.fab1);
        FAB.setOnClickListener(
                new OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    //    Toast.makeText(MainActivity.this, "person Added", Toast.LENGTH_SHORT).show();
                    myLayout.setBackgroundColor(getColor(R.color.purple_200));
                    }
                });
      //  Snackbar.make(findViewById(R.id.mylayout), "Replace with your own action", Snackbar.LENGTH_SHORT).setAction("Action", null).show();
        Snackbar mySnackbar = Snackbar.make(findViewById(R.id.mylayout),
                "msg here", Snackbar.LENGTH_SHORT);
        mySnackbar.setAction("action here", new MyUndoListener());
        mySnackbar.show();
    }

        public class MyUndoListener implements OnClickListener{
            @Override
            public void onClick(View view) {
                myLayout.setBackgroundColor(getColor(R.color.white));
            }
    }


    }
