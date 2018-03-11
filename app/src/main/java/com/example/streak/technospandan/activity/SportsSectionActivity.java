package com.example.streak.technospandan.activity;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.fragment.SMainFragment;
import com.example.streak.technospandan.fragment.TMainFragment;

public class SportsSectionActivity extends AppCompatActivity {

    private SMainFragment mtMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_section);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.sproot, mtMainFragment = SMainFragment.newInstance())
                    .commit();
        } else {
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.sproot);
            if (fragment instanceof TMainFragment) {
                mtMainFragment = (SMainFragment) fragment;
            }
        }
    }

    @Override
    public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.sproot);
        if (fragment instanceof TMainFragment) {
            mtMainFragment = (SMainFragment) fragment;
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
