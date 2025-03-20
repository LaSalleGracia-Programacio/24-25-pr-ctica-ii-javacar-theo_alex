package org.JavaCar;

public class Retornar {
    public Retornar() {
        System.out.println("Introdueix la matrícula del vehicle a retornar:");
        String matricula = Main.scanner.nextLine();
        System.out.println("Vehicle retornat: " + matricula);
    }
}