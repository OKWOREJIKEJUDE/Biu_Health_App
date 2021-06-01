package com.e.biuhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Create_account1 extends AppCompatActivity {
    Button myContinue;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account1);

        myContinue = (Button) findViewById(R.id.myContinue);

        myContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(Create_account1.this, CreateAccount2.class);
                startActivity(myInt);
            }
        });

    }
}
