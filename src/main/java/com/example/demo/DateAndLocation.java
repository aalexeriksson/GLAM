package com.example.demo;

public class DateAndLocation {

    private long id;
    private long supicion_id;
    private long region_id;
    private float longitude;
    private float lattitude;
    private String date1;
    private String time1;

    public DateAndLocation(long id, long supicion_id, long region_id, float longitude, float lattitude, String date1, String time1) {
        this.id = id;
        this.supicion_id = supicion_id;
        this.region_id = region_id;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.date1 = date1;
        this.time1 = time1;
    }

    public DateAndLocation(long supicion_id, long region_id, float longitude, float lattitude, String date1, String time1) {
        this.supicion_id = supicion_id;
        this.region_id = region_id;
        this.longitude = longitude;
        this.lattitude = lattitude;
        this.date1 = date1;
        this.time1 = time1;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getSupicion_id() {
        return supicion_id;
    }

    public void setSupicion_id(long supicion_id) {
        this.supicion_id = supicion_id;
    }

    public long getRegion_id() {
        return region_id;
    }

    public void setRegion_id(long region_id) {
        this.region_id = region_id;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public float getLattitude() {
        return lattitude;
    }

    public void setLattitude(float lattitude) {
        this.lattitude = lattitude;
    }

    public String getDate1() {
        return date1;
    }

    public void setDate1(String date1) {
        this.date1 = date1;
    }

    public String getTime1() {
        return time1;
    }

    public void setTime1(String time1) {
        this.time1 = time1;
    }
}
