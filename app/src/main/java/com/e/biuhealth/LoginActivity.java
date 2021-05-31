package com.e.biuhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
    String myString;
    EditText myLock;
    Button myLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myLogin = (Button) findViewById(R.id.login);
        myString = getIntent().getStringExtra("position");

        myLock = (EditText) findViewById(R.id.mylockEditText);
        myLock.getText().toString();
        myLock.setFocusableInTouchMode(true);

        myLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myInt = new Intent(LoginActivity.this, CreateAccount2.class);
                startActivity(myInt);
            }
        });

    }


            @Override
            public void onBackPressed() {
                super.onBackPressed();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

}
