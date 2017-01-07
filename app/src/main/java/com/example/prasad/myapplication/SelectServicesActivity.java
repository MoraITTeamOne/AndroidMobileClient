package com.example.prasad.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class SelectServicesActivity extends AppCompatActivity {

    private CheckBox checkBox2,checkBox1;
    private Button button3;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_services);
        addListenerOncheckBox2();
        Button button3=(Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int1= new Intent(SelectServicesActivity.this,ProfileActivity.class);
                startActivity(int1);
                finish();
            }}
        );

    }


    public void addListenerOncheckBox2() {
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            if (((CheckBox)v).isChecked()){
                Toast.makeText(SelectServicesActivity.this,"you select bus :)",
                Toast.LENGTH_LONG).show();


            }
            }
        });
    }


    public void addListenerOnButton(){
        checkBox2 = (CheckBox)findViewById(R.id.checkBox2);
        checkBox1 = (CheckBox)findViewById(R.id.checkBox1);
        button3 = (Button)findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuffer result = new StringBuffer();
                result.append(" bus select : ").append(checkBox2.isChecked());
                result.append("\n train select : ").append(checkBox1.isChecked());
                Toast.makeText(SelectServicesActivity.this,result.toString(),Toast.LENGTH_LONG).show();
            }
        });
    }}
