package com.kuliahmobile.latihan4;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager mFragmentManager = getSupportFragmentManager();
        FragmentTransaction mFragmentTransaction =mFragmentManager.beginTransaction();
        newFragment mnewFragment = new newFragment();
        Fragment fragment = mFragmentManager.findFragmentByTag(newFragment.class.getSimpleName());
        if(!(fragment instanceof newFragment)){
            mFragmentTransaction.add(R.id.container_frame,mnewFragment,newFragment.class.getSimpleName());
            mFragmentTransaction.commit();
        }
    }
}
