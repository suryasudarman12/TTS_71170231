package com.uts.vehicle;

public abstract class Wagon implements Vehicle{
    private String puller;
    private Wheel wheel;

    public String getPuller() {
        return puller;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setPuller(String puller) {
        this.puller = puller;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
