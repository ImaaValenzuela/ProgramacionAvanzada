package imaavalenzuela.empresatransporte;

import imaavalenzuela.empresatransporte.model.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BicicletaTest {
    @Test
    void debeAceptarPaqueteConPesoYVolumenAdecuadoYUnicoDestino() {
        // Given
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(0.25, 0.25, 0.25, 10, "Ciudacleta");

        // When
        boolean puedeTransportar = bicicleta.puedeTransportar(paquete);

        // Then
        assertTrue(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteConVolumenExcesivo() {
        // Given
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(1, 1, 1, 10, "Ciudacleta");

        // When
        boolean puedeTransportar = bicicleta.puedeTransportar(paquete);

        // Then
        assertFalse(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteConPesoExcesivo() {
        // Given
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(0.25, 0.25, 0.25, 20, "Ciudacleta");

        // When
        boolean puedeTransportar = bicicleta.puedeTransportar(paquete);

        // Then
        assertFalse(puedeTransportar);
    }

    @Test
    void debeAgregarPaqueteValidoCorrectamente() {
        // Given
        Bicicleta bicicleta = new Bicicleta();
        Paquete paquete = new Paquete(0.25, 0.25, 0.25, 10, "Ciudacleta");

        // When
        bicicleta.agregarPaquete(paquete);

        // Then
        assertEquals(1, bicicleta.getPaquetes().size());
    }

    @Test
    void debeRechazarPaqueteConDestinoDiferenteAlExistente() {
        // Given
        Bicicleta bicicleta = new Bicicleta();
        Paquete p1 = new Paquete(0.2, 0.2, 0.2, 5, "Ciudacleta");
        Paquete p2 = new Paquete(0.2, 0.2, 0.2, 5, "Santa Cleta");
        bicicleta.agregarPaquete(p1);

        // When
        boolean puedeTransportar = bicicleta.puedeTransportar(p2);

        // Then
        assertFalse(puedeTransportar);
    }
}
