package com.test.empassignment.Dao;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.test.empassignment.Entity.LocationModel;

import java.util.List;

@Dao
public interface LocationDao {

    @Insert
    void insertLocation(LocationModel attendance);

    @Query("select * from LocationModel")
    List<LocationModel> getAll();
}
