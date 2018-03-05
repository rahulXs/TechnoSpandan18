package com.example.streak.technospandan.activity;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.adapters.DaysViewPagerAdapter;
import com.gigamole.navigationtabstrip.NavigationTabStrip;


public class DaysViewActivity extends AppCompatActivity {

    ViewPager viewPager;
    NavigationTabStrip tabStrip;
    ImageView gear1, gear2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_view);

        viewPager = findViewById(R.id.viewPager);
        tabStrip = findViewById(R.id.tabstrip);

        viewPager.setAdapter(new DaysViewPagerAdapter(getSupportFragmentManager()));
        tabStrip.setViewPager(viewPager,0);
        tabStrip.setTitles("Day 0" ,"Day 1", "Day 2");

    /*    gear1 = (ImageView) findViewById(R.id.gear1);
        gear2 = (ImageView) findViewById(R.id.gear2);

        RotateAnimation rotate = new RotateAnimation(0, 360,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);
        rotate.setInterpolator(new LinearInterpolator());
        rotate.setDuration(2000);
        rotate.setRepeatCount(Animation.INFINITE);

        RotateAnimation rotate2 = new RotateAnimation(0, -360,
                Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF,
                0.5f);
        rotate2.setInterpolator(new LinearInterpolator());
        rotate2.setDuration(3000);
        rotate2.setRepeatCount(Animation.INFINITE);

        gear1.startAnimation(rotate);
        gear2.startAnimation(rotate2);  */

    }


    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    protected void onPause() {
        super.onPause();

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }

}
