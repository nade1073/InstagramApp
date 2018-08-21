package com.example.android.instagramapp.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import com.example.android.instagramapp.R;
import com.example.android.instagramapp.Utilities.BottomNavigationUtilities;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ProfileActivity extends AppCompatActivity {
    private static final String TAG = "ProfileActivity";
    private Context mContext = ProfileActivity.this;
    private static final int ACTIVITY_NUM = 4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        handleBottomBar();
        setupTolBar();
    }

    private void setupTolBar() {
        Toolbar toolbar = (Toolbar) findViewById(R.id.profilToolBar);
        setSupportActionBar(toolbar);
        toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Log.d(TAG, "onMenuItemClicked()");
                switch (item.getItemId()) {
                    case R.id.profileMenu:
                        Log.d(TAG, "onMenuItemClick:Navigate to propfile prefernces");
                }
                return false;
            }
        });
    }

    private void handleBottomBar() {
        BottomNavigationViewEx bnve = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationUtilities.customizeNavigationBar(bnve);
        BottomNavigationUtilities.handleClicksOnMenuItemBar(mContext, bnve);
        Menu menu = bnve.getMenu();
        menu.getItem(ACTIVITY_NUM).setChecked(true);

    }
}
