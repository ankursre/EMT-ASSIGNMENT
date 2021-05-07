package com.test.empassignment.tools;

import android.content.Context;
import android.content.SharedPreferences;

public class Preference {

    private static Preference instance;
    private static SharedPreferences pref;
    public static Preference getInstance(){
        return instance;
    }

    private Preference(Context context){
        pref= context.getApplicationContext().getSharedPreferences("LocationApp", Context.MODE_PRIVATE);
    }

    public static Preference initialize(Context context){
        if(instance==null)
            instance= new Preference(context);
        return instance;
    }

    public void setStartTime(String time){
        pref.edit().putString("start_time", time).commit();
    }

    public String getStartTime(){
        return pref.getString("start_time", "");
    }

    public void setIsTripStart(boolean isTripStart){
        pref.edit().putBoolean("isTripStart", isTripStart).commit();
    }

    public boolean isTripStart(){
        return pref.getBoolean("isTripStart", false);
    }

    public void setTripId(int time){
        pref.edit().putInt("trip_id", time).commit();
    }

    public int getTripId(){
        return pref.getInt("trip_id", 0);
    }
}
