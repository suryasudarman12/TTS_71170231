package com.uts.vehicle;

public class Truck extends MotorVehicle{
    private int capacity;

    public Truck(Engine dieselEngine, Transmison manualTransmision, Tire trailTire, Wheel truckWheel, int capacity){
        super();
        this.capacity = capacity;


    }

    @Override
    public void backward() {

    }

    @Override
    public void brake() {

    }

    @Override
    public void forward() {

    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public void turnLeft() {

    }

    @Override
    public void turnRight() {

    }
}
