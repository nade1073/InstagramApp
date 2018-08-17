package com.example.android.instagramapp.Utilities;

import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

public class BottomNavigationUtilities {

    public static void customizeNavigationBar(BottomNavigationViewEx bnv)
    {
        bnv.enableShiftingMode(false);
        bnv.enableAnimation(false);
        bnv.setTextVisibility(false);
        bnv.enableItemShiftingMode(false);
    }
}
