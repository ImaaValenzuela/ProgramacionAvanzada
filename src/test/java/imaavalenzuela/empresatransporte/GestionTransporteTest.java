package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.*;
import imaavalenzuela.empresatransporte.service.GestionTransporte;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GestionTransporteTest {

    private GestionTransporte gestion;

    @BeforeEach
    public void inicializar() {
        gestion = new GestionTransporte();
    }

    @Test
    void debeRetornarVehiculosDisponiblesParaPaqueteLiviano() {
        // Given
        Paquete paqueteLiviano = new Paquete(0.2, 0.2, 0.2, 5, "Disponibilicity");

        // When
        List<Vehiculo> disponibles = gestion.obtenerVehiculosDisponibles(paqueteLiviano);

        // Then
        assertTrue(disponibles.stream().anyMatch(v -> v instanceof Bicicleta));
        assertTrue(disponibles.stream().anyMatch(v -> v instanceof Automovil));
        assertTrue(disponibles.stream().anyMatch(v -> v instanceof Camion));
    }
}
