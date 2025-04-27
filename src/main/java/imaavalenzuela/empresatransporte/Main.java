package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.*;
import imaavalenzuela.empresatransporte.service.GestionTransporte;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionTransporte gestion = new GestionTransporte();
        Scanner scanner = new Scanner(System.in);

        gestion.agregarVehiculo(new Bicicleta());
        gestion.agregarVehiculo(new Automovil());
        gestion.agregarVehiculo(new Camion());

        int opcion;
        do {
            System.out.println("\n--- GESTION DE TRANSPORTE ---");
            System.out.println("1. Cargar nuevo paquete");
            System.out.println("2. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            if (opcion == 1) {
                System.out.print("Alto (m): ");
                double alto = scanner.nextDouble();
                System.out.print("Ancho (m): ");
                double ancho = scanner.nextDouble();
                System.out.print("Profundidad (m): ");
                double profundidad = scanner.nextDouble();
                System.out.print("Peso (kg): ");
                double peso = scanner.nextDouble();
                scanner.nextLine(); // Consumir salto de línea
                System.out.print("Destino (ciudad): ");
                String destino = scanner.nextLine();

                Paquete paquete = new Paquete(alto, ancho, profundidad, peso, destino);

                Vehiculo[] vehiculosDisponibles = gestion.obtenerVehiculosDisponibles(paquete);
                if (vehiculosDisponibles.length == 0) {
                    System.out.println("No hay vehículos disponibles para este paquete.");
                } else {
                    System.out.println("\nVehículos disponibles:");
                    for (int i = 0; i < vehiculosDisponibles.length; i++) {
                        System.out.println((i + 1) + ". " + obtenerNombreVehiculo(vehiculosDisponibles[i]));
                    }

                    System.out.print("Seleccione el número del vehículo para asignar el paquete: ");
                    int eleccion = scanner.nextInt();
                    scanner.nextLine(); // Consumir salto de línea

                    if (eleccion >= 1 && eleccion <= vehiculosDisponibles.length) {
                        vehiculosDisponibles[eleccion - 1].agregarPaquete(paquete);
                        System.out.println("Paquete asignado exitosamente.");
                    } else {
                        System.out.println("Elección inválida. No se asignó el paquete.");
                    }
                }
            }
        } while (opcion != 2);

        System.out.println("Programa finalizado.");
    }

    private static String obtenerNombreVehiculo(Vehiculo vehiculo) {
        if (vehiculo instanceof Bicicleta) {
            return "Bicicleta";
        } else if (vehiculo instanceof Automovil) {
            return "Automóvil";
        } else if (vehiculo instanceof Camion) {
            return "Camión";
        } else {
            return "Vehículo desconocido";
        }
    }
}
