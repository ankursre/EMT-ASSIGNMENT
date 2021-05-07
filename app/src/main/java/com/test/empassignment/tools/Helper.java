package com.test.empassignment.tools;

public class Helper {

    public static void generateNextTripId(){
        int id = Preference.getInstance().getTripId()+1;
        Preference.getInstance().setTripId(id);
    }
}
