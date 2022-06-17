package com.example.hivelearners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button signin_btn;
    EditText email_et, pass_et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        signin_btn = findViewById(R.id.signin_btn);
        email_et = findViewById(R.id.email_et);
        pass_et = findViewById(R.id.pass_et);


        signin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = email_et.getText().toString();
                String pass = pass_et.getText().toString();

                String result = email + ' ' + pass;

                Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();


            }
        });


    }
}