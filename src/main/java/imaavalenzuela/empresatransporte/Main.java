package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.*;
import imaavalenzuela.empresatransporte.service.GestionTransporte;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionTransporte gestion = new GestionTransporte();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las dimensiones del paquete (alto, ancho, profundo) en metros:");
        double alto = scanner.nextDouble();
        double ancho = scanner.nextDouble();
        double profundo = scanner.nextDouble();

        System.out.println("Ingrese el peso del paquete en kilogramos:");
        double peso = scanner.nextDouble();

        scanner.nextLine(); // Limpiar buffer
        System.out.println("Ingrese el destino:");
        String destino = scanner.nextLine();

        Paquete paquete = new Paquete(alto, ancho, profundo, peso, destino);

        List<Vehiculo> disponibles = gestion.obtenerVehiculosDisponibles(paquete);

        if (disponibles.isEmpty()) {
            System.out.println("No hay vehículos disponibles para transportar este paquete.");
        } else {
            System.out.println("Vehículos disponibles:");
            for (int i = 0; i < disponibles.size(); i++) {
                System.out.println((i + 1) + ". " + disponibles.get(i).getClass().getSimpleName());
            }

            System.out.println("Seleccione un vehículo (número):");
            int seleccion = scanner.nextInt();
            Vehiculo elegido = disponibles.get(seleccion - 1);
            gestion.asignarPaquete(elegido, paquete);

            System.out.println("Paquete asignado exitosamente al " + elegido.getClass().getSimpleName());
        }

        scanner.close();
    }
}
