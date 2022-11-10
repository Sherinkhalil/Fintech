package com.example.my_app;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.hardware.lights.LightState;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {
    DatabaseReference databaseReference;
    private Button buttonLogin, buttonRegistrstion;
    Button btnLogin = findViewById(R.id.btnLogin);
    FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mAuth = FirebaseAuth.getInstance();


            // show rating dialog to user
        Dialog alterDialog = new Dialog(this);
        alterDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        alterDialog.setContentView(R.layout.alert_layout);
        alterDialog.getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(android.R.color.transparent)));
        alterDialog.show();


        databaseReference = FirebaseDatabase.getInstance().getReference("this is path");
        databaseReference.setValue("hello there").addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {
                Toast.makeText(getApplicationContext(), "", Toast.LENGTH_SHORT).show();
            }
        }).addOnFailureListener(new OnFailureListener() {
            @Override
            public void onFailure(@NonNull Exception e) {
                Toast.makeText(getApplicationContext(), "failed", Toast.LENGTH_SHORT).show();
            }
        }).addOnSuccessListener(new OnSuccessListener<Void>() {
            @Override
            public void onSuccess(Void unused) {

            }
        });

        buttonRegistrstion = (Button) findViewById(R.id.btn_create_acc);
        buttonLogin = (Button) findViewById(R.id.btn_login_to_acc);




        buttonRegistrstion.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                openRegistrationScreen();
            }

        });

        // open login screen
        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLoginScreen();
            }
        });
    }
    private void openRegistrationScreen() {
        Intent i = new Intent(this, Registration_Form.class);
        startActivity(i);
    }
    private void openLoginScreen() {
        Intent intent = new Intent(this, Login_page.class);
        startActivity(intent);

    }

    @Override
    protected void onStart() {
        super.onStart();
        FirebaseUser user = mAuth.getCurrentUser();
        if(user == null){
            startActivity(new Intent(MainActivity.this, Login_page.class));
        }
    }
}
