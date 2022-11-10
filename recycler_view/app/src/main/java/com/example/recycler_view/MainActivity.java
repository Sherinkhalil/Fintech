package com.example.recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.recycler_view.my_recycler_view.NormalRecyclerView;

public class MainActivity extends AppCompatActivity  {
    TextView txtView_restaurant;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtView_restaurant = findViewById(R.id.txt_v_rest);
        txtView_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, NormalRecyclerView.class);
                startActivity(i);
            }
        });

    }
}