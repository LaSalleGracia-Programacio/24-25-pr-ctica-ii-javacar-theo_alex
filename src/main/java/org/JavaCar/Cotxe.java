package org.JavaCar;

public class Cotxe extends Vehicle {
    private int places;

    public Cotxe(String matricula, String marca, String model, double preuBase, int places, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, "Cotxe");
        this.places = places;
    }

    @Override
    public double calcularPreu(int dies) {
        return preuBase * dies;
    }

    public int getPlaces() {
        return places;
    }
}