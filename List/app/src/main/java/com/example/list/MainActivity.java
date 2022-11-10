package com.example.list;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.widget.ListView;
import android.app.Activity;
import android.widget.ArrayAdapter;
import android.view.Menu;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    // creating list of array  of strings...
    ListView simpleList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_main);

        String countryList[] = {"India", "China", "Australia", "Spain", "America", "NewZealand"};
        simpleList = (ListView) findViewById(R.id.my_listView);
       /* ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview_layout, R.id.textView, countryList);
        simpleList.setAdapter(arrayAdapter);*/

    }


}