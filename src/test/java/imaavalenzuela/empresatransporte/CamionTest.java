package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.Camion;
import imaavalenzuela.empresatransporte.model.Paquete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamionTest {


    @Test
    void debeAceptarPaqueteDentroDeLimitesDePesoYVolumen() {
        // Given
        Camion camion = new Camion();
        Paquete paquete = new Paquete(2, 2, 2, 1000, "Ciudamion");

        // When
        boolean puedeTransportar = camion.puedeTransportar(paquete);

        // Then
        assertTrue(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteConPesoExcesivo() {
        // Given
        Camion camion = new Camion();
        Paquete paquete = new Paquete(2, 2, 2, 20000, "Ciudamion");

        // When
        boolean puedeTransportar = camion.puedeTransportar(paquete);

        // Then
        assertFalse(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteConVolumenExcesivo() {
        // Given
        Camion camion = new Camion();
        Paquete paquete = new Paquete(10, 2, 2, 1000, "Ciudamion");

        // When
        boolean puedeTransportar = camion.puedeTransportar(paquete);

        // Then
        assertFalse(puedeTransportar);
    }
}