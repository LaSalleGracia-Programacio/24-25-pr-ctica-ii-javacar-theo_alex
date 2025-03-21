package org.JavaCar;

import java.util.List;

public class Cotxe extends Vehicle {
    private int places;

    public Cotxe(String matricula, String marca, String model, double preuBase, Motor motor, List<Roda> rodes, int places) {
        super(matricula, marca, model, preuBase, motor, rodes, "Cotxe");
        this.places = places;
    }

    public int getPlaces() {
        return this.places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }
}