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
import com.example.streak.technospandan.fragment.CulturalFragment;
import com.example.streak.technospandan.fragment.OtherFragment;
import com.example.streak.technospandan.fragment.SportsFragment;
import com.example.streak.technospandan.fragment.TechnicalFragment;

public class CategoryView extends AppCompatActivity implements
        TechnicalFragment.OnFragmentInteractionListener, CulturalFragment.OnFragmentInteractionListener, SportsFragment.OnFragmentInteractionListener , OtherFragment.OnFragmentInteractionListener{

        private ActionBar toolbar;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            setTheme(R.style.AppThemeNav);
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_category_view);

            toolbar = getSupportActionBar();

            BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

         toolbar.setTitle("Cultural");
        }

        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.navigation_shop:
                        toolbar.setTitle("Cultural Events");
                        fragment = new CulturalFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.navigation_gifts:
                        toolbar.setTitle("Technical Events");
                        fragment = new TechnicalFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.navigation_cart:
                        toolbar.setTitle("Sports Events");
                        fragment = new SportsFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.navigation_profile:
                        toolbar.setTitle("Workshops & Other Activities");
                        fragment = new OtherFragment();
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


    }

