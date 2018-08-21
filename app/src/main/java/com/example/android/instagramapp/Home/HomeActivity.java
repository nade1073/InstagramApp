package com.example.android.instagramapp.Home;

import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.example.android.instagramapp.R;
import com.example.android.instagramapp.Utilities.BottomNavigationUtilities;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class HomeActivity extends AppCompatActivity {

    private Context mContext = HomeActivity.this;
    private static final int ACTIVITY_NUM = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        handleBottomBar();
        setUpViewPager();
    }

    /**
     * Responsibile for adding the 3 tabs: Camera,home,Messages
     */
    private void setUpViewPager() {
        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(new CameraFragment()); // index 0
        adapter.addFragment(new HomeFragment()); // index 1
        adapter.addFragment(new MessagesFragment()); // index 2
        //*Create the swap animation
        ViewPager viewPager = (ViewPager) findViewById(R.id.container);
        viewPager.setAdapter(adapter);
        //*Conect the swap animation with icons
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        tabLayout.getTabAt(0).setIcon(R.drawable.ic_camera);
        tabLayout.getTabAt(1).setIcon(R.drawable.ic_instagram_black);
        tabLayout.getTabAt(2).setIcon(R.drawable.ic_arrow);

    }

    private void handleBottomBar() {
        BottomNavigationViewEx bnve = (BottomNavigationViewEx) findViewById(R.id.bottomNavViewBar);
        BottomNavigationUtilities.customizeNavigationBar(bnve);
        BottomNavigationUtilities.handleClicksOnMenuItemBar(mContext, bnve);
        Menu menu = bnve.getMenu();
        menu.getItem(ACTIVITY_NUM).setChecked(true);

    }
}
