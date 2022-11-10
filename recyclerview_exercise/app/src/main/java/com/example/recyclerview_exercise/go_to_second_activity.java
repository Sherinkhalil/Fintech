package com.example.recyclerview_exercise;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class go_to_second_activity extends AppCompatActivity {
    ImageView myImgV;
    Button btnLocation;
    TextView txtDescription, txtTitle, displayParagraph;


    String myfirstString, mySecondString, par, openLink, url;
    int images;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go_to_second);
        myImgV = findViewById(R.id.imgV_mLane);
        btnLocation = findViewById(R.id.btn_1);
        txtDescription = findViewById(R.id.txt_desciption);
        txtTitle = findViewById(R.id.txtHeader);
        displayParagraph = findViewById(R.id.uri_txtV);

        getInfo();
        setInfo();
    }


    private void getInfo() {
        if (getIntent().hasExtra("images")   && getIntent().hasExtra("data1")
                && getIntent().hasExtra("data2")) {
            Bundle extras = getIntent().getExtras();
            int place = extras.getInt("place");

            myfirstString = getIntent().getStringExtra("data1");
            mySecondString = getIntent().getStringExtra("data2");
            images = getIntent().getIntExtra("images", 1);
            par= getIntent().getStringExtra("paragraph");
            openLink = getResources().getStringArray(R.array.Addresses)[place];
            url = getResources().getStringArray(R.array.Links)[place];
            // openLink=getIntent().getStringExtra("urls");
        } else {
            Toast.makeText(this, "no information available", Toast.LENGTH_SHORT).show();
            //
        }
    }
    private void setInfo() {
        txtTitle.setText(myfirstString);
        txtDescription.setText(mySecondString);
        myImgV.setImageResource(images);
        displayParagraph.setText(par);
        btnLocation.setText(openLink);

        btnLocation.setOnClickListener(new View.OnClickListener() {
             public void onClick(View v) {
                Intent webLink = new Intent("android.intent.action.VIEW", Uri.parse(url));
                startActivity(webLink);
            }
        });


    }

}

