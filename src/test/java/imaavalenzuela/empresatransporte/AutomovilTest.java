package imaavalenzuela.empresatransporte;
import imaavalenzuela.empresatransporte.model.Automovil;
import imaavalenzuela.empresatransporte.model.Paquete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovilTest {
    @Test
    void testPuedeTransportarPaqueteDentroDeLimites() {
        Automovil auto = new Automovil();
        Paquete paquete = new Paquete(1, 1, 1, 100, "Baticiudad");
        assertTrue(auto.puedeTransportar(paquete));
    }

    @Test
    void testRechazaPorPeso() {
        Automovil auto = new Automovil();
        Paquete paquete = new Paquete(1, 1, 1, 600, "Baticiudad");
        assertFalse(auto.puedeTransportar(paquete));
    }

    @Test
    void testRechazaPorDestinoRepetido() {
        Automovil auto = new Automovil();
        Paquete paquete1 = new Paquete(1, 1, 1, 100, "Baticiudad");
        Paquete paquete2 = new Paquete(1, 1, 1, 100, "Baticiudad");

        auto.agregarPaquete(paquete1);
        assertFalse(auto.puedeTransportar(paquete2));
    }

    @Test
    void testRechazaPorMasDe3Ciudades() {
        Automovil auto = new Automovil();
        auto.agregarPaquete(new Paquete(1, 1, 1, 100, "Baticiudad"));
        auto.agregarPaquete(new Paquete(1, 1, 1, 100, "Paticiudad"));
        auto.agregarPaquete(new Paquete(1, 1, 1, 100, "Gaticiudad"));
        Paquete nuevo = new Paquete(1, 1, 1, 100, "Bataciudad");

        assertFalse(auto.puedeTransportar(nuevo));
    }
}
