package org.JavaCar;

import java.util.List;

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
        this.dies = this.dies + diesAddicionals;
    }
}