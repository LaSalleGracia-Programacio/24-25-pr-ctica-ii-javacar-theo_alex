package org.JavaCar;

import java.util.List;

public class Moto extends Vehicle {
    private int cilindrada;

    public Moto(String matricula, String marca, String model, double preuBase, int cilindrada, Motor motor, Roda[] rodes) {
        super(matricula, marca, model, preuBase, motor, rodes, "Moto");
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public double calcularPreu(int dies) {
        if (cilindrada > 500) {
            return preuBase * dies + 5 * dies;
        }
        return preuBase * dies;
    }
}