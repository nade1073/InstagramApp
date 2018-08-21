package com.example.android.instagramapp.Profile;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

import com.example.android.instagramapp.R;

import java.util.ArrayList;
import java.util.List;

public class AccoutSettingsActivity extends AppCompatActivity {

    private static final String TAG = "AccoutSettingsActivity";
    private Context mContext;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = AccoutSettingsActivity.this;
        setContentView(R.layout.activity_accountssettings);
        Log.d(TAG, "onCreate() started");
        setupSettingList();
        ImageView backArrow = (ImageView) findViewById(R.id.backArrow);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void setupSettingList() {
        Log.d(TAG, "setupSetting init list");
        ListView listView = (ListView) findViewById(R.id.lvAccoutSettings);

        ArrayList<String> options = new ArrayList<>();
        options.add(getString(R.string.edit_profile));
        options.add(getString(R.string.sign_out));

        ArrayAdapter arrayAdapter = new ArrayAdapter(mContext, android.R.layout.simple_list_item_1, options);
        listView.setAdapter(arrayAdapter);

    }
}
