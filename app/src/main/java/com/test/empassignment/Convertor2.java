package com.test.empassignment;
import androidx.room.TypeConverter;

import com.google.gson.Gson;
import com.test.empassignment.Entity.LocationData;

public class Convertor2 {
    @TypeConverter
    public static String fromLocation(LocationData location){
        return new Gson().toJson(location);
    }

    @TypeConverter
    public static LocationData toLocation(String str){
        return new Gson().fromJson(str, LocationData.class);
    }
}
