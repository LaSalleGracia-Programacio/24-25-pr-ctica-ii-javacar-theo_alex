package org.JavaCar;


import java.util.ArrayList;
import java.util.List;

public class Programa {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();
        int opcio;
        System.out.println("Benvingut al servei de lloguer de vehicles!");
        System.out.println("Si us plau escull com procedir");
        System.out.println("1. Llogar vehicle");
        System.out.println("2. Retornar vehicle");
        System.out.println("3. Gestiona els teus lloguers");
        System.out.println("4. Preferències");
        System.out.println("5. Sortir");
        opcio = Main.scanner.nextInt();

        switch (opcio){
            case 1:
                new Lloguer();
                break;
            case 5:
                String criteri = Main.scanner.nextLine();
                Cercador.cercar(vehicles, criteri);
                break;
        }
    }
}
