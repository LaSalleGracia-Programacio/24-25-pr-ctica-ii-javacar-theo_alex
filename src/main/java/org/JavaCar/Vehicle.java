package org.JavaCar;

import java.util.List;

public abstract class Vehicle implements Llogable {
    protected String matricula;
    protected String marca;
    protected String model;
    protected double preuBase;
    private Motor motor;
    private List<Roda> rodes;
    private String etiquetaAmbiental;
    private String tipus;


    public Vehicle(String matricula, String marca, String model, double preuBase,
                   Motor motor, Roda[] rodes, String tipus) {
        this.matricula = matricula;
        this.marca = marca;
        this.model = model;
        this.preuBase = preuBase;
        this.motor = motor;
        this.rodes = rodes != null ? List.of(rodes) : null;
        this.calcularEtiquetaAmbiental();
        this.tipus = tipus;
    }

    public void calcularEtiquetaAmbiental() {
        if (motor == null) {
            this.etiquetaAmbiental = "Sense distintiu ambiental";
            return;
        }

        String tipusCombustible = motor.getTipus();
        int potencia = motor.getPotencia();

        switch (tipusCombustible) {
            case "Gasolina":
                if (potencia >= 100) {
                    this.etiquetaAmbiental = "C";
                } else if (potencia >= 50) {
                    this.etiquetaAmbiental = "B";
                } else {
                    this.etiquetaAmbiental = "Sense distintiu ambiental";
                }
                break;

            case "Dièsel":
                if (potencia >= 120) {
                    this.etiquetaAmbiental = "C";
                } else if (potencia >= 80) {
                    this.etiquetaAmbiental = "B";
                } else {
                    this.etiquetaAmbiental = "Sense distintiu ambiental";
                }
                break;

            case "Híbrid":
                if (potencia >= 80) {
                    this.etiquetaAmbiental = "ECO";
                } else {
                    this.etiquetaAmbiental = "B";
                }
                break;

            case "Elèctric":
                this.etiquetaAmbiental = "Zero emissions";
                break;

            case "GNC":
            case "GLP":
                this.etiquetaAmbiental = "ECO";
                break;

            default:
                this.etiquetaAmbiental = "Sense distintiu ambiental";
                break;
        }
    }

    public String getEtiquetaAmbiental() {
        return etiquetaAmbiental;
    }

    public double getPreuBase() {
        return preuBase;
    }

    public Motor getMotor() {
        return motor;
    }

    public String getMatricula() {
        return matricula;
    }

    public String getMarca() {
        return marca;
    }

    public String getModel() {
        return model;
    }

    public String getTipusVehicle() {
        return tipus;
    }

    public Roda[] getRodes() {
        return rodes != null ? rodes.toArray(new Roda[0]) : null;
    }

    public int getPlaces() {
        return 0;
    }

    public void setEtiquetaAmbiental(String etiquetaAmbiental) {
        this.etiquetaAmbiental = etiquetaAmbiental;
    }

    public void setPreuBase(double preuBase) {
        this.preuBase = preuBase;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
        this.calcularEtiquetaAmbiental();
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setTipusVehicle(String tipus) {
        this.tipus = tipus;
    }

}