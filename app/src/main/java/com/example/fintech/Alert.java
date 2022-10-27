package com.example.fintech;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.RatingBar;
import android.widget.Toast;
import android.widget.RatingBar.OnRatingBarChangeListener;
public class Alert extends AppCompatActivity {

    RatingBar rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alert);

        rb = (RatingBar) findViewById(R.id.myRatingBar);
        rb.setOnRatingBarChangeListener(new OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float rating, boolean b) {
                Toast.makeText(getApplicationContext(),Float.toString(rating),Toast.LENGTH_LONG).show();
            }
        });
    }
}