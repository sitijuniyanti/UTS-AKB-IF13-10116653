package com.sitijuniyanti.uts_10116653;
/*
 * Siti Juniyanti
 * IF13
 * UTS AKB
 * 23 Mei 2019
 *
 *
 * */
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import static java.lang.Thread.sleep;

import com.sitijuniyanti.uts_10116653.view.ViewPagerActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.logo);
        TextView textView = findViewById(R.id.txt_nama);

        Animation animation = AnimationUtils.loadAnimation(this, R.anim.splash_anim);
        textView.startAnimation(animation);
        imageView.startAnimation(animation);
        final Intent intent = new Intent(this, ViewPagerActivity.class);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    startActivity(intent);
                    finish();
                }
            }
        });
        timer.start();


    }
    }