package com.f55121034.evo;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

public class MainActivity extends AppCompatActivity {
    ViewPager viewPager;
    TextView tv_one_page_counter;
    int total=2, count =1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        viewPager = findViewById(R.id.viewpager);
        tv_one_page_counter=findViewById(R.id.tv_page_counter);

        tv_one_page_counter.setText(count + "/" + total );

        viewPager.setAdapter(new Slider(getSupportFragmentManager()));

        viewPager.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                count =1;
                count=position;
                tv_one_page_counter.setText(count + "/" + total);

            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });

    }


}