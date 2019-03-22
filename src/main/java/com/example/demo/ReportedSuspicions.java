package com.example.demo;


public class ReportedSuspicions {
    private long id;
    private String crime;
    private String textbox;
    private String location;
    private float latitude;
    private float longitude;


    public ReportedSuspicions() {
    }
    public ReportedSuspicions(String crime, String textbox, String location, float latitude, float longitude) {
        this.crime = crime;
        this.textbox = textbox;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
    }
    public ReportedSuspicions(long id,String crime, String textbox, String location, float latitude, float longitude) {
       this.id = id;
        this.crime = crime;
        this.textbox = textbox;
        this.location = location;
        this.latitude = latitude;
        this.longitude = longitude;
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
