package com.example.my_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.material.textfield.TextInputEditText;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Registration_Form extends AppCompatActivity  {
    EditText editTextName;
    EditText editTextSurname;
    EditText editTextCountry;
    EditText editTextEmail;
    EditText editTextPassword;
    Button buttonRegister;
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_form);


        editTextEmail =(EditText) findViewById(R.id.txtEmail);
        editTextPassword=(EditText) findViewById(R.id.TxtPassword);

        mAuth = FirebaseAuth.getInstance();
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                createUser();

            }
        });

        }
        private void createUser(){
        String email = editTextEmail.getText().toString();
        String password = editTextPassword.getText().toString();


        if (TextUtils.isEmpty(email)){
            editTextEmail.setError("Email cannot be empty");
            editTextEmail.requestFocus();

        }else if(TextUtils.isEmpty(password)) {
            editTextPassword.setError("Password cannot be empty");
            editTextPassword.requestFocus();
        }else{
            mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Registration_Form.this, "User registered successfully", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(Registration_Form.this, Login_page.class));
                    }else{
                        Toast.makeText(Registration_Form.this, "Registration Error" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();

                    }
                }
            });
        }
    }
}