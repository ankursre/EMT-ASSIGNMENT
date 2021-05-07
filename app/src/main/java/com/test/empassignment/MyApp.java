package com.test.empassignment;

import android.app.Application;
import com.test.empassignment.tools.Preference;

public class MyApp extends Application {

    public static MyApp myApp;

    @Override
    public void onCreate() {
        super.onCreate();
        myApp=this;
        Preference.initialize(this);
    }

}
