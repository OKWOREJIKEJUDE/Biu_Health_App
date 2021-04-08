package com.e.biuhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GoActivity extends AppCompatActivity {
   // int position = -1;
    String myString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_go);


        //position = getIntent().getIntExtra("position", -1);
        myString = getIntent().getStringExtra("position");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }
}
