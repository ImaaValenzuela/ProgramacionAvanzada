package imaavalenzuela.empresatransporte;
import imaavalenzuela.empresatransporte.model.Automovil;
import imaavalenzuela.empresatransporte.model.Paquete;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AutomovilTest {
    @Test
    void debeAceptarPaqueteSiEstaDentroDeLimitesDePesoVolumenYDestinoUnico() {
        // Given
        Automovil automovil = new Automovil();
        Paquete paquete = new Paquete(1, 1, 1, 100, "Baticiudad");

        // When
        boolean puedeTransportar = automovil.puedeTransportar(paquete);

        // Then
        assertTrue(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteSiSuperaElLimiteDePeso() {
        // Given
        Automovil automovil = new Automovil();
        Paquete paquete = new Paquete(1, 1, 1, 600, "Baticiudad");

        // When
        boolean puedeTransportar = automovil.puedeTransportar(paquete);

        // Then
        assertFalse(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteConDestinoRepetido() {
        // Given
        Automovil automovil = new Automovil();
        Paquete paquete1 = new Paquete(1, 1, 1, 100, "Baticiudad");
        Paquete paquete2 = new Paquete(1, 1, 1, 100, "Baticiudad");
        automovil.agregarPaquete(paquete1);

        // When
        boolean puedeTransportar = automovil.puedeTransportar(paquete2);

        // Then
        assertFalse(puedeTransportar);
    }

    @Test
    void debeRechazarPaqueteSiYaHayTresDestinosDistintos() {
        // Given
        Automovil automovil = new Automovil();
        automovil.agregarPaquete(new Paquete(1, 1, 1, 100, "Baticiudad"));
        automovil.agregarPaquete(new Paquete(1, 1, 1, 100, "Paticiudad"));
        automovil.agregarPaquete(new Paquete(1, 1, 1, 100, "Gaticiudad"));
        Paquete nuevo = new Paquete(1, 1, 1, 100, "Bataciudad");

        // When
        boolean puedeTransportar = automovil.puedeTransportar(nuevo);

        // Then
        assertFalse(puedeTransportar);
    }
}
