package org.JavaCar;

public class Lloguer {
    public Lloguer() {
        System.out.println("Introdueix la matrícula del vehicle a llogar:");
        String matricula = Main.scanner.nextLine();
        System.out.println("Lloguer processat per matrícula: " + matricula);
    }
}