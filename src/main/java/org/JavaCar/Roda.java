package org.JavaCar;

public class Roda {
    private String marca;
    private double diametre;

    public Roda(String marca, Double diametre){
        this.marca = marca;
        this.diametre = diametre;
    }
    public String getMarca(){
        return marca;
    }
    public Double getDiametre(){
        return diametre;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public void setDiametre(double diametre){
        this.diametre = diametre;
    }
}
