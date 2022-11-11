package com.example.group_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;

public class registration extends AppCompatActivity {

    private EditText name, surname,password, passwordConfirm,email, phone;
    private DatabaseReference mDatabase;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration_layout);

//        mDatabase = FirebaseDatabase.getInstance().getReference();
//
//
//        public class User {
//
//            public String username;
//            public String email;
//
//            public User() {
//                // Default constructor required for calls to DataSnapshot.getValue(User.class)
//            }
//
//            public User(String username, String email) {
//                this.username = username;
//                this.email = email;
//            }
//
//        }
//
//        public void writeNewUser(String userId, String name, String email) {
//            User user = new User(name, email);
//
//            mDatabase.child("users").child(userId).setValue(user);
//        }

    }
}