package com.example.demo;

public class TypeOfSuspicion {
    private long SuspicionId;
    private String typeOfSuspicion;
    private String suspicionCategory;   //Make it an enum?
    private int lvlOfSeriosity;

    public TypeOfSuspicion(String typeOfSuspicion, int lvlOfSeriosity) {
        this.typeOfSuspicion = typeOfSuspicion;
        this.lvlOfSeriosity = lvlOfSeriosity;
    }

    public String getTypeOfSuspicion() {
        return typeOfSuspicion;
    }

    public void setTypeOfSuspicion(String typeOfSuspicion) {
        this.typeOfSuspicion = typeOfSuspicion;
    }

    public int getLvlOfSeriosity() {
        return lvlOfSeriosity;
    }

    public void setLvlOfSeriosity(int lvlOfSeriosity) {
        this.lvlOfSeriosity = lvlOfSeriosity;
    }
}
