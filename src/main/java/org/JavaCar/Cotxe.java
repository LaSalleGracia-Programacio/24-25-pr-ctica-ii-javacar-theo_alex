package org.JavaCar;

import java.util.List;

public class Cotxe extends Vehicle {
    private int places;

    public Cotxe(String matricula, String marca, String model, double preuBase, int places, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, List.of(rodes), "Cotxe");
        this.places = places;
    }

    @Override
    public int getPlaces() {
        return this.places;
    }

    public void setPlaces(int places) {
        this.places = places;
    }

    @Override
    public double calcularPreu(int dies) {
        return preuBase * dies;
    }
}