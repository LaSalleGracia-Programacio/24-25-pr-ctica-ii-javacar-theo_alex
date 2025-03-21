package org.JavaCar;

import java.util.List;

public class Furgoneta extends Vehicle {
    private double capacitatCarga;

    public Furgoneta(String matricula, String marca, String model, double preuBase, double capacitatCarga, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, List.of(rodes), "Furgoneta");
        this.capacitatCarga = capacitatCarga;
    }

    public double getCapacitatCarga() {
        return capacitatCarga;
    }

    public void setCapacitatCarga(double capacitatCarga) {
        this.capacitatCarga = capacitatCarga;
    }

    @Override
    public double calcularPreu(int dies) {
        if (capacitatCarga > 1000) {
            return preuBase * dies + 10 * dies;
        }
        return preuBase * dies;
    }
}