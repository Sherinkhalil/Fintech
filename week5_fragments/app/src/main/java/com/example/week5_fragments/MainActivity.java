package com.example.week5_fragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TableLayout;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {
    Button button1,button2;
    TabLayout tab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tab = findViewById(R.id.tab);

        button1= findViewById(R.id.btn1);
        button2= findViewById(R.id.btn2);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.layout_f, new Fragment1());
        fragmentTransaction.commit();

        fragmentTransaction.replace(R.id.layout_f, new Fragment2());
        fragmentTransaction.commit();
        tab.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                switch (tab.getPosition()) {
                    case 0:
                        getSupportFragmentManager().beginTransaction().replace(R.id.layout_f,
                                new Fragment1()).commit();
                    case 1:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.layout_f,
                                        new Fragment2()).commit();

                    case 2:
                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.layout_f, new Fragment3()).commit();
                }
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


        }

    }
