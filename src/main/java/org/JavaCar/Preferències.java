package org.JavaCar;

public class Preferències {
    public static void mostrarMenu() {
        try {
            System.out.println("--- PREFERÈNCIES ---");
            System.out.println("1. Canviar mètode de pagament");
            System.out.println("2. Configurar notificacions");
            System.out.println("3. Tornar al menú principal");

            int subOpcio = Main.scanner.nextInt();
            Main.scanner.nextLine();

            switch (subOpcio) {
                case 1:
                    System.out.println("Nou mètode de pagament:");
                    String metode = Main.scanner.nextLine();
                    break;
                case 2:
                    System.out.println("Vols rebre notificacions? (S/N)");
                    String resposta = Main.scanner.nextLine();
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opció no vàlida");
            }
        } catch (Exception e) {
            System.out.println("Error al gestionar les preferències.");
        }
    }
}
