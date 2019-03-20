package com.example.demo;

import org.springframework.stereotype.Service;


@Service
public class ReportedSuspicions {
    private long id;
    private String category;
    private String type;

    public ReportedSuspicions(String category, String type) {
        this.category = category;
        this.type = type;
    }

    public ReportedSuspicions() {
    }

    public ReportedSuspicions(long id, String category, String type) {
        this.id = id;
        this.category = category;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
