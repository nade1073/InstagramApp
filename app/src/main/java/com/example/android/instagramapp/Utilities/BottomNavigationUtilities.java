package com.example.android.instagramapp.Utilities;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.view.MenuItem;

import com.example.android.instagramapp.Home.HomeActivity;
import com.example.android.instagramapp.Likes.LikesActivity;
import com.example.android.instagramapp.Profile.ProfileActivity;
import com.example.android.instagramapp.R;
import com.example.android.instagramapp.Search.SearchActivity;
import com.example.android.instagramapp.Share.ShareActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationUtilities {

    public static void customizeNavigationBar(BottomNavigationViewEx bnv)
    {
        bnv.enableShiftingMode(false);
        bnv.enableAnimation(false);
        bnv.setTextVisibility(false);
        bnv.enableItemShiftingMode(false);
    }

    public static void handleClicksOnMenuItemBar(final Context context, BottomNavigationViewEx bnv)
    {
        bnv.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.ic_alert:
                    {
                        Intent i1=new Intent(context, LikesActivity.class);
                        context.startActivity(i1);
                        break;
                    }
                    case R.id.ic_house:
                    {
                        Intent i1=new Intent(context, HomeActivity.class);
                        context.startActivity(i1);
                        break;
                    }
                    case R.id.ic_search:
                    {
                        Intent i1=new Intent(context, SearchActivity.class);
                        context.startActivity(i1);
                        break;
                    }
                    case R.id.ic_circle:
                    {
                        Intent i1=new Intent(context, ShareActivity.class);
                        context.startActivity(i1);
                        break;

                    }
                    case R.id.ic_android:
                    {
                        Intent i1=new Intent(context, ProfileActivity.class);
                        context.startActivity(i1);
                        break;
                    }
                }
                return false;
            }
        });


    }
}
