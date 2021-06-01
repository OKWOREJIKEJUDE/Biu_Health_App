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
    Button myLogin1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        myLogin1 = (Button) findViewById(R.id.login);
        myString = getIntent().getStringExtra("position");

        myLock = (EditText) findViewById(R.id.mylockEditText);
        myLock.getText().toString();
        myLock.setFocusableInTouchMode(true);

        myLogin1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(LoginActivity.this, Create_account1.class);
                startActivity(myIntent);
            }
        });

    }


            @Override
            public void onBackPressed() {
                super.onBackPressed();
                overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
            }

}
