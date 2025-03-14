package org.JavaCar;

import java.util.List;

public class Vehicle {
    private String matricula;
    private String marca;
    private String model;
    private double preuBase;
    private Motor motor;
    private List<Roda>rodes;
    private String etiquetaAmbiental;

    public Vehicle(String matricula, String marca, String model, double preuBase,
                   Motor motor, List<Roda> rodes){
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes;
        this.calcularEtiquetaAmbiental();
    }
    public void calcularEtiquetaAmbiental(){
        if (motor.getPotencia() < 100){
            this.etiquetaAmbiental = "ECO";
        } else {
            this.etiquetaAmbiental = "C";
        }
    }
    public String getEtiquetaAmbiental(){
        return etiquetaAmbiental;
    }
    public double getPreuBase(){
        return preuBase;
    }
}
