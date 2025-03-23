package org.JavaCar;

import java.util.List;

public class Llogar {
    public Llogar(List<Vehicle> vehicles, int dies) {
        List<Vehicle> resultats = Cercador.cercar(vehicles);

        if (!resultats.isEmpty()) {
            System.out.println("Selecciona un vehicle per llogar (introdueix el número):");
            for (int i = 0; i < resultats.size(); i++) {
                Vehicle vehicle = resultats.get(i);
                System.out.println((i + 1) + ". " + vehicle.getMatricula() + " - " + vehicle.getModel() + " (" + vehicle.getPreuBase() + "€/dia)");
            }

            int seleccio = Main.scanner.nextInt();
            Main.scanner.nextLine();

            if (seleccio > 0 && seleccio <= resultats.size()) {
                Vehicle vehicleSeleccionat = resultats.get(seleccio - 1);
                boolean added = GestorLloguers.afegirLloguer(vehicleSeleccionat.getMatricula(), vehicleSeleccionat, dies);
                if (added) {
                    System.out.println("Vehicle llogat amb èxit: " + vehicleSeleccionat.getMatricula());
                } else {
                    System.out.println("No s'ha pogut llogar el vehicle.");
                }
            } else {
                System.out.println("Selecció no vàlida.");
            }
        } else {
            System.out.println("No s'han trobat vehicles per llogar.");
        }
    }
}