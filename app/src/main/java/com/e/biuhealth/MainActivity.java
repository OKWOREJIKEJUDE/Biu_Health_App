package com.e.biuhealth;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;

import java.util.Timer;

public class MainActivity extends AppCompatActivity {
    Button myNext;
    private int current_position;
    TabLayout tabindicator;
    ViewPager viewPager;
    int images [] = {R.drawable.mobile_ux_bro, R.drawable.getdrug, R.drawable.feed_amico};
    int accets [] = {R.drawable.group4850, R.drawable.group4858, R.drawable.group4857};
    String firstString [] = {"Get medical", "Get drugs Delivered", "Get Access to"};
    String secondString [] = {"services from home", "at your Doorsteps.", "daily health tips"};
    String description [] = {"Virtual hospital where you consult with professionals on the go.",
            "Order and get drugs delivered to all locations of Nigeria.", "Get Access daily to premium content and health tips"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNext = (Button) findViewById(R.id.myNext);
        tabindicator = (TabLayout) findViewById(R.id.tabIndicator);
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        final Adapter adapter = new Adapter(MainActivity.this, images, accets, firstString, secondString, description);
        viewPager.setAdapter(adapter);
        tabindicator.setupWithViewPager(viewPager);


        myNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                current_position = viewPager.getCurrentItem();
                if (current_position <  images.length){
                    current_position++;
                    viewPager.setCurrentItem(current_position);
                }
                if (current_position == 3){
                    Intent myIntent = new Intent(MainActivity.this, LoginActivity.class);
                    startActivity(myIntent);
                    overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
                }
            }
        });

        viewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
                if (position == 2){
                    myNext.setText("Start");
                }else {
                    myNext.setText("Next");
                }
            }

            @Override
            public void onPageSelected(int position) {

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
    }
}
