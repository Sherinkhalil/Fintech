package com.example.group_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class Login_page extends AppCompatActivity {
    Button login;
    EditText userName, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);
        login = (Button) findViewById(R.id.btnLogin);
        userName = (EditText) findViewById(R.id.edit_txt_usr);
        password = (EditText) findViewById(R.id.edit_txt_pass);


        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaccount();

            }
        });

    }


    public void openaccount() {
        Intent intent = new Intent(this, account.class);
        startActivity(intent);
    }
}