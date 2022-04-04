package com.uts.vehicle;

public class App {
    public static void main( String[] args )
    {
        Engine dieselEngine = new Engine("Solar", 3500);
        Transmison manualTransmision = new Transmison("Manual", 6);
        Tire trailTire = new Tire("Trail", 309, 70, 20);
        Wheel truckWheel = new Wheel(8, 18);
        Truck truckHino = new Truck(dieselEngine, manualTransmision, trailTire, truckWheel, 4500);
        truckHino.setVehicleName("HINO DUTRO CARGO 110 SD");
        truckHino.setEngine(dieselEngine);
        truckHino.setTransmison(manualTransmision);
        truckHino.setTire(trailTire);
        truckHino.setWheel(truckWheel);

        System.out.println("Nama kendaraan : "+ truckHino.getVehicleName());
        System.out.println("CC mesin: "+ truckHino.getEngine().getCapacity());
        System.out.println("Tipe transmisi: "+ truckHino.getTransmison().getTransType());
        System.out.println("Tipe Ban : "+ truckHino.getTire().getTiretype());
        System.out.println("Diameter Roda : R"+truckHino.getWheel().getDiameter());
    }
}
