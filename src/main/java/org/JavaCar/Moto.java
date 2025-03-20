package org.JavaCar;

import java.util.List;

public class Moto extends Vehicle {
    private int cilindrada;

    public Moto(String matricula, String marca, String model, double preuBase, Motor motor, List<Roda> rodes, int cilindrada) {
        super(matricula, marca, model, preuBase, motor, rodes, "Moto");
        this.cilindrada = cilindrada;
    }

    public int getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(int cilindrada) {
        this.cilindrada = cilindrada;
    }
}