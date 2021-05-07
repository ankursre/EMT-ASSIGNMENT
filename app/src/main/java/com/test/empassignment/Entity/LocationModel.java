package com.test.empassignment.Entity;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class LocationModel {

    int tripId;
    String startTime, endTime;

    public LocationData locationData;

    @PrimaryKey(autoGenerate = true)
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTripId() {
        return tripId;
    }

    public void setTripId(int tripId) {
        this.tripId = tripId;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public LocationData getLocationData() {
        return locationData;
    }

    public void setLocationDataList(LocationData locationData) {
        this.locationData = locationData;
    }
}
