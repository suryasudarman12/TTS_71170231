package com.uts.vehicle;

public class Transmison {
    private String transType;
    private int numSpeed;

    public Transmison(String transType, int numSpeed){
        this.transType = transType;
        this.numSpeed = numSpeed;

    }

    public String getTransType() {
        return transType;
    }

    public int getNumSpeed() {
        return numSpeed;
    }

    public void setNumSpeed(int numSpeed) {
        this.numSpeed = numSpeed;
    }

    public void setTransType(String transType) {
        this.transType = transType;
    }
}
