package imaavalenzuela.empresatransporte.service;

import imaavalenzuela.empresatransporte.model.*;

public class GestionTransporte {
    private Vehiculo[] vehiculos = new Vehiculo[10];

    public void agregarVehiculo(Vehiculo vehiculo) {
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i] == null) {
                vehiculos[i] = vehiculo;
                break;
            }
        }
    }

    public Vehiculo[] obtenerVehiculosDisponibles(Paquete paquete) {
        Vehiculo[] disponibles = new Vehiculo[vehiculos.length];
        int contador = 0;

        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo != null && vehiculo.puedeTransportar(paquete)) {
                disponibles[contador++] = vehiculo;
            }
        }

        Vehiculo[] resultado = new Vehiculo[contador];
        for (int i = 0; i < contador; i++) {
            resultado[i] = disponibles[i];
        }
        return resultado;
    }
}
