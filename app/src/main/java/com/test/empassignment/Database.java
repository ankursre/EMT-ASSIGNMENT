package com.test.empassignment;

import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.room.TypeConverters;

import com.test.empassignment.Dao.LocationDao;
import com.test.empassignment.Entity.LocationModel;


@androidx.room.Database(version = 1, entities = {LocationModel.class}, exportSchema = false)
@TypeConverters(Convertor2.class)
public abstract class Database extends RoomDatabase {

    private static Database database;
    private static String DB_NAME= "my_db";

    public static synchronized Database getDatabase(){
        if(database == null){
            database = Room.databaseBuilder(MyApp.myApp.getApplicationContext(), Database.class, DB_NAME)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return database;
    }

public abstract LocationDao getLocationDao();

}
 