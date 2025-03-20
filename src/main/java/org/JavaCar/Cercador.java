package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class Cercador {
    public static void cercar(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Cerca per:");
        System.out.println("1. Model");
        System.out.println("2. Preu");
        System.out.println("3. Motor");
        System.out.println("4. Tipus de vehicle");
        System.out.println("5. Número de plaçes");
        int opcio = Main.scanner.nextInt();
        Main.scanner.nextLine();

        switch (opcio) {
            case 1:
                System.out.println("Introdueix el model a cercar:");
                String modelCerca = Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getModel().equals(modelCerca)) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 2:
                System.out.println("Introdueix el preu màxim:");
                double preuMaxim = Main.scanner.nextDouble();
                Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getPreuBase() <= preuMaxim) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 3:
                System.out.println("Introdueix el tipus de motor:");
                String tipusMotor = Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getMotor().getTipus().equals(tipusMotor)) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 4:
                System.out.println("Introdueix el tipus de vehicle:");
                String tipusVehicle = Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getTipusVehicle().equals(tipusVehicle)) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 5:
                System.out.println("Introdueix el número de plaçes:");
                int placesCerca = Main.scanner.nextInt();
                Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getPlaces() == placesCerca) {
                        resultats.add(vehicle);
                    }
                }
                if (resultats.isEmpty()) {
                    System.out.println("No s'han trobat resultats.");
                } else {
                    System.out.println("Resultats trobats:");
                    for (Vehicle vehicle : resultats) {
                        System.out.println(vehicle);
                    }
                }
        }
    }
}