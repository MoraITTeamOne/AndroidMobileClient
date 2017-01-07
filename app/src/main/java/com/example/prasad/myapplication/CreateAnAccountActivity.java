package com.example.prasad.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateAnAccountActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_logging);
            Button but7=(Button)findViewById(R.id.but7);
            but7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent int1= new Intent(CreateAnAccountActivity.this,SelectServicesActivity.class);
                startActivity(int1);
                finish();
            }}
             );


    }
}
