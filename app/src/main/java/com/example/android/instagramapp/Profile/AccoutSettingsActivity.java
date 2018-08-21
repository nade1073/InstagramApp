package com.example.android.instagramapp.Profile;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.android.instagramapp.R;

public class AccoutSettingsActivity extends AppCompatActivity {

    private static final String TAG = "AccoutSettingsActivity";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accountssettings);
        Log.d(TAG, "onCreate() started");
    }
}
