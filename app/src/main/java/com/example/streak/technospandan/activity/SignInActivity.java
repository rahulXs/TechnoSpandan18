package com.example.streak.technospandan.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.streak.technospandan.R;


import es.dmoral.toasty.Toasty;

// Importing Google GMS Auth API Libraries.

public class SignInActivity extends AppCompatActivity {

    // TAG is for show some tag logs in LOG screen.
    public static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        Toasty.success(getBaseContext(), "Welcome to TechnoSpandan Gallery.", Toast.LENGTH_LONG, true).show();



}

    public void buttonOn(View view){
        switch(view.getId()) {
            case R.id.button5:
                Intent myIndent = new Intent(this, ImgUploadActivity.class);
                startActivity(myIndent);
                break;
        } }}