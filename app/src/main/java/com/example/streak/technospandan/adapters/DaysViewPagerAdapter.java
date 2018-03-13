package com.example.streak.technospandan.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


import com.example.streak.technospandan.fragment.DaysView;

import java.util.ArrayList;
import java.util.List;

public class DaysViewPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments;

    public DaysViewPagerAdapter(FragmentManager fm) {

        super(fm);

        fragments = new ArrayList<>();
        fragments.add(DaysView.newInstance("23-03-2018"));
        fragments.add(DaysView.newInstance("24-03-2018"));
        fragments.add(DaysView.newInstance("25-03-2018"));
    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

}
