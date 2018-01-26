package com.example.streak.technospandan.activity;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.streak.technospandan.R;

import com.example.streak.technospandan.fragment.DayFragment;

public class EventDays extends AppCompatActivity implements
        DayFragment.OnFragmentInteractionListener{

    private ActionBar toolbar;
    private Fragment fragment;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.AppThemeNav);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_days);

        toolbar = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation1);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        toolbar.setTitle("DAY 0");
        fragment = DayFragment.newInstance(getResources().getStringArray(R.array.day_0_events));
        loadFragment(fragment);
    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_day0:
                    toolbar.setTitle("DAY 0");
                    fragment = DayFragment.newInstance(getResources().getStringArray(R.array.day_0_events));
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_day1:
                    toolbar.setTitle("DAY 1");
                    fragment = DayFragment.newInstance(getResources().getStringArray(R.array.day_1_events));
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_day2:
                    toolbar.setTitle("DAY 2");
                    fragment = DayFragment.newInstance(getResources().getStringArray(R.array.day_2_events));
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };

    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    @Override
    public void onFragmentInteraction(Uri uri){
        //you can leave it empty
    }

    @Override
    public void onBackPressed() {
        finish();
    }
}
