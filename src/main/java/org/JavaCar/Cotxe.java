package org.JavaCar;

import java.util.List;

public class Cotxe {
    private int plaçes;

    public Cotxe(String matricula, String marca, String model, double preuBase, Motor motor, List<Roda> rodes, int plaçes){
        super();
        this.plaçes = plaçes;
    }
    public int getPlaçes(){
        return plaçes;
    }
}
