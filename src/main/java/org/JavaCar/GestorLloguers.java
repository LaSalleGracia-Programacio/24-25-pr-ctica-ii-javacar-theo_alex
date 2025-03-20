package org.JavaCar;

public class GestorLloguers {
    public static void gestionarLloguers() {
        System.out.println("--- GESTIÓ DE LLOGUERS ---");
        System.out.println("1. Veure lloguers actius");
        System.out.println("2. Ampliar duració del lloguer");
        System.out.println("3. Tornar al menú principal");

        int subOpcio = Main.scanner.nextInt();
        Main.scanner.nextLine();

        switch (subOpcio) {
            case 1:
                System.out.println("Lloguers actius:");
                // Add logic to display active rentals
                break;
            case 2:
                System.out.println("Introdueix matrícula per ampliar:");
                String matricula = Main.scanner.nextLine();
                // Add logic to extend rental duration
                break;
            case 3:
                return;
            default:
                System.out.println("Opció no vàlida");
        }
    }
}
