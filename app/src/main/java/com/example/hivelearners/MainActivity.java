package com.example.hivelearners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView screen1_tv;
    Button num1_btn, num2_btn, num3_btn, num4_btn, num5_btn, num6_btn, num7_btn, num8_btn, num9_btn, num0_btn, decimal_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        screen1_tv = findViewById(R.id.screen1_tv);

        num1_btn = findViewById(R.id.num1_btn);
        num2_btn = findViewById(R.id.num2_btn);
        num3_btn = findViewById(R.id.num3_btn);
        num4_btn = findViewById(R.id.num4_btn);
        num5_btn = findViewById(R.id.num5_btn);
        num6_btn = findViewById(R.id.num6_btn);
        num7_btn = findViewById(R.id.num7_btn);
        num8_btn = findViewById(R.id.num8_btn);
        num9_btn = findViewById(R.id.num9_btn);
        num0_btn = findViewById(R.id.num0_btn);
        decimal_btn = findViewById(R.id.decimal_btn);


        num1_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num1_btn.getText().toString()));

            }
        });

        num2_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num2_btn.getText().toString()));

            }
        });

        num3_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num3_btn.getText().toString()));

            }
        });

        num4_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num4_btn.getText().toString()));

            }
        });
        num5_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num5_btn.getText().toString()));

            }
        });
        num6_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num6_btn.getText().toString()));

            }
        });
        num7_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num7_btn.getText().toString()));

            }
        });

        num8_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num8_btn.getText().toString()));

            }
        });
        num9_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                screen1_tv.setText(screen1_tv.getText().toString().concat(num9_btn.getText().toString()));

            }
        });
        num0_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // on 0 press
                screen1_tv.setText(screen1_tv.getText().toString().concat(num0_btn.getText().toString()));

            }
        });

        decimal_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (!screen1_tv.getText().toString().contains(".")) {
                    screen1_tv.setText(screen1_tv.getText().toString().concat(decimal_btn.getText().toString()));

                }


            }
        });


    }
}