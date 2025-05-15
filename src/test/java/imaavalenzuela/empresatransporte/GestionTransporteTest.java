package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.*;
import imaavalenzuela.empresatransporte.service.GestionTransporte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestionTransporteTest {

    private GestionTransporte gestion;
    private List<Vehiculo> vehiculos;

    @BeforeEach
    public void inicializar() {
        gestion = new GestionTransporte();
        vehiculos = new ArrayList<>();
        vehiculos.add(new Bicicleta());
        vehiculos.add(new Automovil());
        vehiculos.add(new Camion());
        gestion.setVehiculos(vehiculos);
    }

    @Test
    void debeRetornarVehiculosDisponiblesParaPaqueteLiviano() {
        // Given
        Paquete paqueteLiviano = new Paquete(0.2, 0.2, 0.2, 5, "Disponibilicity");

        gestion.setVehiculos(vehiculos);

        // When
        List<Vehiculo> disponibles = gestion.obtenerVehiculosDisponibles(paqueteLiviano);


        // Then
        boolean tieneBicicleta = false;
        boolean tieneAutomovil = false;
        boolean tieneCamion = false;

        for (Vehiculo v : disponibles) {
            if (v instanceof Bicicleta) {
                tieneBicicleta = true;
            } else if (v instanceof Automovil) {
                tieneAutomovil = true;
            } else if (v instanceof Camion) {
                tieneCamion = true;
            }
        }

        assertTrue(tieneBicicleta, "Debe contener al menos una Bicicleta");
        assertTrue(tieneAutomovil, "Debe contener al menos un Automovil");
        assertTrue(tieneCamion, "Debe contener al menos un Camion");
    }
}
