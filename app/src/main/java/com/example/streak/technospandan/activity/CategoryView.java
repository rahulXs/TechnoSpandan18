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

            BottomNavigationView navigation = findViewById(R.id.navigation);
            navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
            toolbar.setTitle("Cultural Events");
            Fragment fragment;
            fragment = new CulturalFragment();
            loadFragment(fragment);
        }

        private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
                = new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment;
                switch (item.getItemId()) {
                    case R.id.nav_cultural:
                        toolbar.setTitle("Cultural Events");
                        fragment = new CulturalFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_technical:
                        toolbar.setTitle("Technical Events");
                        fragment = new TechnicalFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_sports:
                        toolbar.setTitle("Sports Events");
                        fragment = new SportsFragment();
                        loadFragment(fragment);
                        return true;
                    case R.id.nav_other:
                        toolbar.setTitle("Workshops & Other Activities");
                        fragment = new OtherFragment();
                        loadFragment(fragment);
                        return true;
                }

                return false;
            }
        };

        private void loadFragment(Fragment fragment) {
            FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
            transaction.replace(R.id.frame_container, fragment);
            transaction.addToBackStack(null);
            transaction.commit();
        }
        @Override
        public void onFragmentInteraction(Uri uri){
            //can leave it empty
        }
        @Override
        public void onBackPressed(){
           finish();
        }

    }

