package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        while (true) {
            System.out.println("Benvingut al servei de lloguer de vehicles!");
            System.out.println("Si us plau escull com procedir:");
            System.out.println("1. Llogar vehicle");
            System.out.println("2. Retornar vehicle");
            System.out.println("3. Gestiona els teus lloguers");
            System.out.println("4. Preferències");
            System.out.println("5. Cerca vehicles disponibles");
            System.out.println("6. Sortir");

            int opcio = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (opcio) {
                case 1:
                    System.out.println("Introdueix la matrícula del vehicle a llogar:");
                    String matricula = Main.scanner.nextLine();
                    Vehicle vehicle = null;
                    for (Vehicle v : vehicles) {
                        if (v.getMatricula().equals(matricula)) {
                            vehicle = v;
                            break;
                        }
                    }
                    if (vehicle != null) {
                        System.out.println("Introdueix el nombre de dies de lloguer:");
                        int dies = Main.scanner.nextInt();
                        Main.scanner.nextLine();
                        Lloguer lloguer = new Lloguer(vehicle, dies);
                        GestorLloguers.afegirLloguer(lloguer);
                        System.out.println("Vehicle llogat amb èxit: " + vehicle.getMatricula());
                    } else {
                        System.out.println("No s'ha trobat cap vehicle amb la matrícula: " + matricula);
                    }
                    break;
                case 2:
                    new Retornar();
                    break;
                case 3:
                    GestorLloguers.gestionarLloguers();
                    break;
                case 4:
                    Preferències.mostrarMenu();
                    break;
                case 5:
                    Cercador.cercar(vehicles);
                    break;
                case 6:
                    System.out.println("Adeu!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna-ho a provar.");
                    break;
            }
        }
    }
}