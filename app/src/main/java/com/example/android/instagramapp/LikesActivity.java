package com.example.android.instagramapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.android.instagramapp.Utilities.BottomNavigationUtilities;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class LikesActivity extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        handleBottomBar();
    }

    private void handleBottomBar()
    {
        BottomNavigationViewEx bnve = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationUtilities.customizeNavigationBar(bnve);
    }
}
