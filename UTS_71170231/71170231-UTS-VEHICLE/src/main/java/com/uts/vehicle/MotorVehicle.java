package com.uts.vehicle;

public abstract class MotorVehicle implements Vehicle {
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmison transmison;

    public MotorVehicle(){
        this.vehicleName = vehicleName;
        this.engine = engine;
        this.tire = tire;
        this.wheel = wheel;
        this.transmison = transmison;
    }



    public String getVehicleName() {
        return vehicleName;
    }

    public Engine getEngine() {
        return engine;
    }

    public Tire getTire() {
        return tire;
    }

    public Transmison getTransmison() {
        return transmison;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public void setTransmison(Transmison transmison) {
        this.transmison = transmison;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

}
