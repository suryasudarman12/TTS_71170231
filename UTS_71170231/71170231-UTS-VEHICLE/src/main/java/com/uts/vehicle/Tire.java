package com.uts.vehicle;

public class Tire {
    private String tiretype;
    private int width;
    private int aspectRatio;
    private int wheelDiameter;

    public Tire(String tiretype, int width, int aspectRatio, int wheelDiameter){
        this.tiretype = tiretype;
        this.width = width;
        this.aspectRatio = aspectRatio;
        this.wheelDiameter = wheelDiameter;

    }

    public int getAspectRatio() {
        return aspectRatio;
    }

    public String getTiretype() {
        return tiretype;
    }

    public int getWheelDiameter() {
        return wheelDiameter;
    }

    public int getWidth() {
        return width;
    }

    public void setAspectRatio(int aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public void setTiretype(String tiretype) {
        this.tiretype = tiretype;
    }

    public void setWheelDiameter(int wheelDiameter) {
        this.wheelDiameter = wheelDiameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
