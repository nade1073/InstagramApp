package com.example.android.instagramapp.Share;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;

import com.example.android.instagramapp.R;
import com.example.android.instagramapp.Utilities.BottomNavigationUtilities;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class ShareActivity extends AppCompatActivity{

    private Context mContext = ShareActivity.this;
    private static final int ACTIVITY_NUM=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        handleBottomBar();
    }

    private void handleBottomBar() {
        BottomNavigationViewEx bnve = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationUtilities.customizeNavigationBar(bnve);
        BottomNavigationUtilities.handleClicksOnMenuItemBar(mContext, bnve);
        Menu menu=bnve.getMenu();
        menu.getItem(ACTIVITY_NUM).setChecked(true);
    }
}
