package com.example.streak.technospandan.activity;


import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.fragment.TMainFragment;

public class TechnicalSectionActivity extends AppCompatActivity {

    private TMainFragment mtMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_technical_section);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.techroot, mtMainFragment = TMainFragment.newInstance())
                    .commit();
        } else {
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.techroot);
            if (fragment instanceof TMainFragment) {
                mtMainFragment = (TMainFragment) fragment;
            }
        }
    }

    @Override
    public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.techroot);
        if (fragment instanceof TMainFragment) {
            mtMainFragment = (TMainFragment) fragment;
        }
        if (mtMainFragment == null || !mtMainFragment.isAdded() || !mtMainFragment.deselectIfSelected()) {
            super.onBackPressed();
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onRestoreInstanceState(savedInstanceState, persistentState);
    }
}
