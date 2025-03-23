package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        boolean running = true;
        do {
            System.out.println("Benvingut al servei de lloguer de vehicles!");
            System.out.println("Si us plau escull com procedir:");
            System.out.println("1. Llogar vehicle");
            System.out.println("2. Retornar vehicle");
            System.out.println("3. Gestiona els teus lloguers");
            System.out.println("4. Preferències");
            System.out.println("5. Cerca vehicles disponibles");
            System.out.println("6. Sortir");

            try {
                int opcio = Main.scanner.nextInt();
                Main.scanner.nextLine();

                switch (opcio) {
                    case 1:
                        System.out.println("Introdueix el nombre de dies per al lloguer:");
                        int dies = Main.scanner.nextInt();
                        Main.scanner.nextLine();
                        if (dies <= 0) {
                            System.out.println("El nombre de dies ha de ser major que 0.");
                            break;
                        }
                        new Llogar(vehicles, dies);
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
                        running = false;
                        break;
                    default:
                        System.out.println("Opció no vàlida. Torna-ho a provar.");
                        break;
                }
            } catch (Exception e) {
                System.out.println("Entrada no vàlida. Si us plau, introdueix un número.");
                Main.scanner.nextLine();
            }
        } while (running);
    }
}