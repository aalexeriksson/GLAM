package com.example.demo;

public class PoliceLogin {

    private long id;
    private String first_name;
    private String last_name;
    private String username;
    private String password;

    public PoliceLogin(long id, String first_name, String last_name, String username, String password) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
    }

    public PoliceLogin(String first_name, String last_name, String username, String password) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
