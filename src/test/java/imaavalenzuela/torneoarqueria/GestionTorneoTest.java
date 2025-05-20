package imaavalenzuela.torneoarqueria;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import imaavalenzuela.torneoarqueria.model.Arquero;
import imaavalenzuela.torneoarqueria.model.Disparo;
import imaavalenzuela.torneoarqueria.service.GestionTorneo;

class GestionTorneoTest {

	@Test
	void debeMostrarPodioConTresArqueros() throws Exception {
	    // Given
		
		GestionTorneo torneo = new GestionTorneo();

	    Arquero a1 = new Arquero(1);
	    Arquero a2 = new Arquero(2);
	    Arquero a3 = new Arquero(3);

	    // When
	    for (int i = 0; i < 5; i++) a1.agregarDisparo(new Disparo(10, 0)); // 5 disparos de 1000 = 5000

	    for (int i = 0; i < 5; i++) a2.agregarDisparo(new Disparo(20, 0)); // 5 disparos de 500 = 2500

	    for (int i = 0; i < 5; i++) a3.agregarDisparo(new Disparo(30, 0)); // 5 disparos de 200 = 1000

	    torneo.agregarParticipante(a1);
	    torneo.agregarParticipante(a2);
	    torneo.agregarParticipante(a3);

	    // Then
	    String resultado = torneo.mostrarPodio();

	    String esperado = """
	        1° puesto: Arquero 1 con 5000 puntos.
	        2° puesto: Arquero 2 con 2500 puntos.
	        3° puesto: Arquero 3 con 1000 puntos.
	        """;

	    assertEquals(esperado, resultado);
	}
	
	@Test
	void debeMostrarDescalificadosSiUnArqueroTieneMenosDeCincoDisparos() throws Exception {
		// Given
	    GestionTorneo torneo = new GestionTorneo();

	    // When
	    Arquero a1 = new Arquero(1);
	    for (int i = 0; i < 4; i++) a1.agregarDisparo(new Disparo(0, 0)); // Solo 4 disparos
	    Arquero a2 = new Arquero(2);
	    for (int i = 0; i < 5; i++) a2.agregarDisparo(new Disparo(10, 0)); // Valido

	    torneo.agregarParticipante(a1);
	    torneo.agregarParticipante(a2);

	    // Then
	    String resultado = torneo.mostrarPodio();

	    assertEquals("Descalificados", resultado);
	}

}
