package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.Bicicleta;
import imaavalenzuela.empresatransporte.model.Paquete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {

    @Test
    void testPuedeTransportarPaqueteValido(){
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(0.25, 0.25, 0.25, 10, "Ciudacleta");
        assertTrue(bicicleta.puedeTransportar(paquete));
    }

    @Test
    void testRechazaPorVolumen(){
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(1, 1, 1, 10, "Ciudacleta");
        assertFalse(bicicleta.puedeTransportar(paquete));
    }

    @Test
    void testRechazaPorPeso(){
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(0.25, 0.25, 0.25, 20, "Ciudacleta");
        assertFalse(bicicleta.puedeTransportar(paquete));
    }
}
