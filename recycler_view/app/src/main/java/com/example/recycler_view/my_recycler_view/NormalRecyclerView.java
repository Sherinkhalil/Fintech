package com.example.recycler_view.my_recycler_view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recycler_view.MyAdapter;
import com.example.recycler_view.MyRecyclerViewAdapter;
import com.example.recycler_view.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class NormalRecyclerView extends AppCompatActivity {
    RecyclerView normal_recycler;
    private MyRecyclerViewAdapter adapter;
    private ArrayList<MyAdapter> adapterArray;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal_recycler_view);

        normal_recycler = findViewById(R.id.normal_rec);

        normal_recycler.setLayoutManager(new LinearLayoutManager(this));
     adapterArray = new ArrayList();
     adapter = new MyRecyclerViewAdapter(this, adapterArray);
     normal_recycler.setAdapter(adapter);
     normal_recycler.addItemDecoration(new DividerItemDecoration(this,
             LinearLayoutManager.VERTICAL));
     createListData();
}

    private void createListData() {
        // add item into recycler view

        MyAdapter adapter = new MyAdapter("Earth", 150 , 10,12750);
        adapterArray.add(adapter);
    }
}