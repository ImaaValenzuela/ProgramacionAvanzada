package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.Camion;
import imaavalenzuela.empresatransporte.model.Paquete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CamionTest {

    @Test
    void testPuedeTransportarDentroDeLimites() {
        Camion camion = new Camion();
        Paquete paquete = new Paquete(2, 2, 2, 1000, "Ciudamion");
        assertTrue(camion.puedeTransportar(paquete));
    }

    @Test
    void testRechazaPorPesoExcesivo() {
        Camion camion = new Camion();
        Paquete paquete = new Paquete(2, 2, 2, 20000, "Ciudamion");
        assertFalse(camion.puedeTransportar(paquete));
    }

    @Test
    void testRechazaPorVolumenExcesivo() {
        Camion camion = new Camion();
        Paquete paquete = new Paquete(10, 2, 2, 1000, "Ciudamion");
        assertFalse(camion.puedeTransportar(paquete));
    }
}