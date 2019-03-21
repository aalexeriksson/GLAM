package com.example.demo;


public class ReportedSuspicions {
    private long id;
    private String crime;

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
