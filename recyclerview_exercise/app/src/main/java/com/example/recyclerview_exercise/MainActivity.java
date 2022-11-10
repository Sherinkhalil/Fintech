package com.example.recyclerview_exercise;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.os.PersistableBundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    String str1[], str2[] ,str3[], str4[];
    int images[] ={R.drawable.restarant, R.drawable.pubs, R.drawable.park,
            R.drawable.transport, R.drawable.hotel, R.drawable.englis, R.drawable.cork_96fm, R.drawable.blarney};

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        str1 = getResources().getStringArray(R.array.City_Places);
        str2 = getResources().getStringArray(R.array.ABOUT);
        str3=getResources().getStringArray(R.array.Addresses);
        str4 = getResources().getStringArray(R.array.Visit);

        RecyclerView_Adapter myRecyclerAdapter = new RecyclerView_Adapter(this, str1, str2,str3,str4,images);

        recyclerView.setAdapter(myRecyclerAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this ));
}
}