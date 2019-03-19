package com.example.demo;

import java.util.Date;

public class ReportedSuspicions {
    private long tipId;
    private long suspicionId;
    private String suspicionDescribed;
    private String location;
    private int regionId;
    private long latCoordinates;
    private long longCoordinates;
    private Date dateTime;
    private String linkImage;

    public ReportedSuspicions(long suspicionId, String suspicionDescribed, String location, int regionId, long latCoordinates, long longCoordinates, Date dateTime, String linkImage) {
        this.suspicionId = suspicionId;
        this.suspicionDescribed = suspicionDescribed;
        this.location = location;
        this.regionId = regionId;
        this.latCoordinates = latCoordinates;
        this.longCoordinates = longCoordinates;
        this.dateTime = dateTime;
        this.linkImage = linkImage;
    }

    public long getSuspicionId() {
        return suspicionId;
    }

    public void setSuspicionId(long suspicionId) {
        this.suspicionId = suspicionId;
    }

    public String getSuspicionDescribed() {
        return suspicionDescribed;
    }

    public void setSuspicionDescribed(String suspicionDescribed) {
        this.suspicionDescribed = suspicionDescribed;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRegionId() {
        return regionId;
    }

    public void setRegionId(int regionId) {
        this.regionId = regionId;
    }

    public long getLatCoordinates() {
        return latCoordinates;
    }

    public void setLatCoordinates(long latCoordinates) {
        this.latCoordinates = latCoordinates;
    }

    public long getLongCoordinates() {
        return longCoordinates;
    }

    public void setLongCoordinates(long longCoordinates) {
        this.longCoordinates = longCoordinates;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getLinkImage() {
        return linkImage;
    }

    public void setLinkImage(String linkImage) {
        this.linkImage = linkImage;
    }
}
