package com.e.biuhealth;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);

        Thread timer = new Thread(){
            @Override
            public void run() {
                try {

                    sleep(4000);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }finally {
                    Intent intent = new Intent(WelcomePage.this,MainActivity.class);
                    startActivity(intent);
                    open();
                }
            }
        };
        timer.start();
    }

    public void open(){
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    protected void onPause() {
        super.onPause();
        finish();
    }
}
