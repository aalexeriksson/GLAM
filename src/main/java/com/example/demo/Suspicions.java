package com.example.demo;

public class Suspicions {

    private long id;
    private String category_of_suspicion;
    private String type_of_suspicion;
    private String subtype_of_suspicion;
    private String details;
    private String media;

    public Suspicions(long id, String category_of_suspicion, String type_of_suspicion, String subtype_of_suspicion, String details, String media) {
        this.id = id;
        this.category_of_suspicion = category_of_suspicion;
        this.type_of_suspicion = type_of_suspicion;
        this.subtype_of_suspicion = subtype_of_suspicion;
        this.details = details;
        this.media = media;
    }

    public Suspicions(String category_of_suspicion, String type_of_suspicion, String subtype_of_suspicion, String details, String media) {
        this.category_of_suspicion = category_of_suspicion;
        this.type_of_suspicion = type_of_suspicion;
        this.subtype_of_suspicion = subtype_of_suspicion;
        this.details = details;
        this.media = media;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getCategory_of_suspicion() {
        return category_of_suspicion;
    }

    public void setCategory_of_suspicion(String category_of_suspicion) {
        this.category_of_suspicion = category_of_suspicion;
    }

    public String getType_of_suspicion() {
        return type_of_suspicion;
    }

    public void setType_of_suspicion(String type_of_suspicion) {
        this.type_of_suspicion = type_of_suspicion;
    }

    public String getSubtype_of_suspicion() {
        return subtype_of_suspicion;
    }

    public void setSubtype_of_suspicion(String subtype_of_suspicion) {
        this.subtype_of_suspicion = subtype_of_suspicion;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getMedia() {
        return media;
    }

    public void setMedia(String media) {
        this.media = media;
    }
}
