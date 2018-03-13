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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_days_view);

        viewPager = findViewById(R.id.viewPager);
        tabStrip = findViewById(R.id.tabstrip);

        viewPager.setAdapter(new DaysViewPagerAdapter(getSupportFragmentManager()));
        tabStrip.setViewPager(viewPager,0);
        tabStrip.setTitles("Head" ,"Developers", "Core");  /*change of development strategy leads to using this days view activity in the form of team info view. Lazy, I know that ;) */

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
