package com.example.lab6;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager2 viewPager2 = findViewById(R.id.view_page2);
        MyPageViewerAdapter myPageViewerAdapter = new MyPageViewerAdapter(this);
        viewPager2.setAdapter(myPageViewerAdapter);


    }
}