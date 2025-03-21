package org.JavaCar;

public class Lloguer {
    private Vehicle vehicle;
    private int dies;

    public Lloguer(Vehicle vehicle, int dies) {
        this.vehicle = vehicle;
        this.dies = dies;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public int getDies() {
        return dies;
    }

    public void ampliarDies(int diesAddicionals) {
        this.dies += diesAddicionals;
    }

    public double preuFinal() {
        return vehicle.preuTotal() * dies;
    }
}