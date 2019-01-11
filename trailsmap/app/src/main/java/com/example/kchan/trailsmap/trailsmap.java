package com.example.kchan.trailsmap;

import android.app.Application;

import com.firebase.client.Firebase;

/**
 * Created by kchan on 2/9/2018.
 */

public class trailsmap extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Firebase.setAndroidContext(this);
    }
}
