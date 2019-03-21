package com.example.demo;


public class ReportedSuspicions {
    private long id;
    private String crime;
    private String textbox;
    private String location;

    public ReportedSuspicions() {
    }

    public ReportedSuspicions(String crime, String textbox, String location) {
        this.crime = crime;
        this.textbox = textbox;
        this.location = location;
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
