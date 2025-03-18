package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class Cercador {
    public static void cercar(List<Vehicle>vehicles, String criteri, String marca, String model, double preuBase, Motor motor, List<Roda> rodes, int plaçes) {
        List<Vehicle> resultats = new ArrayList<>();
        int opcio;
        System.out.println("Cerca per:");
        System.out.println("1. Model");
        System.out.println("2. Preu");
        System.out.println("3. Motor");
        System.out.println("4. Tipus de vehicle");
        System.out.println("5. Número de plaçes");
        opcio = Main.scanner.nextInt();

        switch (opcio){
            case 1:
                System.out.println("Introdueix el model a cercar:");
                String modelCerca = Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getModel(modelCerca)) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 2:
                System.out.println("Introdueix el preu màxim:");
                double preuCerca = Main.scanner.nextDouble();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getPreuBase() <= preuCerca) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 3:
                System.out.println("Introdueix el tipus de motor:");
                String tipusMotor = Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles) {
                    if (vehicle.getMotor().getTipus(tipusMotor)) {
                        resultats.add(vehicle);
                    }
                }
                break;
            case 4:
                System.out.println("Introdueix el tipus de vehicle:");
                String tipusVehicle = Main.scanner.nextLine();
                for (Vehicle vehicle : vehicles){
                    if (vehicle.getTipusVehicle(tipusVehicle)){
                        resultats.add(vehicle);
                    }
                }
            case 5:
                System.out.println("Introdueix el número de plaçes");
                int plaçesCerca = Main.scanner.nextInt();
                for (Vehicle vehicle : vehicles){
                    if (vehicle.getPlaçes() == plaçesCerca){
                        resultats.add(vehicle);
                    }
                }
        }
    }
}
