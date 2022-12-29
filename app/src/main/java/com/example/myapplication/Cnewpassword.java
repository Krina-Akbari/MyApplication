package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Cnewpassword extends AppCompatActivity {

    Button save;
    EditText newpass , cnewpass;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cnewpassword);
        save = findViewById(R.id.btnsave);
        newpass = findViewById(R.id.cnewpassword);
        cnewpass = findViewById(R.id.confirmnewpassword);

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Cnewpassword.this,login.class ));
            }
        });


    }
}