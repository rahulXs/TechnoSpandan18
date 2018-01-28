package com.example.streak.technospandan;

import android.app.Application;
import android.support.v7.app.AppCompatDelegate;

import com.sylversky.fontreplacer.FontReplacer;
import com.sylversky.fontreplacer.Replacer;

public class TechnoSpandan extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

        Replacer replacer = FontReplacer.Build(getApplicationContext());
        replacer.setDefaultFont("Comfortaa-Bold.ttf");
        replacer.setBoldFont("Comfortaa-Bold.ttf");
        replacer.setLightFont("Comfortaa-Light.ttf");

        replacer.applyFont();

    }
}
