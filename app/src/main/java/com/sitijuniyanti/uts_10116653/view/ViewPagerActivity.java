package com.sitijuniyanti.uts_10116653.view;

/*
 * Siti Juniyanti
 * IF13
 * UTS AKB
 * 23 Mei 2019
 *
 *
 * */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.sitijuniyanti.uts_10116653.R;
import com.sitijuniyanti.uts_10116653.presenter.ViewPagerAdapter;

public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager slideViewPager;
    private LinearLayout dotLayout;
    private TextView[] dot;
    private ViewPagerAdapter adapter;

    private Button btnNext,btnBack;
    private int currentPage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewpager);

        slideViewPager = findViewById(R.id.vp_container);
        dotLayout = findViewById(R.id.dot_indicator);

        btnBack = findViewById(R.id.btn_back);
        btnNext = findViewById(R.id.btn_next);

        btnBack.setVisibility(View.INVISIBLE);
        adapter = new ViewPagerAdapter(this);

        slideViewPager.setAdapter(adapter);
        addDotsIndicator(0);
        slideViewPager.addOnPageChangeListener(viewListener);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                slideViewPager.setCurrentItem(currentPage-1);
            }
        });
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btnNext.getText()== getResources().getString(R.string.btn_start)){
                    Intent intent = new Intent(ViewPagerActivity.this,MenuActivity.class);
                    startActivity(intent);
                }else{
                    slideViewPager.setCurrentItem(currentPage+1);
                }
            }
        });
    }

    public void addDotsIndicator(int position){
        dot = new TextView[3];
        dotLayout.removeAllViews();

        for (int i = 0; i<dot.length; i++){
            dot[i] = new TextView(this);
            dot[i].setText(".");
            dot[i].setTextSize(50);

            dotLayout.addView(dot[i]);
        }

        if (dot.length>0){

        }
    }

    ViewPager.OnPageChangeListener viewListener = new ViewPager.OnPageChangeListener() {
        @Override
        public void onPageScrolled(int i, float v, int i1) {

        }

        @Override
        public void onPageSelected(int i) {
            addDotsIndicator(i);
            currentPage = i;

            if (i==0){
                btnBack.setVisibility(View.INVISIBLE);
                btnBack.setEnabled(false);
                btnNext.setEnabled(true);
                btnNext.setText(getResources().getString(R.string.btn_next));
            }
            else if (i == dot.length-1){
                btnBack.setVisibility(View.VISIBLE);
                btnBack.setEnabled(true);
                btnNext.setEnabled(true);
                btnNext.setText(getResources().getString(R.string.btn_start));
            }
            else{
                btnBack.setVisibility(View.VISIBLE);
                btnBack.setEnabled(true);
                btnNext.setEnabled(true);
                btnNext.setText(getResources().getString(R.string.btn_next));
            }
        }

        @Override
        public void onPageScrollStateChanged(int i) {

        }
    };
}
