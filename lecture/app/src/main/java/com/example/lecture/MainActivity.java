package com.example.lecture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MyAdappter.ItemClickListener {
    MyAdappter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("Audi");
        myList.add("Audi");
        myList.add("Audi");
        myList.add("Toyota");
        RecyclerView rv = findViewById(R.id.rvCars);
        rv.setLayoutManager(new LinearLayoutManager(this));
        myAdapter = new MyAdappter(MainActivity.this, myList) ;
        myAdapter.setClickListener(this);
        rv.setAdapter(myAdapter);
    }

    @Override
    public void onItemClick(View view, int position) {
        Toast.makeText(this, "You clicked" +myAdapter.getItem(position)+"on row number" +
               position, Toast.LENGTH_SHORT ).show();

   

    }
}