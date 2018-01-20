package com.example.streak.technospandan.activity;

import android.app.Fragment;;
import android.content.Intent;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.fragment.HomeFragment;
import com.example.streak.technospandan.fragment.NotificationsFragment;
import com.example.streak.technospandan.fragment.TeamFragment;
import com.example.streak.technospandan.menu.DrawerAdapter;
import com.example.streak.technospandan.menu.DrawerItem;
import com.example.streak.technospandan.menu.SimpleItem;
import com.example.streak.technospandan.menu.SpaceItem;
import com.yarolegovich.slidingrootnav.SlidingRootNav;
import com.yarolegovich.slidingrootnav.SlidingRootNavBuilder;

import java.util.Arrays;

import static android.R.attr.id;

public class MainActivity extends AppCompatActivity implements DrawerAdapter.OnItemSelectedListener {

    private static final int POS_HOME = 0;
    private static final int POS_TEAM = 1;
    private static final int POS_NOTIFICATIONS = 2;
    private static final int POS_EXIT = 5;

    private String[] screenTitles;
    private Drawable[] screenIcons;

    Fragment fragment=null;

    private SlidingRootNav slidingRootNav;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater= getMenuInflater();
        inflater.inflate(R.menu.menu_items,menu);
        return true;

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id=item.getItemId();
        if(id==R.id.Settings){
            Intent i=new Intent(this,SettingsActivity.class);
            startActivity(i);
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        slidingRootNav = new SlidingRootNavBuilder(this)
                .withToolbarMenuToggle(toolbar)
                .withMenuOpened(false)
                .withContentClickableWhenMenuOpened(false)
                .withSavedState(savedInstanceState)
                .withMenuLayout(R.layout.menu_left_drawer)
                .inject();

        screenIcons = loadScreenIcons();
        screenTitles = loadScreenTitles();

        DrawerAdapter adapter = new DrawerAdapter(Arrays.asList(
                createItemFor(POS_HOME).setChecked(true),
                createItemFor(POS_TEAM),
                createItemFor(POS_NOTIFICATIONS),
                new SpaceItem(48),
                createItemFor(POS_EXIT)));
        adapter.setListener(this);

        RecyclerView list = (RecyclerView) findViewById(R.id.list);
        list.setNestedScrollingEnabled(false);
        list.setLayoutManager(new LinearLayoutManager(this));
        list.setAdapter(adapter);
        adapter.setSelected(POS_HOME);
    }

    @Override
    public void onItemSelected(int position) {

        if (position == POS_EXIT) {
            HomeFragment.setFlag(1);
            TeamFragment.setFlag(1);
            NotificationsFragment.setFlag(1);
            finish();
        }
        slidingRootNav.closeMenu();

        if(position==POS_HOME){

           // HomeFragment.setFlag(1);
            TeamFragment.setFlag(1);
            NotificationsFragment.setFlag(1);
            fragment=HomeFragment.createFor(screenTitles[position]);
            showFragment(fragment);
        }
        else if (position==POS_TEAM){

            HomeFragment.setFlag(1);
            //TeamFragment.setFlag(1);
            NotificationsFragment.setFlag(1);fragment= TeamFragment.createFor(screenTitles[position]);
            showFragment(fragment);
        }
        else if (position==POS_NOTIFICATIONS){

            HomeFragment.setFlag(1);
            TeamFragment.setFlag(1);
            //NotificationsFragment.setFlag(1);
            fragment= NotificationsFragment.createFor(screenTitles[position]);
            showFragment(fragment);
        }

        /*else {
            SettingsFragment f=(SettingsFragment)fragment;
            f.setFlag(1);
            Fragment selectedScreen = CenteredTextFragment.createFor(screenTitles[position]);
            showFragment(selectedScreen);
        }*/
    }

    private void showFragment(Fragment fragment) {
        getFragmentManager().beginTransaction()
                .replace(R.id.container, fragment)
                .commit();
    }


    private DrawerItem createItemFor(int position) {
        return new SimpleItem(screenIcons[position], screenTitles[position])
                .withIconTint(color(R.color.textColorSecondary))
                .withTextTint(color(R.color.textColorPrimary))
                .withSelectedIconTint(color(R.color.colorAccent))
                .withSelectedTextTint(color(R.color.colorAccent));
    }

    private String[] loadScreenTitles() {
        return getResources().getStringArray(R.array.ld_activityScreenTitles);
    }

    private Drawable[] loadScreenIcons() {
        TypedArray ta = getResources().obtainTypedArray(R.array.ld_activityScreenIcons);
        Drawable[] icons = new Drawable[ta.length()];
        for (int i = 0; i < ta.length(); i++) {
            int id = ta.getResourceId(i, 0);
            if (id != 0) {
                icons[i] = ContextCompat.getDrawable(this, id);
            }
        }
        ta.recycle();
        return icons;
    }

    @ColorInt
    private int color(@ColorRes int res) {
        return ContextCompat.getColor(this, res);
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        HomeFragment f=(HomeFragment)fragment;
        f.setFlag(1);
    }
}
