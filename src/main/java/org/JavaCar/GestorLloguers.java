package org.JavaCar;

import java.util.ArrayList;
import java.util.List;

public class GestorLloguers {
    private static List<Lloguer> lloguersActius = new ArrayList<>();
    public static boolean eliminarLloguer(String matricula) {
        Lloguer lloguer = buscarLloguer(matricula);
        if (lloguer != null) {
            lloguersActius.remove(lloguer);
            return true;
        }
        return false;
    }

    private static Lloguer buscarLloguer(String matricula) {
        for (Lloguer lloguer : lloguersActius) {
            if (lloguer.getVehicle().getMatricula().equalsIgnoreCase(matricula)) {
                return lloguer;
            }
        }
        return null;
    }

    public static void afegirLloguer(Lloguer lloguer) {
        lloguersActius.add(lloguer);
    }
    public static void amplarDies(){
        // Afegir input a programa i processar
    }

    public static void gestionarLloguers() {
            if (lloguersActius.isEmpty()) {
                System.out.println("No hi ha lloguers actius.");
            } else {
                System.out.println("Lloguers actius:");
                for (Lloguer lloguer : lloguersActius) {
                    System.out.println("Vehicle: " + lloguer.getVehicle().getMatricula() + ", Dies: " + lloguer.getDies());
                }
            }
        }

    public static double calcularIngressosTotals(List<Vehicle> vehicles, int dies) {
        double ingressosTotals = 0;
        for (Vehicle vehicle : vehicles) {
            ingressosTotals = ingressosTotals + vehicle.calcularPreu(dies);
        }
        return ingressosTotals;
    }
}