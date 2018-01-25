package com.example.streak.technospandan.activity;

import android.os.PersistableBundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.fragment.MainFragment;

public class GroupView extends AppCompatActivity {

    private MainFragment mMainFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group_view);
        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.root, mMainFragment = MainFragment.newInstance())
                    .commit();
        } else {
            Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.root);
            if (fragment instanceof MainFragment) {
                mMainFragment = (MainFragment) fragment;
            }
        }
    }

    @Override
    public void onBackPressed() {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.root);
        if (fragment instanceof MainFragment) {
            mMainFragment = (MainFragment) fragment;
        }
        if (mMainFragment == null || !mMainFragment.isAdded() || !mMainFragment.deselectIfSelected()) {
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
