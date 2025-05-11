package imaavalenzuela.empresatransporte;
import imaavalenzuela.empresatransporte.model.Paquete;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PaqueteTest {

    @Test
    void debeCalcularCorrectamenteElVolumenDelPaquete() {
        // Given
        Paquete paquete = new Paquete(2, 3, 4, 5, "Volumilandia");
        double volumenEsperado = 2 * 3 * 4;

        // When
        double volumenCalculado = paquete.calcularVolumen();

        // Then
        assertEquals(volumenEsperado, volumenCalculado);
    }

    @Test
    void debeRetornarValoresCorrectosConGettersYSetters() {
        // Given
        Paquete paquete = new Paquete(1, 2, 3, 4, "Seteolandia");

        // When
        paquete.setAlto(5);
        paquete.setAncho(6);
        paquete.setProfundidad(7);
        paquete.setPeso(8);
        paquete.setDestino("Seteolandia");

        // Then
        assertEquals(5, paquete.getAlto());
        assertEquals(6, paquete.getAncho());
        assertEquals(7, paquete.getProfundidad());
        assertEquals(8, paquete.getPeso());
        assertEquals("Seteolandia", paquete.getDestino());
    }
}
