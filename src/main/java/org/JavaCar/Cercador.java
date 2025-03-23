package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class Cercador {
    public static List<Vehicle> cercar(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Cerca per:");
        System.out.println("1. Model");
        System.out.println("2. Preu");
        System.out.println("3. Motor");
        System.out.println("4. Tipus de vehicle");
        System.out.println("5. Número de plaçes");
        System.out.println("6. Matrícula");
        int opcio = Main.scanner.nextInt();
        Main.scanner.nextLine();

        switch (opcio) {
            case 1:
                resultats = cercarPerModel(vehicles);
                break;
            case 2:
                resultats = cercarPerPreu(vehicles);
                break;
            case 3:
                resultats = cercarPerMotor(vehicles);
                break;
            case 4:
                resultats = cercarPerTipusVehicle(vehicles);
                break;
            case 5:
                resultats = cercarPerPlaces(vehicles);
                break;
            case 6:
                resultats = cercarPerMatricula(vehicles);
                break;
            default:
                System.out.println("Opció no vàlida.");
                break;
        }

        return resultats;
    }
    public static List<Vehicle> cercarPerModel(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Introdueix el model a cercar:");
        String modelCerca = Main.scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getModel().equalsIgnoreCase(modelCerca)) {
                resultats.add(vehicle);
            }
        }
        return resultats;
    }
    public static List<Vehicle> cercarPerPreu(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Introdueix el preu màxim:");
        double preuMaxim = Main.scanner.nextDouble();
        Main.scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPreuBase() <= preuMaxim) {
                resultats.add(vehicle);
            }
        }
        return resultats;
    }
    public static List<Vehicle> cercarPerMotor(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Introdueix el tipus de motor:");
        String tipusMotor = Main.scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMotor().getTipus().equalsIgnoreCase(tipusMotor)) {
                resultats.add(vehicle);
            }
        }
        return resultats;
    }
    public static List<Vehicle> cercarPerTipusVehicle(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Introdueix el tipus de vehicle:");
        String tipusVehicle = Main.scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getTipusVehicle().equalsIgnoreCase(tipusVehicle)) {
                resultats.add(vehicle);
            }
        }
        return resultats;
    }
    public static List<Vehicle> cercarPerPlaces(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Introdueix el número de plaçes:");
        int placesCerca = Main.scanner.nextInt();
        Main.scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getPlaces() == placesCerca) {
                resultats.add(vehicle);
            }
        }
        return resultats;
    }
    public static List<Vehicle> cercarPerMatricula(List<Vehicle> vehicles) {
        List<Vehicle> resultats = new ArrayList<>();
        System.out.println("Introdueix la matrícula a cercar:");
        String matricula = Main.scanner.nextLine();
        for (Vehicle vehicle : vehicles) {
            if (vehicle.getMatricula().equalsIgnoreCase(matricula)) {
                resultats.add(vehicle);
            }
        }
        return resultats;
    }
}