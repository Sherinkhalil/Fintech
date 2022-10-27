package com.example.fintech;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

//            String user = userName.getText().toString().trim();
//            String pass = password.getText().toString().trim();
//            if (user.equals("fintech") && pass.equals("fintech")) {
//                Toast.makeText(this, "username and password matched!", Toast.LENGTH_LONG).show();
//            } else {
//                Toast.makeText(this, "username and password do not match!", Toast.LENGTH_LONG).show();
                Intent intent = new Intent(this, account.class);
                startActivity(intent);
            }


        }

//}