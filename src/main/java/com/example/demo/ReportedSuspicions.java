package com.example.demo;


public class ReportedSuspicions {
    private long id;
    private String crime;
    private String textbox;
    private String location;
    private float latitude;
    private float longitude;
    private String date1;
    private String time1;


    public ReportedSuspicions() {
    }
    public ReportedSuspicions(String crime, String textbox, String location, float latitude, float longitude, String date1, String time1) {
        this.crime = crime;
        this.textbox = textbox;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date1 = date1;
        this.time1 = time1;
    }
    public ReportedSuspicions(long id,String crime, String textbox, String location, float latitude, float longitude, String date1, String time1) {
       this.id = id;
        this.crime = crime;
        this.textbox = textbox;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
        this.date1 = date1;
        this.time1 = time1;

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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public float getLatitude() {
        return latitude;
    }

    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    public float getLongitude() {
        return longitude;
    }

    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }

    public String getTextbox() {
        return textbox;
    }

    public void setTextbox(String textbox) {
        this.textbox = textbox;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ReportedSuspicions(String crime) {
        this.crime = crime;
    }

    public String getCrime() {
        return crime;
    }

    public void setCrime(String crime) {
        this.crime = crime;
    }
}
