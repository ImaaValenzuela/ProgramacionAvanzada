package imaavalenzuela.empresatransporte.service;

import imaavalenzuela.empresatransporte.model.*;

import java.util.ArrayList;
import java.util.List;

public class GestionTransporte {
    private List<Vehiculo> vehiculos;

    public GestionTransporte() {
        vehiculos = new ArrayList<>();
        vehiculos.add(new Bicicleta());
        vehiculos.add(new Automovil());
        vehiculos.add(new Camion());
    }

    public List<Vehiculo> obtenerVehiculosDisponibles(Paquete paquete) {
        List<Vehiculo> disponibles = new ArrayList<>();
        for (Vehiculo v : vehiculos) {
            if (v.puedeTransportar(paquete)) {
                disponibles.add(v);
            }
        }
        return disponibles;
    }

    public void asignarPaquete(Vehiculo vehiculo, Paquete paquete) {
        vehiculo.agregarPaquete(paquete);
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}
