package com.example.fintech;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.view.View;
import android.widget.Button;

import com.example.fintech.databinding.ActivityMainBinding;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class registration_confirm extends AppCompatActivity {
    Button btnView;

    @Override
    public void onCreate( Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);

        btnView = (Button)findViewById(R.id.btnViewAccount);
        btnView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openAccount();

            }
        });
    }

    public void openAccount(){
        Intent intent = new Intent(this, account.class);
        startActivity(intent);
    }
}