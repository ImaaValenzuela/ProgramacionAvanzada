package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.*;
import imaavalenzuela.empresatransporte.service.GestionTransporte;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestionTransporteTest {

    @Test
    void testObtenerVehiculosDisponibles() {
        GestionTransporte gestion = new GestionTransporte();
        Bicicleta bici = new Bicicleta();
        Automovil auto = new Automovil();
        Camion camion = new Camion();

        gestion.agregarVehiculo(bici);
        gestion.agregarVehiculo(auto);
        gestion.agregarVehiculo(camion);

        Paquete paquete = new Paquete(0.25, 0.25, 0.25, 10, "La mismisima");

        Vehiculo[] disponibles = gestion.obtenerVehiculosDisponibles(paquete);

        assertTrue(disponibles.length >= 1);
        assertTrue(disponibles[0].puedeTransportar(paquete));
    }
}
