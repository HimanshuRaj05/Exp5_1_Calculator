package com.intreve.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNum1, etNum2;
    Button btnAdd, btnSub, btnMul, btnDiv;
    String num1, num2;
    double result=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNum1=findViewById(R.id.etNum1);
        etNum2=findViewById(R.id.etNum2);
        btnAdd=findViewById(R.id.btnAdd);
        btnSub=findViewById(R.id.btnSub);
        btnMul=findViewById(R.id.btnMul);
        btnDiv=findViewById(R.id.btnDiv);

        num1="";
        num2="";

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=etNum1.getText().toString();
                String num2=etNum2.getText().toString();

                result=Double.parseDouble(num1)+Double.parseDouble(num2);
                Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_SHORT).show();
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=etNum1.getText().toString();
                String num2=etNum2.getText().toString();

                result=Double.parseDouble(num1)*Double.parseDouble(num2);
                Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_SHORT).show();
            }
        });

        btnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=etNum1.getText().toString();
                String num2=etNum2.getText().toString();

                result=Double.parseDouble(num1)-Double.parseDouble(num2);
                Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_SHORT).show();
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1=etNum1.getText().toString();
                String num2=etNum2.getText().toString();

                result=Double.parseDouble(num1)/Double.parseDouble(num2);
                Toast.makeText(MainActivity.this, Double.toString(result), Toast.LENGTH_SHORT).show();
            }
        });







    }
}