package com.example.admin.myapplication2;

import com.firebase.client.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by admin on 2016/7/29.
 */
public class CrowdWeather extends android.app.Application {
    @Override
    public void onCreate() {
        int variable;
        super.onCreate();
        if (!FirebaseApp.getApps(this).isEmpty()) {
            FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        }
        Firebase.setAndroidContext(this);
    }
}
