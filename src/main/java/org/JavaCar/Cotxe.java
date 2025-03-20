package org.JavaCar;

import java.util.List;

public class Cotxe extends Vehicle {
    private int plaçes;

    public Cotxe(String matricula, String marca, String model, double preuBase, Motor motor, List<Roda> rodes, int plaçes) {
        super(matricula, marca, model, preuBase, motor, rodes, "Cotxe");
        this.plaçes = plaçes;
    }
    public int getPlaces() {
        return this.plaçes;
    }

    public void setPlaçes(int plaçes) {
        this.plaçes = plaçes;
    }
}