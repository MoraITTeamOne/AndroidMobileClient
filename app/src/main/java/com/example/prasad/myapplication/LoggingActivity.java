package com.example.prasad.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoggingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_an_account);


    Button but3=(Button)findViewById(R.id.but3);
    Button but4=(Button)findViewById(R.id.but4);
    Button but2=(Button)findViewById(R.id.but2);
    but3.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){
            Intent int1= new Intent(LoggingActivity.this,CreateAnAccountActivity.class);
            startActivity(int1);
            finish();
        }}
    );
    but4.setOnClickListener(new View.OnClickListener(){
        @Override
        public  void onClick(View v) {
            Intent int2 = new Intent(LoggingActivity.this, GameActivity.class);
            startActivity(int2);
            finish();
        }}

    );


    but2.setOnClickListener(new View.OnClickListener(){
        @Override
        public  void onClick(View v) {
            Intent int3 = new Intent(LoggingActivity.this, ProfileActivity.class);

            startActivity(int3);
            finish();
        }}

    );
}}
