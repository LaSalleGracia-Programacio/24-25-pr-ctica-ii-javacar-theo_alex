package org.JavaCar;

public class Retornar {
    public Retornar() {
        System.out.println("Introdueix la matrícula del vehicle a retornar:");
        String matricula = Main.scanner.nextLine();

        boolean removed = GestorLloguers.eliminarLloguer(matricula);

        if (removed) {
            System.out.println("Vehicle retornat amb èxit: " + matricula);
        } else {
            System.out.println("No s'ha trobat cap lloguer actiu amb la matrícula: " + matricula);
        }
    }
}