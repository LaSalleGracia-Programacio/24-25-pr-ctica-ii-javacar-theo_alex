package org.JavaCar;

public class Motor {
    private String tipus;
    private int potencia;

    public Motor(String tipus, int potencia){
        this.tipus = tipus;
        this.potencia = potencia;
    }

    public int getPotencia(){
        return potencia;
    }
    public String getTipus(){
        return tipus;
    }
    public void setPotencia(int potencia){
        this.potencia = potencia;
    }
    public void setTipus(String tipus){
        this.tipus = tipus;
    }
    public String toString(){
        return "Tipus: " + tipus + ", Potencia: " + potencia;
    }

}
